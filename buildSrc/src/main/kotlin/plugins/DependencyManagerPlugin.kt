package plugins

import checkoutTarget
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.provider.ListProperty
import org.gradle.api.provider.Property
import org.gradle.kotlin.dsl.create
import org.gradle.kotlin.dsl.extra
import resolveDependencyVersion
import resolveVersion
import java.io.File

interface TargetDependenciesExtension {
    val selectTargetDirectory: Property<() -> File>
    val targetVersion: Property<String>
    val checkoutTagPrefix: Property<String>

    val dependencies: Property<MutableMap<String, Project>.() -> Unit>
}

private fun TargetDependenciesExtension.getDependencies(): Map<String, Project> {
    return mutableMapOf<String, Project>().apply {
        dependencies.get()()
    }
}

class DependencyManagerPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        val extension = target.extensions.create<TargetDependenciesExtension>("targetDependencies").apply {
            selectTargetDirectory.convention { File(target.projectDir, "target") }
            targetVersion.convention(null as String?)
            checkoutTagPrefix.convention("v")

            dependencies.convention {}
        }

        val checkoutDependenciesTask = target.tasks.register("checkoutDependencies") {
            group = "dependency"

            doLast {
                for ((dependencyName, dependencyProject) in extension.getDependencies()) {
                    val targetDirectory = extension.selectTargetDirectory.get()().toRelativeString(target.projectDir)
                    val dependencyVersion = target.resolveDependencyVersion(dependencyName, targetDirectory)
                    println("${target.name} depends on $dependencyName@$dependencyVersion")

                    if (!dependencyProject.extra.has("targetVersion")) {
                        dependencyProject.extra.set("targetVersion", dependencyVersion)
                    }
                }
            }

            val checkoutDependencies = extension.getDependencies()
                .map { it.value.tasks.getByName("checkout") }
            finalizedBy(checkoutDependencies)
        }

        target.tasks.register("checkout") {
            group = "dependency"
            
            doFirst {
                val targetDirectory = extension.selectTargetDirectory.get()().toRelativeString(target.projectDir)
                val currentVersion = target.resolveVersion(subDirectory = targetDirectory, prefix = extension.checkoutTagPrefix.get())
                val targetVersion: String? = if (target.extra.has("targetVersion")) {
                    target.extra["targetVersion"] as String
                } else extension.targetVersion.orNull

                println("${target.name}: current = $currentVersion, target = $targetVersion")

                if (targetVersion == null || targetVersion == currentVersion) {
                    return@doFirst
                }

                target.checkoutTarget("${extension.checkoutTagPrefix.get()}$targetVersion", targetDirectory)

                val checkoutVersion = target.resolveVersion(subDirectory = targetDirectory, prefix = extension.checkoutTagPrefix.get())
                if (targetVersion != checkoutVersion) {
                    throw IllegalStateException("Fail to verify checkout version (expect=$targetVersion, now=$checkoutVersion)")
                }
            }
            finalizedBy(":clean", checkoutDependenciesTask)
        }
    }
}