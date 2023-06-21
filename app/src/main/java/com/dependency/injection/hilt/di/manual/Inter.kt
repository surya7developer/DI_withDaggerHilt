package com.dependency.injection.hilt.di.manual

import android.util.Log
import com.dependency.injection.hilt.util.TAG

interface Developer {

    fun android()
    fun ios()

}

class Developing : Developer {
    override fun android() {
        Log.d(TAG,"android() Developing")
    }

    override fun ios() {
        Log.d(TAG,"ios() Developing")
    }
}

class Project(val developer: Developer){

    fun getProject(){
        developer.android()
        developer.ios()
    }

}

object AppModule {

    val project = Project(Developing())

}

