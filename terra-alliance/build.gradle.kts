version = "${resolveVersion("terra-alliance")}-$buildNumber"

targetDependencies {
    dependencies.set {
        put("cosmos-proto", project(":chameleon-proto-cosmos-proto"))
        put("cosmos-sdk", project(":chameleon-proto-cosmos-sdk"))
    }
}

dependencies {
    include(project(":chameleon-proto-cosmos-proto"))
    include(project(":chameleon-proto-cosmos-sdk"))
}
