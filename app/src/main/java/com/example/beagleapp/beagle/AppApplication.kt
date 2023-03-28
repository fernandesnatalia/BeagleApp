package com.example.beagleapp.beagle

import android.app.Application
import com.example.beagleapp.BeagleSetup

class AppApplication: Application(){
    override fun onCreate() {
        super.onCreate()
        BeagleSetup().init(this)
    }
}