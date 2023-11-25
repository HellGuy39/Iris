plugins {
    id("library-setup")
    `maven-publish`
}

private val moduleName = "iris_shared_prefs"

android {
    namespace = "${Configuration.ProjectId}.${moduleName}"
}

dependencies {
    implementation(Dependencies.AndroidX.CoreKtx)
    implementation(Dependencies.AndroidX.AppCompat)
}

afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("release") {
                from(components["release"])
                groupId = Configuration.ProjectId
                artifactId = moduleName
                version = Configuration.Version
            }
        }
    }
}