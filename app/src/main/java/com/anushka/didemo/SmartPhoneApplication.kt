package com.anushka.didemo

import android.app.Application

class SmartPhoneApplication:Application() {

    // instance variable of smartphoneComponent Interface
    lateinit var smartPhoneComponent: SmartPhoneComponent

    override fun onCreate() {
        smartPhoneComponent=initDagger()
        super.onCreate()
    }

    // lets create a function to initialize dagger related component

    private fun initDagger():SmartPhoneComponent=
        DaggerSmartPhoneComponent.builder()
            .memoryCardModule(MemoryCardModule(1000))
            .build()

}