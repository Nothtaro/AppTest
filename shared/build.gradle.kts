plugins {
    kotlin("multiplatform")
    id("com.android.library")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    android()

    sourceSets["commonMain"].dependencies {
        //kotlinx.coroutines will be available in all source sets
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.0")
    }
    sourceSets["androidMain"].dependencies {
    }
}

android {
    compileSdkVersion(31)
}
