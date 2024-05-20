version = "${resolveVersion("tendermint")}-$buildNumber"

dependencies {
    include(project(":chameleon-proto-google-api"))
    include(project(":chameleon-proto-gogoproto"))
}
