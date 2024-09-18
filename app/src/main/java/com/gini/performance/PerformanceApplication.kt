package com.gini.performance

import android.app.Application
import android.util.Log

const val TAG = "PerformanceApplication"

class PerformanceApplication : Application(){
    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "onCreate: ")
    }
}