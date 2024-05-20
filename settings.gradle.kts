rootProject.name = "chameleon-proto"

include(
    ":google-api",
    ":gogoproto",
    ":cosmos-proto",
    ":cosmos-sdk",
    ":tendermint",
    ":cosmwasm-wasmd",
    ":terra-classic-core",
    ":terra-alliance",
    ":sei-chain",
    ":injective-core",
    ":initia",
)

fun ProjectDescriptor.renameChildren() {
    children.forEach {
        val origin = it.name
        if (it.parent != null) {
            it.name = it.parent!!.name + "-" + it.name
        }
        println("$origin to ${it.name} : ${it.path}")
        it.renameChildren()
    }
}

rootProject.renameChildren()
