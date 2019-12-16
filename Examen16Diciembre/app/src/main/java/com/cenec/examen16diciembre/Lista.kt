package com.cenec.examen16diciembre

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class Lista : AppCompatActivity() {
    val listView by lazy { findViewById<ListView>(R.id.lista) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)
        val valores= arrayOf("Ley del Software: Si aprenden a usarlo, saca otra versión","El 67% de las estadísticas, son falsas.","Escaneo de virus completado. Todos sus virus funcionan con normalidad.","Bienaventurados los pesimistas. Porque hacen BACKUPS","Copiar a otro: plagio. Copiar a muchos: investigación","Errar es humano, pero echarle la culpa a otro es mas humano todavía","No soporto a las personas que no dan la cara... (anonimo)")


    }
}
