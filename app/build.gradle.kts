//apply plugin: 'com.android.application'
//apply plugin: 'kotlin-android'
//apply plugin: 'kotlin-android-extensions'

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
}

android {
//    compileSdkVersion 29
//    buildToolsVersion "30.0.2"
    compileSdkVersion(29)
    buildToolsVersion("30.0.2")

    defaultConfig {
        applicationId = "com.ziroom.kotlindemo"
        minSdkVersion(16)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

//    defaultConfig {
//        applicationId "com.ziroom.kotlindemo"
//        minSdkVersion 16
//        targetSdkVersion 29
//        versionCode 1
//        versionName "1.0"
//
//        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
//    }

    buildTypes {
//        release {
//            minifyEnabled false
//            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
//        }

        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
//        sourceCompatibility JavaVersion.VERSION_1_8
//        targetCompatibility JavaVersion.VERSION_1_8

        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
//    implementation fileTree(dir: "libs", include: ["*.jar"])
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

//    implementation "org.jetbrains.kotlin:kotlin-stdlib:$kotlin_version"
//    implementation 'androidx.core:core-ktx:1.3.2'
//    implementation 'androidx.appcompat:appcompat:1.2.0'
//    implementation 'androidx.constraintlayout:constraintlayout:2.0.4'
//    testImplementation 'junit:junit:4.12'
//    androidTestImplementation 'androidx.test.ext:junit:1.1.2'
//    androidTestImplementation 'androidx.test.espresso:espresso-core:3.3.0'

    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.3.61")
    implementation("androidx.core:core-ktx:1.3.2")
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("androidx.constraintlayout:constraintlayout:2.0.4")
    testImplementation("junit:junit:4.12")
    androidTestImplementation("androidx.test.ext:junit:1.1.2")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")

    //anko
    // Anko Commons
//    implementation "org.jetbrains.anko:anko-commons:$anko_version"
    implementation("org.jetbrains.anko:anko-commons:0.10.8")

    // Anko Layouts
//    implementation "org.jetbrains.anko:anko-sdk25:$anko_version" // sdk15, sdk19, sdk21, sdk23 are also available
//    implementation "org.jetbrains.anko:anko-appcompat-v7:$anko_version"
    implementation("org.jetbrains.anko:anko-sdk25:0.10.8") // sdk15, sdk19, sdk21, sdk23 are also available
    implementation("org.jetbrains.anko:anko-appcompat-v7:0.10.8")
    // Coroutine listeners for Anko Layouts
//    implementation "org.jetbrains.anko:anko-sdk25-coroutines:$anko_version"
//    implementation "org.jetbrains.anko:anko-appcompat-v7-coroutines:$anko_version"
    implementation("org.jetbrains.anko:anko-sdk25-coroutines:0.10.8")
    implementation("org.jetbrains.anko:anko-appcompat-v7-coroutines:0.10.8")
    // Anko SQLite
//    implementation "org.jetbrains.anko:anko-sqlite:$anko_version"
    implementation("org.jetbrains.anko:anko-sqlite:0.10.8")
    //反射
//    implementation "org.jetbrains.kotlin:kotlin-reflect:$kotlin_version"
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.3.61")
    //协程
//    implementation "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.2"
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.2")

    //retrofit
//    implementation "com.squareup.retrofit2:retrofit:2.6.2"
//    implementation "com.squareup.retrofit2:converter-gson:2.6.2"
//    implementation "com.google.code.gson:gson:2.8.6"
    implementation("com.squareup.retrofit2:retrofit:2.6.2")
    implementation("com.squareup.retrofit2:converter-gson:2.6.2")
    implementation("com.google.code.gson:gson:2.8.6")
}