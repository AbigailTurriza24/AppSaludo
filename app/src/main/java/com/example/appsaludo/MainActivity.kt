package com.example.appsaludo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main

        val ubSaludar = findViewById<Button>(R.id.ubSaludar)
            val etNombre = findViewById<EditText>(R.id.etNombre)
        val cbDev = findViewById<CheckBox>(R.id.checkBox2)
    ubSaludar.setOnClickListener(View.OnClickListener {

if(validaDato()) {
    if (cbDev.isChecked) {
        Toast.makeText(
            this,
            "Bienvenido, " + etNombre.text + " , se que eres un desarrollador",
            Toast.LENGTH_LONG
        ).show()
    } else {
        Toast.makeText(this, "Bienvenido, " + etNombre.text, Toast.LENGTH_LONG).show()
    }
}else{
    Toast.makeText(this, "Escribe tu nombre para saludarte :( " , Toast.LENGTH_LONG).show()

}

    } )

}

    fun validaDato(): Boolean{

        val etNombre = findViewById<EditText>(R.id.etNombre)
        val nombreUsuario = etNombre.text

        if(nombreUsuario.isNullOrEmpty()){
            return false
        }

        return true

    }
}
