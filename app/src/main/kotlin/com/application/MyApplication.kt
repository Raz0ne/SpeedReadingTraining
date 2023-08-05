package com.application

import android.app.Application
import android.content.Context
import android.content.res.Configuration
import com.google.firebase.FirebaseApp

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        appContext = applicationContext

        FirebaseApp.initializeApp(this)
    }

    companion object {
        lateinit var appContext: Context
            private set
            @JvmStatic get
    }
}