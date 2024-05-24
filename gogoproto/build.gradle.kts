version = "1.4.10-$buildNumber"

protobufArtifacts {
    protobufPath.set(File(projectDir, "target"))
}

protobufArtifacts {
    protobufTypeRegistry.set("googproto.TypeRegistry")
    protobufJvmTypeRegistry.set("gogoproto.JvmTypeRegistry")
    protobufSerializersModules.set("gogoproto.SerializersModules")
}
