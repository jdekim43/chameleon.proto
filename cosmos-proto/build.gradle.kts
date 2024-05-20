fun isLegacyVersion(): Boolean {
    return if (project.extra.has("targetVersion")) {
        val targetVersion = project.extra["targetVersion"] as String
        return !targetVersion.startsWith("1.")
    } else {
        false
    }
}

fun selectTargetDirectory(): String = if (isLegacyVersion()) "target-regen" else "target"

version = "${resolveVersion("cosmos-proto", selectTargetDirectory())}-$buildNumber"

protobufArtifacts {
    targetDirectory.set(File(projectDir, selectTargetDirectory()))

    if (isLegacyVersion()) {
        protobufPath.set(targetDirectory.get())
    } else {
        protobufPath.set(File(targetDirectory.get(), "proto"))
    }
}

targetDependencies {
    selectTargetDirectory.set { File(projectDir, selectTargetDirectory()) }
}
