package com.ejemplos.dam.dosfragments

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.fragment_main.*

/**
 * Clase creada para trabajar con Kotlin
 * utiliza el layout activity_main que contiene al fragment referenciado con la clase MainFragment
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        main_button.setOnClickListener {
            val datos = Intent(this,Activity_B::class.java)
            datos.putExtra("key1","valor1")
            startActivity(datos)
        }
    }
}
