package com.example.parcialprogra

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    private fun ejercicio() {

        var color1: String = "azul"
        var color2: String = "rojo"
        var color3: String = "verde"


        if(color1 != color2 ) {
            println("los colores no son iguales ")

        }
        elseif (color1== color1)
        println("los colores son iguales" )

        else {
            println("ningun color es igual" )
        }
    }

    private fun elseif

    }


}