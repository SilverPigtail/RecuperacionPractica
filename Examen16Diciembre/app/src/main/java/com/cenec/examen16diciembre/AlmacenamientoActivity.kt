package com.cenec.examen16diciembre

import android.content.ContentValues
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class AlmacenamientoActivity : AppCompatActivity() {


    val campoNombre by lazy { findViewById<EditText>(R.id.editTextNombre) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_almacenamiento)


    }

    fun guardarFun(view: View) {

        var moh: MiOpenHelper = MiOpenHelper(this)
        var database: SQLiteDatabase = moh.writableDatabase


        if(campoNombre.text.isEmpty()){

            Toast.makeText(this, "Error, campo vacío", Toast.LENGTH_LONG).show()

        }else{

            val values: ContentValues = ContentValues()
            values.put(MiOpenHelper.columnaUsuario, this.campoNombre.text.toString())

                if(database.insert(MiOpenHelper.tabla, null, values) > 0){

                    Toast.makeText(this, "Dato guardado", Toast.LENGTH_LONG).show()

                    campoNombre.setText("")

                }else{

                    Toast.makeText(this, "Error de insertado", Toast.LENGTH_LONG).show()

                    campoNombre.setText("")
                }



        }


    }

    fun listarFun(view: View) {

        var moh: MiOpenHelper = MiOpenHelper(this)
        var database: SQLiteDatabase = moh.writableDatabase

        var nombres: String =""
        var nombresAux: String=""

            var fila: Cursor = database.rawQuery("select * from usuarios", null)

            if(fila.moveToFirst()){

                nombres = fila.getString(0)
                nombresAux =  fila.getString(0) +" , " + nombres
                Toast.makeText(this, fila.getString(0), Toast.LENGTH_SHORT)

            }else{
                Toast.makeText(this, "Fin", Toast.LENGTH_SHORT).show()
            }

        Toast.makeText(this, nombresAux.toString(), Toast.LENGTH_LONG).show()


    }
}



