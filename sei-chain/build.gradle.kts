version = "${resolveVersion("sei-chain", prefix = "")}-$buildNumber"

targetDependencies {
    checkoutTagPrefix.set("")

    dependencies.set {
        put("cosmos-proto", project(":chameleon-proto-cosmos-proto"))
        put("cosmos-sdk", project(":chameleon-proto-cosmos-sdk"))
        put("wasmd", project(":chameleon-proto-cosmwasm-wasmd"))
    }
}

dependencies {
    include(project(":chameleon-proto-cosmos-proto"))
    include(project(":chameleon-proto-cosmos-sdk"))
    include(project(":chameleon-proto-cosmwasm-wasmd"))
}
