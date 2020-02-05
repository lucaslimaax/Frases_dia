package com.example.frases_dia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var texto: TextView
    val frases = arrayOf("Não tenho frase pra isso.",
            "só dará errado se você tentar.","Antes de começar desista.","Não tenha medo fracasso, tenha certeza.")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.textofrase) as TextView
    }

    fun gerarFrase(view: View){
    val totalItensArray = frases.size
        val numeroAleatorio = Random().nextInt(totalItensArray)

        texto.setText(frases[numeroAleatorio])
    }
}
