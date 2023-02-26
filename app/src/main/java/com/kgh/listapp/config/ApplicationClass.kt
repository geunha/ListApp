package com.kgh.listapp.config

import android.app.Application
import com.kgh.listapp.repository.TodoRepository

class ApplicationClass: Application() {

    override fun onCreate() {
        super.onCreate()

        TodoRepository.initialize(this)
    }
}