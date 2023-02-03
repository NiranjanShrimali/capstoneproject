package com.example.capstoneproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu

import androidx.appcompat.resources.Compatibility.Api21Impl.inflate
import com.example.capstoneproject.databinding.ActivityHomepageBinding

class homepage : AppCompatActivity() {
    private lateinit var binding: ActivityHomepageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomepageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fun onCreateOptionsMenu(menu: Menu):Boolean{

            menuInflater.inflate(R.menu.optionmenu,menu)
            return  super.onCreateOptionsMenu(menu)
        }
    }
}