version = "${resolveVersion("cosmos-ibc")}-$buildNumber"

targetDependencies {
    dependencies.set {
        put("cosmos-sdk", project(":chameleon-proto-cosmos-sdk"))
        put("ics23/go", project(":chameleon-proto-cosmos-ics23"))
    }
}

dependencies {
    include(project(":chameleon-proto-cosmos-sdk"))
    include(project(":chameleon-proto-cosmos-ics23"))
}
