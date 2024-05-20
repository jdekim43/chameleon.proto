plugins {
    id("dependency-manager")
    id("protobuf-artifacts")
    id("artifacts-publish")
}

allprojects {
    repositories {
        mavenCentral()
        mavenLocal()
    }

    group = "kr.jadekim"
}

subprojects {
    apply {
        plugin("dependency-manager")
        plugin("protobuf-artifacts")
        plugin("artifacts-publish")
    }

    artifactsPublish {
        description.set("Crypto Wallet SDK")
        projectUrl.set("https://github.com/jdekim43/chameleon")
        repositoryUrl.set("https://github.com/jdekim43/chameleon.git")
        developerName.set("Jade Kim")
        developerEmail.set("me@jade.kim")
    }

    gradle.taskGraph.whenReady {
        allTasks.filter { it.name.contains("proto", true) }
            .forEach { it.outputs.upToDateWhen { false } }
    }
}
