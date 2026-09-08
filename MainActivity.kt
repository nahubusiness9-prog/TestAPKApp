package com.example.testapkapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val text = TextView(this).apply {
            text = "🔥 TEST APK WORKS!\n\nBuilt without Android Studio."
            textSize = 24f
            setPadding(40, 80, 40, 40)
        }

        setContentView(text)
    }
}
