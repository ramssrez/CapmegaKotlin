package google.rrp.capmegakotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.ejercicio_four.*

/*
 * Capmega Soluciones Informáticas S.A.S de C.V
 * Jul 2019
 * Raúl Ramírez
 * rramirez@capmega.com
 */
class EjercicioFour : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejercicio_four)
        btn_calcular.setOnClickListener(this)
        val opciones = arrayOf("Suma", "Resta", "Multiplicación", "División")
        spn_options.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, opciones)

    }

    fun operaciones(){
        val selec : String = spn_options.selectedItem.toString()
        if ((edt_first_number.getText().toString().isEmpty()) || (edt_second_number.getText().toString().isEmpty())) {
            Toast.makeText(applicationContext, "No debe dejar espacios en blanco", Toast.LENGTH_SHORT).show()
        }else {
            val n1 = Integer.parseInt(edt_first_number.text.toString())
            val n2 = Integer.parseInt(edt_second_number.text.toString())
            if(selec.equals("Suma")){
                txtv_resultado.text = "La suma de numeros es; ${n1.plus(n2)} "
                Toast.makeText(applicationContext, "La suma de los números es: ${n1.plus(n2)}", Toast.LENGTH_SHORT).show()
            }
        }


        }



    override fun onClick(v: View?) {
        operaciones()
        Toast.makeText(this, "funcion ok del boton", Toast.LENGTH_SHORT).show()
    }
}