plugins {
    id("protobuf-artifacts")
    id("artifacts-publish")
    id("dependency-manager")
}

allprojects {
    repositories {
        mavenCentral()
        mavenLocal()
    }

    group = "kr.jadekim"

    apply {
        plugin("protobuf-artifacts")
        plugin("artifacts-publish")
        plugin("dependency-manager")
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

    tasks.create("printVersion") {
        doLast { println(version) }
    }
}
