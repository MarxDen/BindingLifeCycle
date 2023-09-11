package com.example.bindinglifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bindinglifecycle.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_detail)

    }
}