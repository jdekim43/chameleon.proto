version = "${resolveVersion("sei-chain", prefix = "")}-$buildNumber"

targetDependencies {
    checkoutTagPrefix.set("")

    dependencies.set {
        put("cosmos-proto", project(":chameleon-proto-cosmos-proto"))
        put("cosmos-sdk", project(":chameleon-proto-cosmos-sdk"))
        put("wasmd", project(":chameleon-proto-cosmwasm-wasmd"))
    }
}

dependencies {
    dependsOn(project(":chameleon-proto-gogoproto"))
    dependsOn(project(":chameleon-proto-cosmos-proto"))
    dependsOn(project(":chameleon-proto-cosmos-sdk"))
    dependsOn(project(":chameleon-proto-cosmwasm-wasmd"))
}

protobufArtifacts {
    protobufTypeRegistry.set("sei.TypeRegistry")
    protobufJvmTypeRegistry.set("sei.JvmTypeRegistry")
    protobufSerializersModules.set("sei.SerializersModules")
}
