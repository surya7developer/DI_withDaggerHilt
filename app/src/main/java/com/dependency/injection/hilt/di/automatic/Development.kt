package com.dependency.injection.hilt.di.automatic

import android.util.Log
import com.dependency.injection.hilt.util.TAG
import javax.inject.Inject

class Development @Inject constructor(val android: Android,val ios: Ios) {

    fun getTechnologies(){
        android.getAndroid()
        ios.getIos()
        Log.d(TAG,"getTechnologies() Technologies printed")
    }

}

class Android @Inject constructor(){

    fun getAndroid(){
        Log.d(TAG,"getAndroid() Android is working fine")
    }

}

class Ios @Inject constructor(){

    fun getIos(){
        Log.d(TAG,"getIos() iOS is not working fine")
    }

}
