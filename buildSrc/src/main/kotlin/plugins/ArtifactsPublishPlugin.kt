package plugins

import isPublished
import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.provider.Property
import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.api.publish.maven.tasks.AbstractPublishToMaven
import org.gradle.api.tasks.TaskProvider
import org.gradle.api.tasks.bundling.Jar
import org.gradle.kotlin.dsl.*
import org.gradle.plugins.signing.SigningExtension
import setPublished
import java.io.File

interface ArtifactsPublishExtension {
    val name: Property<String>
    val description: Property<String>
    val projectUrl: Property<String>
    val repositoryUrl: Property<String>
    val developerId: Property<String>
    val developerName: Property<String>
    val developerEmail: Property<String>
}

private val ArtifactsPublishExtension.gitScmUrl: String?
    get() = repositoryUrl.orNull?.let { "scm:git:git" + it.dropWhile { it == ':' } }

class ArtifactsPublishPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        val extension = target.extensions.create<ArtifactsPublishExtension>("artifactsPublish").apply {
            name.convention(target.name)
        }

        target.applyPlugins()

        val javadocJar = target.addGenerateDocsTask()

        target.configurePublications(javadocJar, extension)
        target.configureSignging()
        target.configurePreventDoublePublication()
    }

    private fun Project.applyPlugins() {
        plugins.apply("org.jetbrains.dokka")
        plugins.apply("maven-publish")
        plugins.apply("signing")
    }

    private fun Project.addGenerateDocsTask(): TaskProvider<Jar> {
        val dokkaHtml by tasks.getting(org.jetbrains.dokka.gradle.DokkaTask::class)
        val javadocJar: TaskProvider<Jar> by tasks.registering(Jar::class) {
            isZip64 = true
            dependsOn(dokkaHtml)
            archiveClassifier.set("javadoc")
            from(dokkaHtml.outputDirectory)
        }

        return javadocJar
    }

    private fun Project.configurePublications(javadocJar: TaskProvider<Jar>, extension: ArtifactsPublishExtension) {
        extensions.getByType<PublishingExtension>().run {
            publications.withType<MavenPublication> {
                artifact(javadocJar)
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

        afterEvaluate {
            extensions.getByType<PublishingExtension>().run {
                publications.withType<MavenPublication> {
                    pom {
                        name.set(extension.name.get())
                        description.set(extension.description.get())
                        url.set(extension.projectUrl.get())
                        licenses {
                            license {
                                name.set("The Apache License, Version 2.0")
                                url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                            }
                        }
                        developers {
                            developer {
                                id.set(extension.developerId.orNull)
                                name.set(extension.developerName.orNull)
                                email.set(extension.developerEmail.orNull)
                            }
                        }
                        scm {
                            connection.set(extension.gitScmUrl)
                            url.set(extension.repositoryUrl.get())
                        }
                    }
                }
            }
        }
    }

    private fun Project.configureSignging() {
        extensions.getByType<SigningExtension>().run {
            sign(extensions.getByType<PublishingExtension>().publications)
        }
    }

    private fun Project.configurePreventDoublePublication() {
        tasks.withType<AbstractPublishToMaven> {
            onlyIf {
                return@onlyIf !isPublished(name, publication.artifactId, publication.version)
            }

            doLast {
                setPublished(name, publication.artifactId, publication.version)
            }
        }
    }
}