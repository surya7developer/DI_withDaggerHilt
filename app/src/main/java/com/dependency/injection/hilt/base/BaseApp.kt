package com.dependency.injection.hilt.base

import android.app.Application
import com.dependency.injection.hilt.di.manual.AppModule
import com.dependency.injection.hilt.di.manual.Car
import com.dependency.injection.hilt.di.manual.Engine
import com.dependency.injection.hilt.di.manual.Wheel
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class BaseApp : Application() {

    val car = Car(Engine(), Wheel())
    val project = AppModule.project

}