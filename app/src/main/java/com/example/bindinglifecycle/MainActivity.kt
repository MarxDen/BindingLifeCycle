package com.example.bindinglifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

import android.widget.Button
import android.widget.TextView
import com.example.bindinglifecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val tag = "HOMESCREEN"
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(tag, "onCreate wurde aufgerufen")
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //val tv = findViewById<TextView>(R.id.tv_greeting)
        //val btn = findViewById<Button>(R.id.button)


        var counter = 0

        binding.button.setOnClickListener {
            binding.tvGreeting.text = "${counter+1}"
            binding.tvGreeting.textSize = 24.0F
            counter++
        }

    }



}