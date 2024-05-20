version = "${resolveVersion("cosmwasm-wasmd")}-$buildNumber"

targetDependencies {
    dependencies.add("cosmos-proto" to project(":chameleon-proto-cosmos-proto"))
    dependencies.add("cosmos-sdk" to project(":chameleon-proto-cosmos-sdk"))
}

dependencies {
    include(project(":chameleon-proto-cosmos-proto"))
    include(project(":chameleon-proto-cosmos-sdk"))
}