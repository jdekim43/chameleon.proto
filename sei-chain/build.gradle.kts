version = "${resolveVersion("sei-chain")}-$buildNumber"

targetDependencies {
    dependencies.add("cosmos-proto" to project(":chameleon-proto-cosmos-proto"))
    dependencies.add("cosmos-sdk" to project(":chameleon-proto-cosmos-sdk"))
    dependencies.add("wasmd" to project(":chameleon-proto-cosmwasm-wasmd"))
}

dependencies {
    include(project(":chameleon-proto-cosmos-proto"))
    include(project(":chameleon-proto-cosmos-sdk"))
    include(project(":chameleon-proto-cosmwasm-wasmd"))
}
