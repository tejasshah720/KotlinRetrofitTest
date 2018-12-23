package com.my.kotlinretrofittest.business.di.component

import com.my.kotlinretrofittest.business.di.module.AppModule
import com.my.kotlinretrofittest.business.di.module.NetModule
import com.my.kotlinretrofittest.posts.PostPresenterImpl
import dagger.Component

/**
 * Created by Tejas Shah on 21/12/18.
 */

@Component(modules = [AppModule::class, NetModule::class])
interface ApplicationComponent {

    fun inject(mPostPresenterImpl: PostPresenterImpl)
}