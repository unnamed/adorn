plugins {
    id("adorn.publishing-conventions")
}

repositories {
    maven("https://jitpack.io")
    mavenCentral()
}

dependencies {
    api(project(":adorn-api"))
    compileOnly(libs.minestomce)

    testImplementation(libs.creative.api)
    testImplementation(libs.creative.server)
    testImplementation(libs.creative.serializer.minecraft)
    testImplementation(libs.minestomce)
}