package com.example.prototipo1

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.annotation.RequiresApi

class Restaurantes : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.P)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurantes)

        var list = this.requireViewById<LinearLayout>(R.id.restauranteList);

        val names = listOf("Mc Donalds", "KFC", "Soda del lago","Asetec","Soda Deportiva","Subway","La sangüchera","Moes",
            "Mc Donalds", "KFC", "Soda del lago","Asetec","Soda Deportiva","Subway","La sangüchera","Moes")
        for (i in names.indices) {
            // Create TextView programmatically.
            val btn =  Button(this)
            btn.layoutParams = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
            btn.text = names[i];
            btn.textSize = 32.0F

            list.addView(btn);
        }
    }
}