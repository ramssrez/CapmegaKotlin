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
                txtv_resultado.text = "La suma de los números es: ${n1.plus(n2)} "
                Toast.makeText(applicationContext, "La suma de los números es: ${n1.plus(n2)}", Toast.LENGTH_SHORT).show()
            }else if(selec.equals("Resta")){
                txtv_resultado.text = "La resta de los números es: ${n1.minus(n2)} "
                Toast.makeText(applicationContext, "La resta de los número es: ${n1.minus(n2)}", Toast.LENGTH_SHORT).show()
            }else if (selec.equals("Multiplicación")){
                txtv_resultado.text = "La multiplicación de los números es: ${n1.times(n2)} "
                Toast.makeText(applicationContext, "La resta de los número es: ${n1.times(n2)}", Toast.LENGTH_SHORT).show()
            }else if (selec.equals("División")){
                val n3 = Integer.parseInt(edt_first_number.text.toString()).toDouble()
                val n4 = Integer.parseInt(edt_second_number.text.toString()).toDouble()
                txtv_resultado.text = "La división de los números es: ${n3.div(n4)} "
                Toast.makeText(applicationContext, "La división de los número es: ${n3.div(n4)}", Toast.LENGTH_SHORT).show()
            }
        }

        }



    override fun onClick(v: View?) {
        operaciones()
    }
}