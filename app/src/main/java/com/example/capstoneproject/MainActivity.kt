package com.example.capstoneproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.capstoneproject.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val Button = findViewById<Button>(R.id.loginbtn)
        Button.setOnClickListener() {
            Intent(this, homepage ::class.java).also { startActivity(it) }

            var toast = Toast.makeText(this, "you are successfully Login", Toast.LENGTH_LONG)
            toast.show()
        }
    }
}
