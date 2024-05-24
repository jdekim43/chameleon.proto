val resolvedVersion = resolveVersion("cosmos-sdk")
val isDependTendermint: Boolean = resolvedVersion.split('.')
    .take(2)
    .map(String::toInt)
    .let { (major, minor) -> major == 0 && minor < 46 }

version = "$resolvedVersion-$buildNumber"

targetDependencies {
    dependencies.set {
        put("cosmos-proto", project(":chameleon-proto-cosmos-proto"))

        if (isDependTendermint) {
            put("tendermint", project(":chameleon-proto-tendermint"))
        }
    }
}

dependencies {
    dependsOn(project(":chameleon-proto-google-api"))
    dependsOn(project(":chameleon-proto-gogoproto"))
    dependsOn(project(":chameleon-proto-cosmos-proto"))

    if (isDependTendermint) {
        dependsOn(project(":chameleon-proto-tendermint"))
    }
}

protobufArtifacts {
    protobufTypeRegistry.set("cosmos.sdk.TypeRegistry")
    protobufJvmTypeRegistry.set("cosmos.sdk.JvmTypeRegistry")
    protobufSerializersModules.set("cosmos.sdk.SerializersModules")
}

tasks.withType<Jar> {
    isZip64 = true
}
