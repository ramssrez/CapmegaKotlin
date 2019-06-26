package google.rrp.capmegakotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.ejercicio_two.*


/*
 * Capmega Soluciones Informáticas S.A.S de C.V
 * Jun 2019
 * Raúl Ramírez
 * rramirez@capmega.com
 */
class EjercicioTwo : AppCompatActivity(), View.OnClickListener {
    var radioGroup : RadioGroup? = null
    var radioButton : RadioButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejercicio_two)
        radioGroup = findViewById(R.id.rdgp_suma_resta)
        btn_calcular.setOnClickListener(this)

    }

    fun check_Button(view: View) {
        val radio : RadioButton = findViewById(rdgp_suma_resta.checkedRadioButtonId)
        Toast.makeText(applicationContext, "Seleccionaste la acción: ${radio.text}", Toast.LENGTH_SHORT).show()

    }

    private fun suma_resta_numeros(){
        val radio : RadioButton = findViewById(rdgp_suma_resta.checkedRadioButtonId)
        if ((edt_first_number.text.toString().isEmpty()) || (edt_second_number.text.toString().isEmpty())){
            Toast.makeText(applicationContext, "No debe dejar espacios en blanco", Toast.LENGTH_SHORT).show()
        }else{
            val n1 = Integer.parseInt(edt_first_number.text.toString())
            val n2 = Integer.parseInt(edt_second_number.text.toString())
            if (radio == rdbt_suma){
                txtv_resultado.text = "La suma de numeros es; ${n1.plus(n2)} "
                Toast.makeText(applicationContext, "La suma de los número es: ${n1.plus(n2)}", Toast.LENGTH_SHORT).show()
            }else if (radio == rdbt_resta){
                txtv_resultado.text = "La resta de numeros es; ${n1.minus(n2)} "
                Toast.makeText(applicationContext, "La resta de los número es: ${n1.minus(n2)}", Toast.LENGTH_SHORT).show()
            }
        }

    }

    override fun onClick(v: View?) {
        suma_resta_numeros()

    }


}
