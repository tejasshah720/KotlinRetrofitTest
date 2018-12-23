package com.my.kotlinretrofittest.business.data

import com.google.gson.annotations.SerializedName

/**
 * Created by Tejas Shah on 21/12/18.
 */
data class PostData (

    @SerializedName("userId") val userId: Int,
    @SerializedName("id") val id: Int,
    @SerializedName("title") val title: String,
    @SerializedName("body") val body: String

)