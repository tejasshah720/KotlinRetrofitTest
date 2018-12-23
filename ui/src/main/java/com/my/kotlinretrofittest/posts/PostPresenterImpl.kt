package com.my.kotlinretrofittest.posts

import android.app.Application
import com.my.kotlinretrofittest.ApplicationClass
import com.my.kotlinretrofittest.Preseneter
import com.my.kotlinretrofittest.business.network.ApiHelper
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.internal.schedulers.IoScheduler
import javax.inject.Inject

/**
 * Created by Tejas Shah on 21/12/18.
 */
class PostPresenterImpl(var postView: PostView, var applicationComponent: Application) : PostPresenter,
    Preseneter<PostView>(postView) {


    @Inject
    lateinit var mApiHelper: ApiHelper

    init {
        (applicationComponent as ApplicationClass).applicationComponent.inject(this)
    }

    override fun getAllPosts() {
       // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

        var view = view()

        view?.let {
            it.showLoading()
            var allPosts = mApiHelper.getAllPosts()
            addDisposable(allPosts.subscribeOn(IoScheduler()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                    { result ->
                        view?.let {
                            it.hideLoading()
                            postView.showAllPosts(result)

                        }
                    },
                    { error ->
                        view?.let {
                            it.hideLoading()
                        }
                    }
                ) ) }

        var allPosts = mApiHelper.getAllPosts()
        allPosts.subscribeOn(IoScheduler()).observeOn(AndroidSchedulers.mainThread())
            .subscribe {
                postView.showAllPosts(it)
            }
    }


}