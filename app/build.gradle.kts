plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.creativecompanion"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.creativecompanion"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.8.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.test:monitor:1.6.1")
    implementation("androidx.test:runner:1.5.2")
    implementation("androidx.test:core:1.5.0")
    implementation ("com.github.yukuku:ambilwarna:2.0.1")
    implementation("androidx.test.ext:junit:1.1.5")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.8.1")
    testImplementation ("androidx.test.espresso:espresso-core:3.5.1")
    testImplementation ("androidx.test:rules:1.5.0")
    testImplementation ("org.mockito:mockito-core:3.12.4")


}
