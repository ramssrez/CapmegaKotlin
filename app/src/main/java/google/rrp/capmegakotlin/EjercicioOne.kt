package google.rrp.capmegakotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.ejercicio_one.*

/*
 * Capmega Soluciones Informáticas S.A.S de C.V
 * Jun 2019
 * Raúl Ramírez
 * rramirez@capmega.com
 */
class EjercicioOne : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejercicio_one)
        btn_calcular_enciso_c.setOnClickListener(this)
        btn_calcular_enciso_b.setOnClickListener(View.OnClickListener {
            sumaNumeros()
        })
    }

    private fun sumaNumeros(){

        if ((edt_first_number.text.toString().isEmpty()) || (edt_second_number.text.toString().isEmpty())){
            Toast.makeText(applicationContext, "No debe dejar espacios en blanco", Toast.LENGTH_SHORT).show()
        }else{
            val n1 = Integer.parseInt(edt_first_number.text.toString())
            val n2 = Integer.parseInt(edt_second_number.text.toString())
            txtv_resultado.text = "La suma de numeros es; ${n1.plus(n2)} "
            Toast.makeText(applicationContext, "La suma de los número es: ${n1.plus(n2)}", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onClick(v: View?) {
        sumaNumeros()
    }

    fun suma(view : View){
        sumaNumeros()
    }
}
