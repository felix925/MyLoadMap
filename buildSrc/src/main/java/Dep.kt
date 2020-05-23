package dependencies


object Dep {
    private object LibraryVersion {
        val kotlin = "1.3.72"
        val timber = "4.7.1"
        val koin = "2.0.1"
        val material = "1.2.0-alpha05"
        val constraint = "1.1.3"
        val coreKtx = "1.2.0"
        val appCompat = "1.1.0"
        val gradle = "4.1.0-alpha08"
        val LiveData = "2.2.0"
        val Room = "2.2.3"
        val Navigation = "2.2.1"
        val KotlinCoroutines = "1.3.3"
        val Epoxy = "3.9.0"
    }

    object common {
        val stdLib = "org.jetbrains.kotlin:kotlin-stdlib:${LibraryVersion.kotlin}"
        val coreKtx = "androidx.core:core-ktx:${LibraryVersion.coreKtx}"
        val appCompat = "androidx.appcompat:appcompat:${LibraryVersion.appCompat}"
        val activityKtx = "androidx.activity:activity-ktx:1.1.0"
        val fragmentKtx = "androidx.fragment:fragment-ktx:1.2.2"
    }

    object GradlePlugin {
        val kotlinGradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:${LibraryVersion.kotlin}"
        val gradle = "com.android.tools.build:gradle:${LibraryVersion.gradle}"
    }

    object Timber {
        val timber = "com.jakewharton.timber:timber:${LibraryVersion.timber}"
    }

    object Koin {
        val koin = "org.koin:koin-android:${LibraryVersion.koin}"
        val scope = "org.koin:koin-android-scope:${LibraryVersion.koin}"
        val viewModel = "org.koin:koin-android-viewmodel:${LibraryVersion.koin}"
    }

    object Test {
        val junit = "junit:junit:4.+"
        val junitExt = "androidx.test.ext:junit:1.1.1"
        val espresso = "androidx.test.espresso:espresso-core:3.2.0"
    }

    object UI {
        val material = "com.google.android.material:material:${LibraryVersion.material}"
        val constraint = "androidx.constraintlayout:constraintlayout:${LibraryVersion.constraint}"
    }

    object LiveData {
        val lifecycleLiveData = "androidx.lifecycle:lifecycle-livedata:${LibraryVersion.LiveData}"
        val liveDataCoreKtx =
            "androidx.lifecycle:lifecycle-livedata-core-ktx:${LibraryVersion.LiveData}"
        val liveDataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:${LibraryVersion.LiveData}"
    }

    object Room {
        val compiler = "androidx.room:room-compiler:${LibraryVersion.Room}"
        val runtime = "androidx.room:room-runtime:${LibraryVersion.Room}"
        val coroutine = "androidx.room:room-ktx:${LibraryVersion.Room}"
    }

    object Navigation {
        val runtimeKtx = "androidx.navigation:navigation-runtime-ktx:${LibraryVersion.Navigation}"
        val fragmentKtx =
            "androidx.navigation:navigation-fragment-ktx:${LibraryVersion.Navigation}"
        val uiKtx = "androidx.navigation:navigation-ui-ktx:${LibraryVersion.Navigation}"
    }

    object Coroutine {
        val coroutines =
            "org.jetbrains.kotlinx:kotlinx-coroutines-core:${LibraryVersion.KotlinCoroutines}"
        val androidCoroutinesDispatcher =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${LibraryVersion.KotlinCoroutines}"
        val coroutinesReactive =
            "org.jetbrains.kotlinx:kotlinx-coroutines-reactive:${LibraryVersion.KotlinCoroutines}"
    }

    object Epoxy {
        val epoxy = "com.airbnb.android:epoxy:${LibraryVersion.Epoxy}"
        val processer = "com.airbnb.android:epoxy-processor:${LibraryVersion.Epoxy}"
        val databindingSupport = "com.airbnb.android:epoxy-databinding:${LibraryVersion.Epoxy}"
    }
}