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
        .also { println("Resolved injective-core version : $it") }
}

version = resolveVersion()

val gogoprotoVersion = "1.4.10"
val cosmosSdkVersion = "0.47.5"
val cosmwasmWasmdVersion = "0.45.0"

kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                api("kr.jadekim:chameleon-proto-gogoproto:$gogoprotoVersion")
                api("kr.jadekim:chameleon-proto-cosmos-sdk:$cosmosSdkVersion") {
                    exclude("kr.jadekim", "chameleon-proto-tendermint")
                }
                api("kr.jadekim:chameleon-proto-cosmwasm-wasmd:$cosmwasmWasmdVersion")
            }
        }
    }
}

dependencies {
    implementation("kr.jadekim:chameleon-proto-gogoproto:$gogoprotoVersion")
    implementation("kr.jadekim:chameleon-proto-cosmos-sdk:$cosmosSdkVersion") {
        exclude("kr.jadekim", "chameleon-proto-tendermint")
    }
    implementation("kr.jadekim:chameleon-proto-cosmwasm-wasmd:$cosmwasmWasmdVersion")

    protobuf(files("target/proto"))
}
