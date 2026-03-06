package com.example.recicleviewproject1.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.recicleviewproject1.data.model.Post
import com.example.recicleviewproject1.databinding.PostItemBinding

class PostAdapter(var postList: List<Post>): RecyclerView.Adapter<PostAdapter.MyViewHolder>() {

    inner class MyViewHolder(val binding: PostItemBinding): RecyclerView.ViewHolder(binding.root)

}