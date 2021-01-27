buildscript {
//    ext.kotlin_version = "1.4.21"
//    ext.anko_version = "0.10.8"
    val kotlin_version = "1.3.61"
    val anko_version = "0.10.8"
    repositories {
        google()
        jcenter()
    }
    dependencies {
//        classpath "com.android.tools.build:gradle:4.0.0"
//        classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"
//        classpath "org.jetbrains.kotlin:kotlin-reflect:$kotlin_version"
        classpath ("com.android.tools.build:gradle:4.0.0")
        classpath(kotlin("gradle-plugin", kotlin_version))
        classpath ("org.jetbrains.kotlin:kotlin-reflect:$kotlin_version")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks {
    val clean : TaskProvider<Delete> by registering(Delete::class) {
        delete(buildDir)
    }
}

//task clean(type: Delete) {
//    delete rootProject . buildDir
//}