package com.gini.performance

import android.app.Application
import android.util.Log
import com.gini.performance.domain.ThirdPartySdk
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber
import javax.inject.Inject

const val TAG = "PerformanceApp"

@HiltAndroidApp
class PerformanceApp : Application(){

    @Inject
    lateinit var thirdPartySdk: ThirdPartySdk
    override fun onCreate() {
        super.onCreate()
        thirdPartySdk.initialized()
//        if (BuildConfig.DEBUG) {
//            Timber.plant(Timber.DebugTree())
//        }
    }
}