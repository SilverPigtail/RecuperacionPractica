package com.cenec.examen16diciembre

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PreferenciasActivity : AppCompatActivity() {

    val preferenciasFileName = "Preferencias"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preferencias)

        val settingsFile = getSharedPreferences(preferenciasFileName, Context.MODE_PRIVATE)



    }
}
