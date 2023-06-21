package com.dependency.injection.hilt.di

import android.content.Context
import android.util.Log
import com.dependency.injection.hilt.util.TAG
import com.dependency.injection.hilt.util.showLog
import com.dependency.injection.hilt.util.showToast
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ActivityContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Qualifier

class EmployeeDetails @Inject constructor(
    @Salary
    val salary:String,
    @Experience
    val experience:String,
    val years:Int,
    @ActivityContext
    val context: Context
    ){

    fun getShowDetails(){
    //context.showToast(
    //    "salary = $salary , experience = $experience , Years = $years"
    //)
    Log.d(TAG,"getShowDetails() salary = $salary , experience = $experience , Years = $years")
    }

}

@Module
@InstallIn(SingletonComponent::class)
object QualifierModule {

    @Provides
    @Salary
    fun getSalary() = "10000"

    @Provides
    @Experience
    fun getExperience() = "1 Year"

    @Provides
    fun getYears() = 10
}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class Salary

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class Experience
