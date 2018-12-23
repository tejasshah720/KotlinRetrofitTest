package com.my.kotlinretrofittest

/**
 * Created by Tejas Shah on 18/12/18.
 */
interface IView {

    abstract fun showLoading()

    abstract fun hideLoading()

    abstract fun loadError(e: Throwable)

    abstract fun loadError(msg: String)
}