package com.luizafmartinez.gasolinaoualcool

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calcular(view: View) {

        val editAlcool = findViewById<EditText>(R.id.et_preco_alcool)
        val editGasolina = findViewById<EditText>(R.id.et_preco_gasolina)
        val textResultado = findViewById<TextView>(R.id.tv_resultado)

        val precoAlcool = editAlcool.text.toString()
        val precoGasolina = editGasolina.text.toString()

        if(precoAlcool.isNotEmpty()) {
            if(precoGasolina.isNotEmpty()) {
                val pAlcool = precoAlcool.toDouble()
                val pGasolina = precoGasolina.toDouble()
                val resultado = pAlcool / pGasolina

                if (resultado >= 0.7) {
                    textResultado.text = "Melhor usar GASOLINA"
                } else {
                    textResultado.text = "Melhor usar ÁLCOOL"
                }
            }
        }
   }
}