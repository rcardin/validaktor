import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    alias(libs.plugins.jvm)
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
    testImplementation(libs.junit.kotest.engine)
    testImplementation(libs.kotest.assertions.arrow)

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    api(libs.arrow.core)
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions {
        freeCompilerArgs = freeCompilerArgs + "-Xcontext-receivers"
    }
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
