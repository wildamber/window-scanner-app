pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("com\\.android.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {

        google()
        mavenCentral()
    }
}

rootProject.name = "Window Scanner App"
include(":app")
