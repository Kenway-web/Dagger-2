package com.anushka.didemo

import dagger.Component

@Component(modules = [MemoryCardModule::class,NCBatteryModule::class])
interface SmartPhoneComponent {

  //   fun getSmartPhone():SmartPhone
  // no need of using getmethod for invoking at mainactivity

   // an abstract inject function   for the mainactivity

     fun inject(mainActivity: MainActivity)



}