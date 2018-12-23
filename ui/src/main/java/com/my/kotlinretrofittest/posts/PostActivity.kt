package com.my.kotlinretrofittest.posts

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import com.my.kotlinretrofittest.BaseActivity
import com.my.kotlinretrofittest.R
import kotlinx.android.synthetic.main.activity_post.*
import com.my.kotlinretrofittest.adapters.PostItemAdapter
import com.my.kotlinretrofittest.business.data.PostData

/**
 * Created by Tejas Shah on 21/12/18.
 */
class PostActivity : BaseActivity(), PostView {

    var postPresenter: PostPresenterImpl?=null

    override fun setLayout(): Int {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return R.layout.activity_post;
    }

    override fun init(savedInstanceState: Bundle?) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

        //  postPresenter.getAllPosts()
        getPresenter()?.let {
            it.getAllPosts()
        }
    }

    fun getPresenter(): PostPresenterImpl?{
        postPresenter = PostPresenterImpl(this, application)
        return postPresenter
    }

    override fun onStartScreen() {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun stopScreen() {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        postPresenter?.let {
            postPresenter!!.unbindView()
            postPresenter = null
        }
    }

    override fun showAllPosts(postList: List<PostData>) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        Log.d("Response", "" + postList)
        rv_post_list.layoutManager = LinearLayoutManager(this)
        rv_post_list.adapter = PostItemAdapter(postList, this)
    }
}