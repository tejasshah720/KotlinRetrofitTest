package com.my.kotlinretrofittest.business.di.module

import android.app.Application
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Tejas Shah on 21/12/18.
 */
@Module
class AppModule(var application: Application) {

    lateinit var applicationInst: Application

    init {
        applicationInst = application
    }

    @Provides
    @Singleton
    fun provideApplication(): Application {
        return applicationInst
    }

}