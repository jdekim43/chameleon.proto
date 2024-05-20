package plugins

import Versions
import com.google.protobuf.gradle.ProtobufExtension
import com.google.protobuf.gradle.id
import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.Configuration
import org.gradle.api.provider.ListProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Copy
import org.gradle.kotlin.dsl.create
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType
import org.gradle.kotlin.dsl.register
import org.gradle.model.Mutate
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import java.io.File

interface ProtobufArtifactsExtension {
    val jvmVersion: Property<JavaVersion>

    val targetDirectory: Property<File>
    val protobufPath: Property<File>

    val protobufTypeRegistry: Property<String>
    val protobufJvmTypeRegistry: Property<String>
    val protobufSerializersModules: Property<String>

    val enableGrpc: Property<Boolean>
    val enableGrpcGateway: Property<Boolean>

    val copy: Property<Boolean>
}

class ProtobufArtifactsPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        val extension = target.extensions.create<ProtobufArtifactsExtension>("protobufArtifacts").apply {
            jvmVersion.convention(JavaVersion.VERSION_11)

            targetDirectory.convention(File(target.projectDir, "target"))
            protobufPath.convention(File(targetDirectory.get(), "proto"))

            enableGrpc.convention(false)
            enableGrpcGateway.convention(false)
        }

        target.applyPlugins()

        val includeProjects = target.configurations.create("include") {
            setVisible(false)

            isCanBeConsumed = false
            isCanBeResolved = false
        }

        target.configurations.getByName("compileProtoPath") {
            extendsFrom(includeProjects)
        }

        target.configurations.getByName("commonMainApi") {
            extendsFrom(includeProjects)
        }

        target.configureJvmVersion(extension.jvmVersion.get())
        target.configureSourceDirectory()

        target.addLibraryDependencies(extension)
        target.addDependencies(extension)

        target.configureProtobuf(extension)
        target.configureTaskDependent()

        if (extension.copy.getOrElse(false)) {
            target.addCopyTasks()
        }
    }

    private fun Project.applyPlugins() {
        plugins.apply("org.gradle.java-library")
        plugins.apply("org.jetbrains.kotlin.multiplatform")
        plugins.apply("org.jetbrains.kotlin.plugin.serialization")
        plugins.apply("com.google.protobuf")
    }

    private fun Project.configureJvmVersion(version: JavaVersion) {
        extensions.getByType<KotlinMultiplatformExtension>().run {
            jvm {
                withJava()
                jvmToolchain(version.ordinal + 1)
            }
        }
    }

    private fun Project.configureTaskDependent() {
        tasks.getByName("compileJava") {
            dependsOn("generateProto")
        }
    }

    private fun Project.configureSourceDirectory() {
        extensions.getByType<KotlinMultiplatformExtension>().run {
            sourceSets.commonMain {
                kotlin.srcDir(File(buildDir, "generated/source/proto/main/commonMain"))
                resources.srcDir(File(buildDir, "extracted-protos/main"))
            }
            sourceSets.jvmMain {
                kotlin.srcDir(File(buildDir, "generated/source/proto/main/jvmMain/java"))
                kotlin.srcDir(File(buildDir, "generated/source/proto/main/jvmMain/kotlin"))
            }
        }
    }

    private fun Project.addLibraryDependencies(extension: ProtobufArtifactsExtension) {
        dependencies {
            "implementation"("com.google.protobuf:protobuf-java:${Versions.protobuf}")

            if (extension.enableGrpc.get()) {
                "implementation"("io.grpc:grpc-protobuf:${Versions.grpc}")
            }
        }
        extensions.getByType<KotlinMultiplatformExtension>().run {
            sourceSets.commonMain.dependencies {
                api("kr.jadekim:kotlin-protobuf-prebuilt-kotlinx:${Versions.kotlinProtobuf}")
                api("kr.jadekim:kotlin-protobuf-core:${Versions.kotlinProtobuf}")
                api("kr.jadekim:kotlin-protobuf-kotlinx:${Versions.kotlinProtobuf}")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:${Versions.kotlinxSerialization}")

                if (extension.enableGrpc.get()) {
                    api("kr.jadekim:kotlin-protobuf-grpc:${Versions.kotlinProtobuf}")
                }

                if (extension.enableGrpcGateway.get()) {
                    api("kr.jadekim:kotlin-protobuf-grpc-gateway:${Versions.kotlinProtobuf}")
                }
            }
            sourceSets.jvmMain.dependencies {
                implementation("com.google.protobuf:protobuf-java:${Versions.protobuf}")

                if (extension.enableGrpcGateway.get()) {
                    implementation("com.google.protobuf:protobuf-java-util:${Versions.protobuf}")
                }

                if (extension.enableGrpc.get()) {
                    implementation("io.grpc:grpc-protobuf:${Versions.grpc}")
                    implementation("io.grpc:grpc-stub:${Versions.grpc}")
                    implementation("io.grpc:grpc-kotlin-stub:${Versions.grpcKotlin}")
                }
            }
        }
    }

    private fun Project.addDependencies(extension: ProtobufArtifactsExtension) {
        dependencies {
            "protobuf"(files(extension.protobufPath))
        }
    }

    private fun Project.configureProtobuf(extension: ProtobufArtifactsExtension) {
        extensions.getByType<ProtobufExtension>().run {
            protoc {
                artifact = "com.google.protobuf:protoc:${Versions.protobuf}"
            }

            plugins {
                id("kotlin-protobuf-kotlinx") {
                    artifact = "kr.jadekim:kotlin-protobuf-generator-kotlinx:${Versions.kotlinProtobuf}:jdk8@jar"
                }
                id("kotlin-protobuf-converter-multiplatform") {
                    artifact =
                        "kr.jadekim:kotlin-protobuf-generator-converter-multiplatform:${Versions.kotlinProtobuf}:jdk8@jar"
                }
                id("kotlin-protobuf-converter-multiplatform-jvm") {
                    artifact =
                        "kr.jadekim:kotlin-protobuf-generator-converter-multiplatform-jvm:${Versions.kotlinProtobuf}:jdk8@jar"
                }

                id("grpc") {
                    artifact = "io.grpc:protoc-gen-grpc-java:${Versions.grpc}"
                }
                id("kotlin-protobuf-grpc-multiplatform") {
                    artifact =
                        "kr.jadekim:kotlin-protobuf-generator-grpc-multiplatform:${Versions.kotlinProtobuf}:jdk8@jar"
                }
                id("kotlin-protobuf-grpc-multiplatform-jvm") {
                    artifact =
                        "kr.jadekim:kotlin-protobuf-generator-grpc-multiplatform-jvm:${Versions.kotlinProtobuf}:jdk8@jar"
                }

                id("kotlin-protobuf-grpc-gateway") {
                    artifact = "kr.jadekim:kotlin-protobuf-generator-grpc-gateway:${Versions.kotlinProtobuf}:jdk8@jar"
                }
            }

            generateProtoTasks {
                all().forEach {
                    it.builtins {
                        getByName("java").outputSubDir = "jvmMain/java"
                    }
                    it.plugins {
                        id("kotlin-protobuf-kotlinx") {
                            outputSubDir = "commonMain/kotlin"
                            extension.protobufTypeRegistry.orNull?.let {
                                option("kotlin-protobuf.type_registry=$it")
                            }
                            extension.protobufSerializersModules.orNull?.let {
                                option("kotlin-protobuf.serializers_module=$it")
                            }
                        }
                        id("kotlin-protobuf-converter-multiplatform") {
                            outputSubDir = "commonMain/kotlin"
                        }
                        id("kotlin-protobuf-converter-multiplatform-jvm") {
                            outputSubDir = "jvmMain/kotlin"
                            extension.protobufJvmTypeRegistry.orNull?.let {
                                option("kotlin-protobuf.jvm_type_registry=$it")
                            }
                        }

                        if (extension.enableGrpc.get()) {
                            id("grpc") {
                                outputSubDir = "jvmMain/java"
                            }
                            id("kotlin-protobuf-grpc-multiplatform") {
                                outputSubDir = "commonMain/kotlin"
                            }
                            id("kotlin-protobuf-grpc-multiplatform-jvm") {
                                outputSubDir = "jvmMain/kotlin"
                            }
                        }

                        if (extension.enableGrpcGateway.get()) {
                            id("kotlin-protobuf-grpc-gateway") {
                                outputSubDir = "commonMain/kotlin"
                            }
                        }
                    }
                }
            }
        }
    }

    private fun Project.addCopyTasks() {
        val copyTask = tasks.register<Copy>("moveProtoResults") {
            from(File(buildDir, "generated/source/proto/main"))
            into(File(projectDir, "src"))
        }

        val cleanProtoTask = tasks.create("cleanProto") {
            group = "other"

            doLast {
                delete(File(projectDir, "src/commonMain"))
                delete(File(projectDir, "src/jvmMain"))
            }
        }

        tasks.getByName("generateProto") {
            dependsOn(cleanProtoTask)
            finalizedBy(copyTask)
        }
    }
}