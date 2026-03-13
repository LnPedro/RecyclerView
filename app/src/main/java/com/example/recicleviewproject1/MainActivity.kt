package com.example.recicleviewproject1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recicleviewproject1.adapter.PostAdapter
import com.example.recicleviewproject1.data.model.Post
import com.example.recicleviewproject1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var postAdapter: PostAdapter
    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMainBinding.inflate(layoutInflater)



        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
    }


    private fun initRecyclerPost(postList: List<Post>){

        postAdapter= PostAdapter(postList)
        binding.rcMain.layoutManager = LinearLayoutManager(this)
        binding.rcMain.setHasFixedSize(true)
        binding.rcMain.adapter = postAdapter
    }
    private fun getPost() = listOf<Post>(

        Post("0","0"),
        Post("1","1"),
        Post("2","2"),
        Post("3","3"),
        Post("4","4"),


    )


}