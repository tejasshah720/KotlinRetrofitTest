package com.my.kotlinretrofittest.business.network

import com.my.kotlinretrofittest.business.data.PostData
import io.reactivex.Observable
import retrofit2.http.GET

/**
 * Created by Tejas Shah on 19/12/18.
 */
interface ApiHelper {

    @GET(Endpoints.posts)
    fun getAllPosts(): Observable<List<PostData>>
}