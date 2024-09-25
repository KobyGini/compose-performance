package com.gini.performance.domain

import android.content.Context
import androidx.startup.Initializer
import javax.inject.Inject

class ThirdPartySdkInitializer() : Initializer<Unit> {

    @Inject
    lateinit var thirdPartySdk: ThirdPartySdk

    override fun create(context: Context) {
        thirdPartySdk.initialized()
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> {
        return mutableListOf()
    }

}