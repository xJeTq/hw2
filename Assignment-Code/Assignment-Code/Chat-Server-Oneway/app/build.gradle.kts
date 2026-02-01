plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "edu.stevens.cs522.chatserver"
    compileSdk = 36

    defaultConfig {
        applicationId = "edu.stevens.cs522.chatserver"
        minSdk = 26
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    // Hack to get around overlapping dependencies added by Kotlin libraries
//    configurations.implementation {
//        exclude ("org.jetbrains.kotlin", "kotlin-stdlib-jdk8")
//    }
}

dependencies {

    implementation(libs.activity)
    implementation(libs.guava)
    implementation(files("libs/cs522-library.aar"))

    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}