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
        .also { println("Resolved cosmos-sdk version : $it") }
}

version = resolveVersion()

val googleApiVersion = "0.1.0"
val googprotoVersion = "1.4.10"
val cosmosProtoVersion = "1.0.0-beta.2"
//val tendermintVersion = "0.34.24"

kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                api("kr.jadekim:chameleon-proto-google-api:$googleApiVersion")
                api("kr.jadekim:chameleon-proto-gogoproto:$googprotoVersion")
                api("kr.jadekim:chameleon-proto-cosmos-proto:$cosmosProtoVersion")
//                api("kr.jadekim:chameleon-proto-tendermint:$tendermintVersion") {
//                    exclude("kr.jadekim", "chameleon-proto-cosmos-proto")
//                }
            }
        }

        val jvmMain by getting {
            dependencies {
                val protobufVersion: String by project

                implementation("com.google.protobuf:protobuf-java-util:$protobufVersion")
            }
        }
    }
}

dependencies {
    implementation("kr.jadekim:chameleon-proto-google-api:$googleApiVersion")
    implementation("kr.jadekim:chameleon-proto-gogoproto:$googprotoVersion")
    implementation("kr.jadekim:chameleon-proto-cosmos-proto:$cosmosProtoVersion")
//    implementation("kr.jadekim:chameleon-proto-tendermint:$tendermintVersion") {
//        exclude("kr.jadekim", "chameleon-proto-cosmos-proto")
//    }

    protobuf(files("target/proto"))
}

tasks.withType<Jar> {
    isZip64 = true
}