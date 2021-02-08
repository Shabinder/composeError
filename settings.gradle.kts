pluginManagement {
    repositories {
        google()
        jcenter()
        gradlePluginPortal()
        mavenCentral()
        maven(url = "https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
    
}
rootProject.name = "spotiflyer"

enableFeaturePreview("GRADLE_METADATA")

include(":android")
include(":desktop")
include(":common")


