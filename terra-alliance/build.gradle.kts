version = "${resolveVersion("terra-alliance")}-$buildNumber"

targetDependencies {
    dependencies.set {
        put("cosmos-proto", project(":chameleon-proto-cosmos-proto"))
        put("cosmos-sdk", project(":chameleon-proto-cosmos-sdk"))
    }
}

dependencies {
    dependsOn(project(":chameleon-proto-gogoproto"))
    dependsOn(project(":chameleon-proto-cosmos-proto"))
    dependsOn(project(":chameleon-proto-cosmos-sdk"))
}

protobufArtifacts {
    protobufTypeRegistry.set("terra.alliance.TypeRegistry")
    protobufJvmTypeRegistry.set("terra.alliance.JvmTypeRegistry")
    protobufSerializersModules.set("terra.alliance.SerializersModules")
}
