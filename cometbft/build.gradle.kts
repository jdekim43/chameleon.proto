version = "${resolveVersion("cometbft")}-$buildNumber"

dependencies {
    dependsOn(project(":chameleon-proto-gogoproto"))
}

protobufArtifacts {
    protobufTypeRegistry.set("cometbft.TypeRegistry")
    protobufJvmTypeRegistry.set("cometbft.JvmTypeRegistry")
    protobufSerializersModules.set("cometbft.SerializersModules")
}
