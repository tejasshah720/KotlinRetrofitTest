package com.my.kotlinretrofittest

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.my.kotlinretrofittest.posts.PostActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val postactivity = Intent(this, PostActivity::class.java);
        startActivity(postactivity)

    }
}
