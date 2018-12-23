package com.my.kotlinretrofittest.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.my.kotlinretrofittest.R
import com.my.kotlinretrofittest.business.data.PostData
import kotlinx.android.synthetic.main.item_post_title.view.*

/**
 * Created by Tejas Shah on 21/12/18.
 */
class PostItemAdapter(val postItems: List<PostData>, val context: Context) : RecyclerView.Adapter<PostItemAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_post_title, parent, false))

    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder?.itemView.tvPostTitle.text = postItems.get(position).title
    }


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }
}