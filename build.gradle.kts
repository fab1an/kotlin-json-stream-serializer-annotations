plugins {
    kotlin("multiplatform").version("2.1.10")
    id("maven-publish")
}

group = "com.fab1an"
version = "2.0.1"

repositories {
    mavenCentral()
}

kotlin {
    mingwX64()
    iosArm64()
    iosX64()
    iosSimulatorArm64()
    macosArm64()
    macosX64()
    linuxX64()
    linuxArm64()
    jvm {
        withJava()
        testRuns.named("test") {
            executionTask.configure {
                useJUnitPlatform()
            }
        }
    }
    js(IR) {
        nodejs()
    }

    compilerOptions {
        jvmToolchain(21)
    }

    applyDefaultHierarchyTemplate()
}
