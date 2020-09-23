package org.unitec.proyectounitec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//el punto de partida de toda app es la MainActivity
class MainActivity : AppCompatActivity() {
    //fun en kotlin es una palabra reservada para implementar o crear una funcion o metodo
    //vamos a probar que funciona github esto lo estoy edi8tando desde el repositorio
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejemplito)
    }
}
