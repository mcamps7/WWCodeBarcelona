package com.womenwhocode.spacex

import android.app.Application
import com.womenwhocode.spacex.di.myAppModules
import org.koin.android.ext.android.startKoin

/**
 * Created by Rocio Ortega on 19/05/2018.
 */
class SpaceApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin(this, myAppModules())
    }
}