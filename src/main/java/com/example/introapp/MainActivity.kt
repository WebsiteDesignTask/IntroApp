package com.example.introapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.clickMe_button)
        button.setOnClickListener {
            Log.v("Click Me", "Button Clicked")
            Toast.makeText(this, getString(R.string.clicked_text), Toast.LENGTH_SHORT) .show()
        }
    }
}