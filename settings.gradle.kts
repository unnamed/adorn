pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://papermc.io/repo/repository/maven-public/")
    }
}

rootProject.name = "adorn-parent"

includePrefixed("api")
includePrefixed("runtime-minestom-ce")

fun includePrefixed(name: String) {
    val kebabName = name.replace(':', '-')
    val path = name.replace(':', '/')

    include("adorn-$kebabName")
    project(":adorn-$kebabName").projectDir = file(path)
}
