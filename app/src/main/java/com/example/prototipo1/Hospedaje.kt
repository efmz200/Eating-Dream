package com.example.prototipo1

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.annotation.RequiresApi

class Hospedaje : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.P)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hospedaje)

        var list = this.requireViewById<LinearLayout>(R.id.hotelsList);

        val names = listOf("Alama de luna", "White house", "Montaña linda","la laguna","Rio perlas","Grandpas","Rinconcito verde","Shakti",
                "El salto", "El rio", "Cañaveral","Quelitales","Orocay","El Roble")
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