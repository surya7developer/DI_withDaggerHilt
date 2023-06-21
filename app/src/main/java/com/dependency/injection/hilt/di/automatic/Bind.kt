package com.dependency.injection.hilt.di.automatic

import android.util.Log
import com.dependency.injection.hilt.util.TAG
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton

interface DeveloperAuto {

    fun android()
    fun ios()

}

class DevelopingAuto @Inject constructor() : DeveloperAuto {
    override fun android() {
        Log.d(TAG,"android() Developing auto")
    }

    override fun ios() {
        Log.d(TAG,"ios() Developing auto")
    }
}

class ProjectAuto @Inject constructor(val developer: DeveloperAuto){

    fun getProjectAuto(){
        developer.android()
        developer.ios()
    }

}

@Module
@InstallIn(SingletonComponent::class)
abstract class AppModuleAuto{

    @Binds
    @Singleton
    abstract fun getAppProjectAuto2(
        developingAuto: DevelopingAuto
    ) : DeveloperAuto

}

