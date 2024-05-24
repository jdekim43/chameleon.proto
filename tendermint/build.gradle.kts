version = "${resolveVersion("tendermint")}-$buildNumber"

dependencies {
    dependsOn(project(":chameleon-proto-google-api"))
    dependsOn(project(":chameleon-proto-gogoproto"))
}

protobufArtifacts {
    protobufTypeRegistry.set("tendermint.TypeRegistry")
    protobufJvmTypeRegistry.set("tendermint.JvmTypeRegistry")
    protobufSerializersModules.set("tendermint.SerializersModules")
}
