package com.cenec.examen16diciembre

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class PreferenciasActivity : AppCompatActivity() {

    val preferenciasFileName = "Preferencias"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preferencias)

        val settingsFile = getSharedPreferences(preferenciasFileName, Context.MODE_PRIVATE)

        var switchLista: Switch = findViewById<Switch>(R.id.switchLista)

        val cambioLista: TextView = findViewById<TextView>(R.id.valorTipoLista)

        switchLista.isChecked = settingsFile.getBoolean("tipolista", false)



    }
}
