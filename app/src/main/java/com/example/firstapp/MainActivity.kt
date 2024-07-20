package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.firstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onButtonClick(binding.button)
    }

    fun onButtonClick(view: View){
       binding.tvResult.text = binding.etInput.text.reversed()
        var count ="Количество символов " + binding.tvResult.text.filter{it != ' '}.length.toString()
        binding.tvCount.text = count
        }
    }