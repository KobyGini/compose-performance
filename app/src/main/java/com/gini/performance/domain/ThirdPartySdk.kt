package com.gini.performance.domain

import android.util.Log
import com.gini.performance.TAG
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import javax.inject.Inject

class ThirdPartySdk @Inject constructor(){

    fun initialized(){
//        GlobalScope.launch(Dispatchers.Main){
            var seconds = 10_000
            while (seconds > 0){
                Log.d(TAG, "initialized: ${seconds}")
                seconds--
            }
        }
//    }
}