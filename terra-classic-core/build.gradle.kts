version = "${resolveVersion("terra-classic-core")}-$buildNumber"

targetDependencies {
    dependencies.set {
        put("cosmos-sdk", project(":chameleon-proto-cosmos-sdk"))
        put("cosmos-proto", project(":chameleon-proto-cosmos-proto"))
    }
}

dependencies {
    dependsOn(project(":chameleon-proto-gogoproto"))
    dependsOn(project(":chameleon-proto-cosmos-proto"))
    dependsOn(project(":chameleon-proto-cosmos-sdk"))
}

protobufArtifacts {
    protobufTypeRegistry.set("terra.classic.core.TypeRegistry")
    protobufJvmTypeRegistry.set("terra.classic.core.JvmTypeRegistry")
    protobufSerializersModules.set("terra.classic.core.SerializersModules")
}
