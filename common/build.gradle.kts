import org.jetbrains.compose.compose

plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose") version "0.3.0-build146"
    id("com.android.library")
    id("kotlinx-serialization")
    id("com.squareup.sqldelight")
}

group = "com.shabinder"
version = "1.0"

kotlin {
    android()
    jvm("desktop") {
        compilations.all {
            kotlinOptions.jvmTarget = "11"
        }
    }
    sourceSets {
        val commonMain by getting {
            dependencies {
                api(compose.runtime)
                api(compose.foundation)
                api(compose.material)


                // koin
                api(Koin.core)
                api(Koin.test)

                // Ktor
                implementation(Ktor.auth)
                implementation(Ktor.clientCio)
                implementation(Ktor.clientCore)
                implementation(Ktor.clientJson)
                implementation(Ktor.clientLogging)
                implementation(Ktor.clientSerialization)

                implementation(MVIKotlin.coroutines)
                implementation(MVIKotlin.mvikotlin)
                implementation(Decompose.decompose)
                implementation(Decompose.extensionsCompose)

                // Kotlinx Serialization
                implementation(Serialization.core)

                // SQL Delight
                implementation(SqlDelight.runtime)
                implementation(SqlDelight.coroutineExtensions)

                implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.1.1")

                // kermit
                api(Deps.kermit)

                api(Extras.kermit)
                api(Extras.youtubeDownloader)
                api(Extras.mp3agic)

            }
        }
        val commonTest by getting
        val androidMain by getting {
            dependencies {
                implementation(Ktor.clientAndroid)
                implementation(SqlDelight.androidDriver)
                api("androidx.appcompat:appcompat:1.2.0")
                api("androidx.core:core-ktx:1.3.2")
            }
        }
        val androidTest by getting {
            dependencies {
                implementation("junit:junit:4.13.1")
            }
        }
        val desktopMain by getting {
            dependencies {
                implementation(Ktor.clientApache)
                implementation(Ktor.slf4j)
            }
        }
        val desktopTest by getting
    }
}

android {
    compileSdkVersion(AndroidSdk.compile)
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    defaultConfig {
        minSdkVersion(AndroidSdk.min)
        targetSdkVersion(AndroidSdk.target)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
}

// workaround for https://youtrack.jetbrains.com/issue/KT-43944
android {
    configurations {
        /*create("androidTestApi")
        create("androidTestDebugApi")
        create("androidTestReleaseApi")*/
        create("testApi")
        create("testDebugApi")
        create("testReleaseApi")
    }
}