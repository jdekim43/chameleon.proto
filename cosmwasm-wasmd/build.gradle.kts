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
        .also { println("Resolved cosmwasm-wasmd version : $it") }
}

version = resolveVersion()

val cosmosSdkVersion = "0.47.3"
val cosmosProtoVersion = "1.0.0-beta.2"
//val tendermintVersion = "0.34.19"

kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                api("kr.jadekim:chameleon-proto-cosmos-proto:$cosmosProtoVersion")
                api("kr.jadekim:chameleon-proto-cosmos-sdk:$cosmosSdkVersion") {
//                    exclude("kr.jadekim", "chameleon-proto-tendermint")
                    exclude("kr.jadekim", "chameleon-proto-cosmos-proto")
                }
//                api("kr.jadekim:chameleon-proto-tendermint:$tendermintVersion") {
//                    exclude("kr.jadekim", "chameleon-proto-cosmos-proto")
//                }
            }
        }
    }
}

dependencies {
    implementation("kr.jadekim:chameleon-proto-cosmos-proto:$cosmosProtoVersion")
    implementation("kr.jadekim:chameleon-proto-cosmos-sdk:$cosmosSdkVersion") {
//        exclude("kr.jadekim", "chameleon-proto-tendermint")
        exclude("kr.jadekim", "chameleon-proto-cosmos-proto")
    }
//    implementation("kr.jadekim:chameleon-proto-tendermint:$tendermintVersion") {
//        exclude("kr.jadekim", "chameleon-proto-cosmos-proto")
//    }

    protobuf(files("target/proto"))
}