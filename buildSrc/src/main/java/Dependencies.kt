@file:Suppress("SpellCheckingInspection", "MayBeConstant")

object Versions {
    const val kotlin = "1.4.21-2"
    const val kotlinCoroutines = "1.4.2-native-mt"
    const val ktor = "1.5.1"
    const val kotlinxSerialization = "1.0.1"
    const val koin = "3.0.0-alpha-4"
    const val sqlDelight = "1.4.4"
    const val kermit = "0.1.8"

    const val sqliteJdbcDriver = "3.30.1"
    const val slf4j = "1.7.30"
    const val compose = "1.0.0-alpha11"
    const val nav_compose = "1.0.0-alpha06"
    const val accompanist = "0.5.0"

    const val junit = "4.13"
    const val testRunner = "1.3.0"
}


object AndroidSdk {
    const val min = 21
    const val compile = 29
    const val target = compile
}

object Deps {
    const val kermit = "co.touchlab:kermit:${Versions.kermit}"
}

object Test {
    const val junit = "junit:junit:${Versions.junit}"
}

object Compose {
    const val ui = "androidx.compose.ui:ui:${Versions.compose}"
    const val uiGraphics = "androidx.compose.ui:ui-graphics:${Versions.compose}"
    const val uiTooling = "androidx.compose.ui:ui-tooling:${Versions.compose}"
    const val foundationLayout = "androidx.compose.foundation:foundation-layout:${Versions.compose}"
    const val material = "androidx.compose.material:material:${Versions.compose}"
    const val runtimeLiveData = "androidx.compose.runtime:runtime-livedata:${Versions.compose}"
    const val navigation = "androidx.navigation:navigation-compose:${Versions.nav_compose}"
    const val accompanist= "dev.chrisbanes.accompanist:accompanist-coil:${Versions.accompanist}"
}

object Koin {
    val core = "org.koin:koin-core:${Versions.koin}"
    val test = "org.koin:koin-test:${Versions.koin}"
    val android = "org.koin:koin-android:${Versions.koin}"
    val androidViewModel = "org.koin:koin-androidx-viewmodel:${Versions.koin}"
}

object Decompose {
    private const val VERSION = "0.1.7"
    const val decompose = "com.arkivanov.decompose:decompose:$VERSION"
    const val decomposeIosX64 = "com.arkivanov.decompose:decompose-iosx64:$VERSION"
    const val decomposeIosArm64 = "com.arkivanov.decompose:decompose-iosarm64:$VERSION"
    const val extensionsCompose = "com.arkivanov.decompose:extensions-compose-jetbrains:$VERSION"
}
object MVIKotlin {
    private const val VERSION = "2.0.0"
    const val rx = "com.arkivanov.mvikotlin:rx:$VERSION"
    const val mvikotlin = "com.arkivanov.mvikotlin:mvikotlin:$VERSION"
    const val mvikotlinMain = "com.arkivanov.mvikotlin:mvikotlin-main:$VERSION"
    const val coroutines = "com.arkivanov.mvikotlin:mvikotlin-extensions-coroutines:$VERSION"
    const val keepers = "com.arkivanov.mvikotlin:keepers:$VERSION"
    const val mvikotlinMainIosX64 = "com.arkivanov.mvikotlin:mvikotlin-main-iosx64:$VERSION"
    const val mvikotlinMainIosArm64 = "com.arkivanov.mvikotlin:mvikotlin-main-iosarm64:$VERSION"
    const val mvikotlinLogging = "com.arkivanov.mvikotlin:mvikotlin-logging:$VERSION"
    const val mvikotlinTimeTravel = "com.arkivanov.mvikotlin:mvikotlin-timetravel:$VERSION"
    const val mvikotlinExtensionsReaktive = "com.arkivanov.mvikotlin:mvikotlin-extensions-reaktive:$VERSION"
}
object Badoo {
    object Reaktive {
        private const val VERSION = "1.1.19"
        const val reaktive = "com.badoo.reaktive:reaktive:$VERSION"
        const val reaktiveTesting = "com.badoo.reaktive:reaktive-testing:$VERSION"
        const val utils = "com.badoo.reaktive:utils:$VERSION"
        const val coroutinesInterop = "com.badoo.reaktive:coroutines-interop:$VERSION"
    }
}

object Extras {
    const val youtubeDownloader = "com.github.sealedtx:java-youtube-downloader:2.4.6"
    const val fuzzyWuzzy = "me.xdrop:fuzzywuzzy:1.3.1"
    const val mp3agic = "com.mpatric:mp3agic:0.9.1"
    const val jsonKlaxon = "com.beust:klaxon:5.4"
    const val kermit = "co.touchlab:kermit:${Versions.kermit}"
    object Android {
        val razorpay = "com.razorpay:checkout:1.6.4"
        val fetch = "androidx.tonyodev.fetch2:xfetch2:3.1.5"
        val appUpdator = "com.github.amitbd1508:AppUpdater:4.1.0"
    }
}
object Ktor {
    val clientCore = "io.ktor:ktor-client-core:${Versions.ktor}"
    val clientJson = "io.ktor:ktor-client-json:${Versions.ktor}"
    val clientLogging = "io.ktor:ktor-client-logging:${Versions.ktor}"
    val clientSerialization = "io.ktor:ktor-client-serialization:${Versions.ktor}"

    val auth = "io.ktor:ktor-client-auth:${Versions.ktor}"
    val clientAndroid = "io.ktor:ktor-client-android:${Versions.ktor}"
    val clientApache = "io.ktor:ktor-client-apache:${Versions.ktor}"
    val slf4j = "org.slf4j:slf4j-simple:${Versions.slf4j}"
    val clientIos = "io.ktor:ktor-client-ios:${Versions.ktor}"
    val clientCio = "io.ktor:ktor-client-cio:${Versions.ktor}"
    val clientJs = "io.ktor:ktor-client-js:${Versions.ktor}"
    val clientCurl = "io.ktor:ktor-client-curl:${Versions.ktor}"
}

object Serialization {
    val core = "org.jetbrains.kotlinx:kotlinx-serialization-core:${Versions.kotlinxSerialization}"
}

object SqlDelight {
    val runtime = "com.squareup.sqldelight:runtime:${Versions.sqlDelight}"
    val coroutineExtensions = "com.squareup.sqldelight:coroutines-extensions:${Versions.sqlDelight}"
    val androidDriver = "com.squareup.sqldelight:android-driver:${Versions.sqlDelight}"

    val nativeDriver = "com.squareup.sqldelight:native-driver:${Versions.sqlDelight}"
    val nativeDriverMacos = "com.squareup.sqldelight:native-driver-macosx64:${Versions.sqlDelight}"
    val jdbcDriver = "org.xerial:sqlite-jdbc:${Versions.sqliteJdbcDriver}"
    val sqlliteDriver = "com.squareup.sqldelight:sqlite-driver:${Versions.sqlDelight}"
}

