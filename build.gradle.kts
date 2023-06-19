import com.google.protobuf.gradle.id
import java.io.BufferedReader
import java.io.InputStreamReader

plugins {
    kotlin("multiplatform") version "1.8.20"
    kotlin("plugin.serialization") version "1.8.20"
    id("org.jetbrains.dokka") version "1.8.10"
    id("maven-publish")
    id("signing")
    id("com.google.protobuf") version "0.9.3"
    `java-library`
}

allprojects {
    repositories {
        mavenCentral()
        mavenLocal()
    }

    group = "kr.jadekim"

    apply {
        plugin("kotlin-multiplatform")
        plugin("org.jetbrains.kotlin.plugin.serialization")
        plugin("com.google.protobuf")
        plugin("java-library")
        plugin("org.jetbrains.dokka")
        plugin("maven-publish")
        plugin("signing")
    }

    kotlin {
        jvm {
            withJava()
            jvmToolchain(11)
        }

        sourceSets {
            val commonMain by getting {
                resources.srcDir(File(buildDir, "extracted-protos/main"))

                dependencies {
                    val kotlinProtobufVersion: String by project
                    val kotlinxSerializationVersion: String by project

                    api("kr.jadekim:kotlin-protobuf-prebuilt-kotlinx:$kotlinProtobufVersion")
                    api("kr.jadekim:kotlin-protobuf-core:$kotlinProtobufVersion")
                    api("kr.jadekim:kotlin-protobuf-grpc:$kotlinProtobufVersion")
                    implementation("kr.jadekim:kotlin-protobuf-kotlinx:$kotlinProtobufVersion")
                    implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:$kotlinxSerializationVersion")
                }
            }

            val jvmMain by getting {
                dependencies {
                    val protobufVersion: String by project
                    val grpcVersion: String by project
                    val grpcKotlinVersion: String by project

                    implementation("com.google.protobuf:protobuf-java:$protobufVersion")
                    implementation("io.grpc:grpc-protobuf:$grpcVersion")
                    implementation("io.grpc:grpc-stub:$grpcVersion")
                    implementation("io.grpc:grpc-kotlin-stub:$grpcKotlinVersion")
                }
            }
        }
    }

    dependencies {
        val protobufVersion: String by project
        val grpcVersion: String by project

        implementation("com.google.protobuf:protobuf-java:$protobufVersion")
        implementation("io.grpc:grpc-protobuf:$grpcVersion")
    }

    protobuf {
        protoc {
            val protobufVersion: String by project

            artifact = "com.google.protobuf:protoc:$protobufVersion"
        }

        plugins {
            val kotlinProtobufVersion: String by project

            id("kotlin-protobuf-kotlinx") {
                artifact = "kr.jadekim:kotlin-protobuf-generator-kotlinx:$kotlinProtobufVersion:jdk8@jar"
            }
            id("kotlin-protobuf-converter-multiplatform") {
                artifact = "kr.jadekim:kotlin-protobuf-generator-converter-multiplatform:$kotlinProtobufVersion:jdk8@jar"
            }
            id("kotlin-protobuf-converter-multiplatform-jvm") {
                artifact = "kr.jadekim:kotlin-protobuf-generator-converter-multiplatform-jvm:$kotlinProtobufVersion:jdk8@jar"
            }

            id("grpc") {
                val grpcVersion: String by project
                artifact = "io.grpc:protoc-gen-grpc-java:$grpcVersion"
            }
            id("kotlin-protobuf-grpc-multiplatform") {
                artifact = "kr.jadekim:kotlin-protobuf-generator-grpc-multiplatform:$kotlinProtobufVersion:jdk8@jar"
            }
            id("kotlin-protobuf-grpc-multiplatform-jvm") {
                artifact = "kr.jadekim:kotlin-protobuf-generator-grpc-multiplatform-jvm:$kotlinProtobufVersion:jdk8@jar"
            }
        }

        generateProtoTasks {
            all().forEach {
                it.builtins {
                    get("java").outputSubDir = "jvmMain/java"
                }
                it.plugins {
                    id("kotlin-protobuf-kotlinx") {
                        outputSubDir = "commonMain/kotlin"
                    }
                    id("kotlin-protobuf-converter-multiplatform") {
                        outputSubDir = "commonMain/kotlin"
                    }
                    id("kotlin-protobuf-converter-multiplatform-jvm") {
                        outputSubDir = "jvmMain/kotlin"
                    }

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
            }
        }
    }

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

    gradle.taskGraph.whenReady {
        allTasks.filter { it.name.contains("proto", true) }
            .forEach { it.outputs.upToDateWhen { false } }
    }

    val dokkaHtml by tasks.getting(org.jetbrains.dokka.gradle.DokkaTask::class)
    val javadocJar: TaskProvider<Jar> by tasks.registering(Jar::class) {
        dependsOn(dokkaHtml)
        archiveClassifier.set("javadoc")
        from(dokkaHtml.outputDirectory)
    }

    publishing {
        publications.withType<MavenPublication> {
            artifact(javadocJar)
            pom {
                name.set(project.name)
                description.set("Crypto Wallet SDK for multiple blockchains")
                url.set("https://github.com/jdekim43/chameleon")
                licenses {
                    license {
                        name.set("The Apache License, Version 2.0")
                        url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                    }
                }
                developers {
                    developer {
                        id.set("jdekim43")
                        name.set("Jade Kim")
                    }
                }
                scm {
                    connection.set("scm:git:git://github.com/jdekim43/chameleon.git")
                    developerConnection.set("scm:git:git://github.com/jdekim43/chameleon.git")
                    url.set("https://github.com/jdekim43/chameleon")
                }
            }
        }

        repositories {
            val ossrhUsername: String by project
            val ossrhPassword: String by project

            if (version.toString().endsWith("-SNAPSHOT", true)) {
                maven {
                    name = "mavenCentralSnapshot"
                    setUrl("https://s01.oss.sonatype.org/content/repositories/snapshots/")
                    credentials {
                        username = ossrhUsername
                        password = ossrhPassword
                    }
                }
            } else {
                maven {
                    name = "mavenCentral"
                    setUrl("https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/")
                    credentials {
                        username = ossrhUsername
                        password = ossrhPassword
                    }
                }
            }
        }
    }

    signing {
        sign(publishing.publications)
    }
}
