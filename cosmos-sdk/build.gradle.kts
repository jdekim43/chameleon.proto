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
    include(project(":chameleon-proto-google-api"))
    include(project(":chameleon-proto-gogoproto"))
    include(project(":chameleon-proto-cosmos-proto"))

    if (isDependTendermint) {
        include(project(":chameleon-proto-tendermint"))
    }
}

tasks.withType<Jar> {
    isZip64 = true
}
