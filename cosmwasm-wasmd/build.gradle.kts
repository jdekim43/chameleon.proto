version = "${resolveVersion("cosmwasm-wasmd")}-$buildNumber"

targetDependencies {
    dependencies.add("cosmos-proto" to project(":chameleon-proto-cosmos-proto"))
    dependencies.add("cosmos-sdk" to project(":chameleon-proto-cosmos-sdk"))
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
