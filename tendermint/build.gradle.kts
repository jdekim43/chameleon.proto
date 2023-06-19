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
        .also { println("Resolved tendermint version : $it") }
}

version = resolveVersion()

val googleApiVersion = "0.1.0"
val gogoprotoVersion = "1.4.10"

kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                api("kr.jadekim:chameleon-proto-google-api:$googleApiVersion")
                api("kr.jadekim:chameleon-proto-gogoproto:$gogoprotoVersion")
            }
        }
    }
}

dependencies {
    implementation("kr.jadekim:chameleon-proto-google-api:$googleApiVersion")
    implementation("kr.jadekim:chameleon-proto-gogoproto:$gogoprotoVersion")

    protobuf(files("target/proto"))
}