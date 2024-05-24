version = "${resolveVersion("cosmwasm-wasmd")}-$buildNumber"

targetDependencies {
    dependencies.set {
        put("cosmos-proto", project(":chameleon-proto-cosmos-proto"))
        put("cosmos-sdk", project(":chameleon-proto-cosmos-sdk"))
    }
}

dependencies {
    implementation(project(":chameleon-proto-cosmos-proto"))
    implementation(project(":chameleon-proto-cosmos-sdk"))
}

kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                api(project(":chameleon-proto-cosmos-sdk"))
            }
        }
    }
}
