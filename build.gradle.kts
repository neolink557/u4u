buildscript {

    repositories {
        mavenCentral()
        google()
        jcenter()


    }
    dependencies {
        classpath(BuildPlugins.androidGradlePlugin)
        classpath(BuildPlugins.kotlinGradlePlugin)
        classpath(BuildPlugins.googleServices)
        classpath(BuildPlugins.crashlyticsGradlePlugin)
    }
}

allprojects {
    repositories {
        mavenCentral()
        google()
        jcenter()
        maven { setUrl("https://jitpack.io") }
    }
}

tasks.register("clean").configure {
    delete("build")
}
