package com.example.prototipo1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /** Called when the user taps the Send button */
    fun sendMessage(view: View) {
        // Do something in response to button
        val intent = Intent(this, Hospedaje::class.java).apply {
        }
        startActivity(intent)
    }
    fun sendMessage2(view: View) {
        // Do something in response to button
        val intent = Intent(this, Restaurantes::class.java).apply {
        }
        startActivity(intent)
    }
}