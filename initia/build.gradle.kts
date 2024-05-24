version = "${resolveVersion("initia")}-$buildNumber"

targetDependencies {
    dependencies.set {
        put("cosmos-proto", project(":chameleon-proto-cosmos-proto"))
        put("cosmos-sdk", project(":chameleon-proto-cosmos-sdk"))
        put("ibc-go/v8", project(":chameleon-proto-cosmos-ibc"))
    }
}

dependencies {
    dependsOn(project(":chameleon-proto-gogoproto"))
    dependsOn(project(":chameleon-proto-cosmos-proto"))
    dependsOn(project(":chameleon-proto-cosmos-sdk"))
    dependsOn(project(":chameleon-proto-cosmos-ibc"))
}

protobufArtifacts {
    protobufTypeRegistry.set("initia.TypeRegistry")
    protobufJvmTypeRegistry.set("initia.JvmTypeRegistry")
    protobufSerializersModules.set("initia.SerializersModules")
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
