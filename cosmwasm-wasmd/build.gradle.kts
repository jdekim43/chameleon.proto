version = "${resolveVersion("cosmwasm-wasmd")}-$buildNumber"

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
    protobufTypeRegistry.set("cosmwasm.wasmd.TypeRegistry")
    protobufJvmTypeRegistry.set("cosmwasm.wasmd.JvmTypeRegistry")
    protobufSerializersModules.set("cosmwasm.wasmd.SerializersModules")
}
