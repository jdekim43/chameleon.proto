import net.pearx.kasechange.toPascalCase
import org.gradle.api.Project
import java.io.File
import java.util.concurrent.TimeUnit

private fun runCommand(
    timeout: Long? = null,
    builder: ProcessBuilder.() -> Unit = {},
): Process {
    val processBuilder = ProcessBuilder().apply(builder)
//    val command = processBuilder.command()
//    val directory = processBuilder.directory()
    val process = processBuilder.start()

//    println("Execute command `${command.joinToString(" ")}` at `${directory?.path ?: "./"}`")

    if (timeout == null) {
        process.waitFor()
    } else {
        val noTimeout = process.waitFor(timeout, TimeUnit.SECONDS)
        if (!noTimeout) {
            throw IllegalStateException("timeout command")
        }
    }

    if (process.exitValue() != 0) {
        val error = process.errorReader().readText()
        throw IllegalStateException("timeout or illegal exit value ${process.exitValue()}\n$error")
    }

    return process
}

private fun Process.readText(): String = inputReader().use { it.readText() }.trim()

fun Project.resolveVersion(name: String? = null, subDirectory: String = "target", prefix: String = "v"): String {
    val result = runCommand {
        directory(File(projectDir, subDirectory))
        command("git", "tag", "--points-at", "HEAD")
    }.readText()

    return (result.split('\n').find { it.startsWith(prefix) } ?: "")
        .removePrefix(prefix)
        .also { name?.let { n -> println("Resolved $n version : $it") } }
}

fun Project.resolveDependencyVersion(name: String, subDirectory: String = "target"): String {
    val result = runCommand {
        directory(File(projectDir, subDirectory))
        command("/bin/sh", "-c", "go mod graph | awk -F '@' '/${name.replace("/", "\\/")}@/{ print $2; exit; }'")
    }.readText()

    return result.removePrefix("v")
}

fun Project.checkoutTarget(tag: String, subDirectory: String = "target") {
    println("Checkout to $tag")

    runCommand {
        directory(File(projectDir, subDirectory))
        command("git", "fetch", "--all", "--tags", "--force")
    }
    runCommand {
        directory(File(projectDir, subDirectory))
        command("git", "checkout", tag)
    }
}

fun Project.isPublished(taskName: String, artifactId: String, version: String): Boolean {
    val history = File(projectDir, ".publish-history/$taskName/$artifactId")

    if (!history.exists()) {
        return false
    }

    val publishedVersions = history.readLines()

    if (publishedVersions.contains(version)) {
        println("Already published $taskName/$artifactId@$version")
        return true
    }

    return false
}

fun Project.setPublished(taskName: String, artifactId: String, version: String) {
    val history = File(projectDir, ".publish-history/$taskName/$artifactId")

    if (!history.exists()) {
        if (!history.parentFile.exists()) {
            history.parentFile.mkdirs()
        }
        history.createNewFile()
    }

    history.appendText("$version\n")
}

fun String.deleteStringBytesMethods(fieldNumber: Int, fieldName: String, fieldBit: String): String {
    return replace(
        """
    |    /**
    |     * <code>string $fieldName = $fieldNumber;</code>
    |     * @return The bytes for $fieldName.
    |     */
    |    com.google.protobuf.ByteString
    |        get${fieldName.toPascalCase()}Bytes();
    |""".trimMargin(), ""
    ).replace(
        """
    |    /**
    |     * <code>string $fieldName = $fieldNumber;</code>
    |     * @return The bytes for $fieldName.
    |     */
    |    @java.lang.Override
    |    public com.google.protobuf.ByteString
    |        get${fieldName.toPascalCase()}Bytes() {
    |      java.lang.Object ref = ${fieldName}_;
    |      if (ref instanceof java.lang.String) {
    |        com.google.protobuf.ByteString b = 
    |            com.google.protobuf.ByteString.copyFromUtf8(
    |                (java.lang.String) ref);
    |        ${fieldName}_ = b;
    |        return b;
    |      } else {
    |        return (com.google.protobuf.ByteString) ref;
    |      }
    |    }
    |""".trimMargin(), ""
    ).replace(
        """
    |      /**
    |       * <code>string $fieldName = $fieldNumber;</code>
    |       * @return The bytes for $fieldName.
    |       */
    |      public com.google.protobuf.ByteString
    |          get${fieldName.toPascalCase()}Bytes() {
    |        java.lang.Object ref = ${fieldName}_;
    |        if (ref instanceof String) {
    |          com.google.protobuf.ByteString b = 
    |              com.google.protobuf.ByteString.copyFromUtf8(
    |                  (java.lang.String) ref);
    |          ${fieldName}_ = b;
    |          return b;
    |        } else {
    |          return (com.google.protobuf.ByteString) ref;
    |        }
    |      }""".trimMargin(), ""
    ).replace(
        """
    |      /**
    |       * <code>string $fieldName = $fieldNumber;</code>
    |       * @param value The bytes for $fieldName to set.
    |       * @return This builder for chaining.
    |       */
    |      public Builder set${fieldName.toPascalCase()}Bytes(
    |          com.google.protobuf.ByteString value) {
    |        if (value == null) { throw new NullPointerException(); }
    |        checkByteStringIsUtf8(value);
    |        ${fieldName}_ = value;
    |        bitField0_ |= $fieldBit;
    |        onChanged();
    |        return this;
    |      }""".trimMargin(), ""
    )
}
