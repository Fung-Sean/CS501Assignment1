package com.example.cs501assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonChangeDisplayText = findViewById<Button>(R.id.buttonChangeDisplayText)
        val textViewDisplayTextChange = findViewById<TextView>(R.id.textViewDisplayTextChange)
        buttonChangeDisplayText.setOnClickListener {
            textViewDisplayTextChange.text = "Hello World!"
        }
    }
}