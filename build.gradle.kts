plugins {
    kotlin("multiplatform").version("2.4.20")
    id("publishing-conventions")
    id("maven-publish")
}

group = "com.fab1an"
version = "2.0.2-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    mingwX64()
    iosArm64()
    iosX64()
    iosSimulatorArm64()
    macosArm64()
    linuxX64()
    linuxArm64()
    jvm {
        testRuns.named("test") {
            executionTask.configure {
                useJUnitPlatform()
            }
        }
    }
    js {
        nodejs()
    }

    compilerOptions {
        jvmToolchain(27)
    }

    applyDefaultHierarchyTemplate()
}
