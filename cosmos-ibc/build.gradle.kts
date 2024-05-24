version = "${resolveVersion("cosmos-ibc")}-$buildNumber"

targetDependencies {
    dependencies.set {
        put("cosmos-proto", project(":chameleon-proto-cosmos-proto"))
        put("cosmos-sdk", project(":chameleon-proto-cosmos-sdk"))
        put("ics23/go", project(":chameleon-proto-cosmos-ics23"))
    }
}

dependencies {
    dependsOn(project(":chameleon-proto-gogoproto"))
    dependsOn(project(":chameleon-proto-cosmos-proto"))
    dependsOn(project(":chameleon-proto-cosmos-sdk"))
    dependsOn(project(":chameleon-proto-cosmos-ics23"))
}

protobufArtifacts {
    protobufTypeRegistry.set("cosmos.ibc.TypeRegistry")
    protobufJvmTypeRegistry.set("cosmos.ibc.JvmTypeRegistry")
    protobufSerializersModules.set("cosmos.ibc.SerializersModules")
}
