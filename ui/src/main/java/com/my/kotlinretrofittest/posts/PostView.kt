package com.my.kotlinretrofittest.posts

import com.my.kotlinretrofittest.IView
import com.my.kotlinretrofittest.business.data.PostData

/**
 * Created by Tejas Shah on 21/12/18.
 */
interface PostView: IView {

    fun showAllPosts(postList: List<PostData>)

}