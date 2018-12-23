package com.my.kotlinretrofittest

import android.app.Application
import com.my.kotlinretrofittest.business.di.component.ApplicationComponent
import com.my.kotlinretrofittest.business.di.module.NetModule

/**
 * Created by Tejas Shah on 22/12/18.
 */
open class ApplicationClass :Application() {

    public lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        applicationComponent = DaggerApplicationComponent.builder()
            .netModule(NetModule())
            .build()

        applicationComponent.inject(this)
    }
}