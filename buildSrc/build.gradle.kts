plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation(gradleApi())
    implementation(localGroovy())

    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.23")
    implementation("org.jetbrains.kotlin:kotlin-serialization:1.9.23")
    implementation("org.jetbrains.dokka:dokka-gradle-plugin:1.9.20")
    implementation("com.google.protobuf:protobuf-gradle-plugin:0.9.4")
}

gradlePlugin {
    plugins.register("protobuf-artifacts") {
        id = "protobuf-artifacts"
        implementationClass = "plugins.ProtobufArtifactsPlugin"
    }
    plugins.register("artifacts-publish") {
        id = "artifacts-publish"
        implementationClass = "plugins.ArtifactsPublishPlugin"
    }
    plugins.register("dependency-manager") {
        id = "dependency-manager"
        implementationClass = "plugins.DependencyManagerPlugin"
    }
}
