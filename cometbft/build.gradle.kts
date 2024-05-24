version = "${resolveVersion("cometbft")}-$buildNumber"

dependencies {
    include(project(":chameleon-proto-gogoproto"))
}
