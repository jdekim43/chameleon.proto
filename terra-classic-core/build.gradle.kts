version = "${resolveVersion("terra-classic-core")}-$buildNumber"

targetDependencies {
    dependencies.set {
        put("cosmos-sdk", project(":chameleon-proto-cosmos-sdk"))
    }
}

dependencies {
    include(project(":chameleon-proto-cosmos-sdk"))
}
