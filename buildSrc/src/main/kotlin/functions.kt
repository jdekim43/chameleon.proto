import org.gradle.api.Project
import java.io.BufferedReader
import java.io.File
import java.io.InputStreamReader
import java.util.concurrent.TimeUnit

private fun runCommand(timeout: Long = 5, builder: ProcessBuilder.() -> Unit): Process {
    val process = ProcessBuilder()
        .apply(builder)
        .start()
    val noTimeout = process.waitFor(timeout, TimeUnit.SECONDS)
    if (!noTimeout || process.exitValue() != 0) {
        val error = process.errorReader().readText()
        throw IllegalStateException("timeout or illegal exit value ${process.exitValue()}\n$error")
    }

    return process
}

private fun Process.readText(): String = inputReader().use { it.readText() }.trim()

fun Project.resolveVersion(name: String? = null, subDirectory: String = "target"): String {
    val result = runCommand {
        directory(File(projectDir, subDirectory))
        command("git", "describe", "--tags")
    }.readText()

    return result.removePrefix("v")
        .also { name?.let { n -> println("Resolved $n version : $it") } }
}

fun Project.resolveDependencyVersion(name: String, subDirectory: String = "target"): String {
    val result = runCommand {
        directory(File(projectDir, subDirectory))
        command("/bin/sh", "-c", "go mod graph | awk -F '@' '/$name@/{ print $2; exit; }'")
    }.readText()

    return result.removePrefix("v")
}

fun Project.checkoutTarget(tag: String, subDirectory: String = "target") {
    println("Checkout to $tag")

    runCommand {
        directory(File(projectDir, subDirectory))
        command("git", "fetch", "--all", "--tags")
    }
    runCommand {
        directory(File(projectDir, subDirectory))
        command("git", "checkout", tag)
    }
}

fun Project.isPublished(artifactId: String, version: String): Boolean {
    val history = File(projectDir, ".publish/$artifactId")

    if (!history.exists()) {
        return false
    }

    val publishedVersions = history.readLines()

    if (publishedVersions.contains(version)) {
        println("Already published version $version of $artifactId")
        return true
    }

    return false
}

fun Project.setPublished(artifactId: String, version: String) {
    val history = File(projectDir, ".publish/$artifactId")

    if (!history.exists()) {
        if (!history.parentFile.exists()) {
            history.parentFile.mkdirs()
        }
        history.createNewFile()
    }

    history.appendText(version)
}
