package com.dependency.injection.hilt.di.manual

import android.util.Log
import com.dependency.injection.hilt.util.TAG

class Car constructor(val engine: Engine,val wheel: Wheel){

    fun getCar(){
        engine.getEngine()
        wheel.getWheel()
        Log.d(TAG,"getCar() car running")
    }
}

class Engine {

    fun getEngine(){
        Log.d(TAG,"getEngine() engine running")
    }
}

class Wheel {

    fun getWheel(){
        Log.d(TAG,"getWheel() wheel running")
    }
}