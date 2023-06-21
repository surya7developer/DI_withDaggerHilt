package com.dependency.injection.hilt.di.automatic

import android.util.Log
import com.dependency.injection.hilt.util.TAG
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton

interface DeveloperAutoProvider {

    fun android()
    fun ios()

}

class DevelopingAutoProvider @Inject constructor() : DeveloperAutoProvider {
    override fun android() {
        Log.d(TAG,"android() Developing auto provide")
    }

    override fun ios() {
        Log.d(TAG,"android() Developing auto provide")
    }
}

class ProjectsAutoProvide @Inject constructor(val developerAutoProvider: DeveloperAutoProvider) {

    fun getProjectAutoProvider(){
        developerAutoProvider.android()
        developerAutoProvider.ios()
    }
}

@Module
@InstallIn(SingletonComponent::class)
object AppModuleProvide {

    @Singleton
    @Provides
    fun getProjectsAutoProviders() : DeveloperAutoProvider = DevelopingAutoProvider()

}
