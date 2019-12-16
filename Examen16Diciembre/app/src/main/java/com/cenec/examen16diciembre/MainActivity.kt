package com.cenec.examen16diciembre

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ListView
import android.widget.Switch
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val preferenciasFileName = "Preferencias"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Elimino la sombra de la action bar
        this.supportActionBar?.elevation=0f;

        var valorTipoLista: TextView = findViewById<TextView>(R.id.valorTipoLista)

        val settingsFile = getSharedPreferences(preferenciasFileName, Context.MODE_PRIVATE)

        if(settingsFile.getBoolean("tipolista", false)){

            valorTipoLista.setText("Mi Adapter").toString()

        }else{

            valorTipoLista.setText("ArrayAdapter").toString()
        }



    }

    fun irALista(view: View) {
        var intent= Intent(this,Lista::class.java)
        startActivity(intent)
    }

    fun irAPreferencias(view: View) {

         intent = Intent(this, PreferenciasActivity::class.java)
        startActivity(intent)



    }
}
