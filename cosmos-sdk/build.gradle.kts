version = "${resolveVersion("cosmos-sdk")}-$buildNumber"

protobufArtifacts {
    enableGrpc.set(true)
    enableGrpcGateway.set(true)
}

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