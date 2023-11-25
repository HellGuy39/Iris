object Dependencies {

    object Kotlin {
        const val GradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.20"
    }

    object Android {
        const val GradlePlugin = "com.android.tools.build:gradle:8.1.2"
    }

    object Firebase {
        val Сore = "com.google.firebase:firebase-core:21.1.1"
        val Message = "com.google.firebase:firebase-messaging:23.2.1"
        val Database = "com.google.firebase:firebase-database:20.2.2"
        val Auth = "com.google.firebase:firebase-auth:22.1.1"
        val Crash = "com.google.firebase:firebase-crashlytics:18.4.1"

        val GradleCrashlyticsPlugin = "com.google.firebase:firebase-crashlytics-gradle:2.9.9"
    }

    object AndroidX {
        val CoreKtx = "androidx.core:core-ktx:1.12.0"
        val AppCompat = "androidx.appcompat:appcompat:1.6.1"

        val ViewPager2 = "androidx.viewpager2:viewpager2:1.0.0"
        val RecyclerView = "androidx.recyclerview:recyclerview:1.0.0"
        val SwipeToRefresh = "androidx.swiperefreshlayout:swiperefreshlayout:1.0.0"
        val Fragment = "androidx.fragment:fragment-ktx:1.6.1"
        val Activity = "androidx.activity:activity-ktx:1.7.2"
        val SplashScreen = "androidx.core:core-splashscreen:1.0.1"
        val WorkKtx = "androidx.work:work-runtime-ktx:2.8.1"
        val Emoji2 = "androidx.emoji2:emoji2:1.3.0"
    }

    object Google {
        val Billing = "com.android.billingclient:billing-ktx:6.0.1"
        val Review = "com.google.android.play:review-ktx:2.0.1"

        val GradleServicesPlugin = "com.google.gms:google-services:4.3.8"
    }

    object Material {
        val Material = "com.google.android.material:material:1.9.0"
    }

    object RxJava {
        val RxJava = "io.reactivex.rxjava2:rxjava:2.2.21"
        val RxAndroid = "io.reactivex.rxjava2:rxandroid:2.1.1"
        val RxBinding = "com.jakewharton.rxbinding4:rxbinding:4.0.0"
    }

    object RxJava3 {
        val RxJava = "io.reactivex.rxjava3:rxjava:3.1.7"
        val RxAndroid = "io.reactivex.rxjava3:rxandroid:3.0.2"
        val RxBinding = "com.jakewharton.rxbinding4:rxbinding:4.0.0"
    }

    object Lifecycle {

        private val version = "2.6.2"

        val LivedataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:$version"
        val LifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel:$version"
        val LifecycleViewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:$version"
        val LifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:$version"
        val LifecycleExtension = "androidx.lifecycle:lifecycle-extensions:$version"
    }

    object Cicirone {
        val Cicirone = "com.github.terrakok:cicerone:5.1.0"
    }

    object Dagger {

        private val version = "2.48"

        val Dagger = "com.google.dagger:dagger:$version"
        val DaggerCompiler = "com.google.dagger:dagger-compiler:$version"
    }

    object Room {

        private val version = "2.5.2"

        val Room = "androidx.room:room-runtime:$version"
        val RoomСompiler = "androidx.room:room-compiler:$version"
        val RoomRxJava = "androidx.room:room-rxjava2:$version"
    }

    object Retrofit {

        private val retrofitVersion = "2.9.0"

        val Retrofit = "com.squareup.retrofit2:retrofit:$retrofitVersion"
        val RetrofitGsonConverter = "com.squareup.retrofit2:converter-gson:$retrofitVersion"
        val RetrofitRxJavaAdapter = "com.squareup.retrofit2:adapter-rxjava2:$retrofitVersion"
        val OkHttpLoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:4.9.2"

    }

    object Coroutines {

        private val coroutinesVersion = "1.7.3"

        val CoroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion"
        val CoroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutinesVersion"
    }

    object Moxy {

        private val version = "1.5.6"

        val Moxy = "com.arello-mobile:moxy:$version"
        val MoxyAndroid = "com.arello-mobile:moxy-android:$version"
        val MoxyСompiler = "com.arello-mobile:moxy-compiler:$version"
    }

    object Glide {
        private val version = "4.16.0"

        val Glide = "com.github.bumptech.glide:glide:$version"
        val GlideCompiler = "com.github.bumptech.glide:compiler:$version"
    }

    object ThirdParty {

        val MpAndroidChart = "com.github.PhilJay:MPAndroidChart:v3.1.0"

        val Apache = "org.apache.commons:commons-text:1.7"
        val Timber = "com.jakewharton.timber:timber:4.7.1"
        val DotsIndicator = "com.tbuonomo.andrui:viewpagerdotsindicator:4.1.2"
        val Lottie = "com.airbnb.android:lottie:6.1.0"

        val TooLargeTool = "com.gu.android:toolargetool:0.3.0"

    }

}