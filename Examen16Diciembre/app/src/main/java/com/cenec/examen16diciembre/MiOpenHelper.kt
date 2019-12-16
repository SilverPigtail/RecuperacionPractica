package com.cenec.examen16diciembre

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast

class MiOpenHelper(contexto: Context): SQLiteOpenHelper(contexto, "usuarios", null, 1) {

    private val contexto: Context = contexto

    companion object{

        val tabla = "usuarios"
        val columnaUsuario = "nombre"
    }


    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("create table "+ tabla+"("+ columnaUsuario+" varchar(100) primary key);")

        Toast.makeText(contexto, "Tabla creada", Toast.LENGTH_LONG).show()
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}