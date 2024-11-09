pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven ( url  ="https://jitpack.io")
        maven (url ="https://storage.zego.im/maven")   // <- Add this line.
        // <- Add this line.
    }
}

rootProject.name = "JobScheduler"
include(":app")
