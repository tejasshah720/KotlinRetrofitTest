package com.my.kotlinretrofittest

import android.support.annotation.CallSuper
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

/**
 * Created by Tejas Shah on 19/12/18.
 */
open class Preseneter<V>(@Volatile var view: V? ){
    companion object {

        /*
        var compositeDisposables: CompositeDisposable
        Every method which will be part of presenter lyer will be added in it so we could dispose off them once they are no more in our use
        */
        var compositeDisposables: CompositeDisposable = CompositeDisposable()

    }

    init {
    }

    protected fun view(): V? {
        return view
    }

    @CallSuper
    fun unbindView() {
        if (compositeDisposables != null) {
            compositeDisposables.clear()
            compositeDisposables.dispose()
        }
        this.view = null
    }

    fun addDisposable(disposable: Disposable) {
        compositeDisposables.add(disposable)
    }
}