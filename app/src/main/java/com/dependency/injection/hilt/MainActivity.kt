package com.dependency.injection.hilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dependency.injection.hilt.base.BaseApp
import com.dependency.injection.hilt.di.EmployeeDetails
import com.dependency.injection.hilt.di.automatic.Development
import com.dependency.injection.hilt.di.automatic.ProjectAuto
import com.dependency.injection.hilt.di.automatic.ProjectsAutoProvide
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    lateinit var baseApp: BaseApp

    @Inject //Field Injection
    lateinit var development: Development

    @Inject
    lateinit var projectAuto: ProjectAuto

    @Inject
    lateinit var projectsAutoProvide: ProjectsAutoProvide

    @Inject
    lateinit var employeeDetails: EmployeeDetails

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Example for manual dependency injection

        //baseApp = BaseApp()
        //baseApp.car.getCar()

        //Manual interface dependency injection
        //baseApp.project.getProject()


        // For automatic dependency injection (Library,FramWork) - Dragger Hilt
        //development.getTechnologies()

        //Automatic interface dependency injection with @Binds
        //projectAuto.getProjectAuto()

        //Automatic interface dependency injection with @Provides
        //projectsAutoProvide.getProjectAutoProvider()

        //Qualifiers
        employeeDetails.getShowDetails()

    }
}