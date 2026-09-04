rootProject.name = "Chapter1"

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven(url = "https://mvn-mirror.gitverse.ru") {
            name = "GitVerse Maven Mirror"
        }
        mavenCentral()
    }
}