package com.cenec.examen16diciembre

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Switch
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_preferencias.*
import org.w3c.dom.Text

class PreferenciasActivity : AppCompatActivity() {

    val preferenciasFileName = "Preferencias"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preferencias)

        val settingsFile = getSharedPreferences(preferenciasFileName, Context.MODE_PRIVATE)




        var switchLista: Switch = findViewById<Switch>(R.id.switchLista)
        switchLista.isChecked = settingsFile.getBoolean("tipolista", true)

       /* if(switchLista.isChecked){

            cambioLista.setText("Mi adapter")
        }else{

            cambioLista.setText("ArrayAdapter")
        }*/

    }

    fun switchActivated(view: View){

        val settingsFile = getSharedPreferences(preferenciasFileName, Context.MODE_PRIVATE)

        var myEditor: SharedPreferences.Editor = settingsFile.edit()

        if(switchLista.isChecked){

            myEditor.putBoolean("tipolista", true)

        } else {

            myEditor.putBoolean("tipolista", false)

        }

        myEditor.apply()
    }
}
