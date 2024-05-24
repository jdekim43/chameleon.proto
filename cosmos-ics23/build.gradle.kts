version = "${resolveVersion("cosmos-ics23", prefix="go/v")}-$buildNumber"

targetDependencies {
    checkoutTagPrefix.set("go/v")
}

protobufArtifacts {
    protobufTypeRegistry.set("cosmos.ics23.TypeRegistry")
    protobufJvmTypeRegistry.set("cosmos.ics23.JvmTypeRegistry")
    protobufSerializersModules.set("cosmos.ics23.SerializersModules")
}
