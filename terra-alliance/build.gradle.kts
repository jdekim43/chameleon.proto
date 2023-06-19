import java.io.BufferedReader
import java.io.InputStreamReader

fun resolveVersion(): String {
    val directory = File(projectDir, "target")
    val process = ProcessBuilder("git", "describe", "--tags")
        .directory(directory)
        .start()
    val input = BufferedReader(InputStreamReader(process.inputStream))
    val noTimeout = process.waitFor(5, TimeUnit.SECONDS)
    if (!noTimeout || process.exitValue() != 0) {
        throw IllegalStateException("timeout or illegal exit value ${process.exitValue()}")
    }

    return input.use { it.readLine() }.removePrefix("v")
        .also { println("Resolved terra-alliance version : $it") }
}

version = resolveVersion()

val gogoprotoVersion = "1.4.10"
val cosmosProtoVersion = "1.0.0-beta.2"
val cosmosSdkVersion = "0.47.2"

kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                api("kr.jadekim:chameleon-proto-gogoproto:$gogoprotoVersion")
                api("kr.jadekim:chameleon-proto-cosmos-proto:$cosmosProtoVersion")
                api("kr.jadekim:chameleon-proto-cosmos-sdk:$cosmosSdkVersion") {
                    exclude("kr.jadekim", "chameleon-proto-tendermint")
                    exclude("kr.jadekim", "chameleon-proto-cosmos-proto")
                }
            }
        }
    }
}

dependencies {
    implementation("kr.jadekim:chameleon-proto-gogoproto:$gogoprotoVersion")
    implementation("kr.jadekim:chameleon-proto-cosmos-proto:$cosmosProtoVersion")
    implementation("kr.jadekim:chameleon-proto-cosmos-sdk:$cosmosSdkVersion") {
        exclude("kr.jadekim", "chameleon-proto-tendermint")
        exclude("kr.jadekim", "chameleon-proto-cosmos-proto")
    }

    protobuf(files("target/proto"))
}