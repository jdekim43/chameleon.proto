version = "${resolveVersion("initia")}-$buildNumber"

targetDependencies {
    dependencies.set {
        put("cosmos-sdk", project(":chameleon-proto-cosmos-sdk"))
        put("ibc-go/v8", project(":chameleon-proto-cosmos-ibc"))
    }
}

dependencies {
    include(project(":chameleon-proto-cosmos-sdk"))
    include(project(":chameleon-proto-cosmos-ibc"))
}

val polishContents = tasks.create("polishContents") {
    doLast {
        val typesFile = File(projectDir, "src/jvmMain/java/initia/move/v1/Types.java")
        var contents = "//modified by gradle task\n\n" + typesFile.readText()
        contents = contents.deleteStringBytesMethods(2, "key", "0x00000002")
            .deleteStringBytesMethods(3, "value", "0x00000004")

        typesFile.writeText(contents)
    }
}

tasks.getByName("moveProtoResults") {
    finalizedBy(polishContents)
}
