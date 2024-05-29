version = "${resolveVersion("terra-alliance")}-$buildNumber"

targetDependencies {
    dependencies.set {
        put("cosmos-proto", project(":chameleon-proto-cosmos-proto"))
        put("cosmos-sdk", project(":chameleon-proto-cosmos-sdk"))
        put("wasmd", project(":chameleon-proto-cosmwasm-wasmd"))
        put("alliance", project(":chameleon-proto-terra-alliance"))
    }
}

dependencies {
    dependsOn(project(":chameleon-proto-gogoproto"))
    dependsOn(project(":chameleon-proto-cosmos-proto"))
    dependsOn(project(":chameleon-proto-cosmos-sdk"))
    dependsOn(project(":chameleon-proto-cosmwasm-wasmd"))
    dependsOn(project(":chameleon-proto-terra-alliance"))
}

protobufArtifacts {
    protobufTypeRegistry.set("terra.core.TypeRegistry")
    protobufJvmTypeRegistry.set("terra.core.JvmTypeRegistry")
    protobufSerializersModules.set("terra.core.SerializersModules")
}
