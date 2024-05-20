version = "${resolveVersion("terra-classic-core")}-$buildNumber"

targetDependencies {
    dependencies.add("cosmos-sdk" to project(":chameleon-proto-cosmos-sdk"))
}

dependencies {
    include(project(":chameleon-proto-cosmos-sdk"))
}
