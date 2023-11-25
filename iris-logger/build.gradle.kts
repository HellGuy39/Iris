plugins {
    id("com.android.library")
    kotlin("android")
    id("kotlin-kapt")
    `maven-publish`
}

private val libraryVersion = "0.1.6"
private val libraryGroup = "com.hellguy39.iris"
private val libraryArtifact = "iris-logger"

version = libraryVersion
group = libraryGroup

android {
    namespace = "com.hellguy39.iris.iris_logger"
    compileSdk = 34

    defaultConfig {
        minSdk = 24

        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
}

afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("release") {
                from(components["release"])
                groupId = libraryGroup
                artifactId = libraryArtifact
                version = libraryVersion
            }
        }
    }
}