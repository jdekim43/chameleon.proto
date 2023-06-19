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
        .also { println("Resolved cosmos-proto version : $it") }
}

version = resolveVersion()

dependencies {
    protobuf(files("target/proto"))
}