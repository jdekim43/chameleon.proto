version = "${resolveVersion("cosmos-sdk")}-$buildNumber"

targetDependencies {
    dependencies.add("cosmos-proto" to project(":chameleon-proto-cosmos-proto"))
}

dependencies {
    include(project(":chameleon-proto-google-api"))
    include(project(":chameleon-proto-gogoproto"))
    include(project(":chameleon-proto-cosmos-proto"))
}

tasks.withType<Jar> {
    isZip64 = true
}
