package com.example.recicleviewproject1.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recicleviewproject1.data.model.Post
import com.example.recicleviewproject1.databinding.ActivityMainBinding
import com.example.recicleviewproject1.databinding.PostItemBinding

class PostAdapter(var postList: List<Post>): RecyclerView.Adapter<PostAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
        val view = PostItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return MyViewHolder(view)

    }

    override fun onBindViewHolder(
        holder: MyViewHolder,
        position: Int
    ) {
        val  post = postList[position]
        holder.binding.txtTitle.text = post.description
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    inner class MyViewHolder(val binding: PostItemBinding): RecyclerView.ViewHolder(binding.root){


    }
}