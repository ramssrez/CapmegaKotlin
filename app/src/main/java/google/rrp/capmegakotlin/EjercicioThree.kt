package google.rrp.capmegakotlin

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.CheckBox
import android.widget.Toast
import kotlinx.android.synthetic.main.ejercicio_three.*
import kotlinx.android.synthetic.main.ejercicio_three.btn_calcular
import kotlinx.android.synthetic.main.ejercicio_three.edt_first_number
import kotlinx.android.synthetic.main.ejercicio_three.edt_second_number
import kotlinx.android.synthetic.main.ejercicio_two.*
import kotlinx.android.synthetic.main.ejercicio_three.txtv_resultado as txtv_resultado1

/*
 * Capmega Soluciones Informáticas S.A.S de C.V
 * Jun 2019
 * Raúl Ramírez
 * rramirez@capmega.com
 */
class EjercicioThree : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejercicio_three)
        btn_calcular.setOnClickListener(this)

    }

    fun check_Button (view : View){
        if (chb_resta.isChecked){
            mensaje(chb_resta)
        }else if (chb_suma.isChecked){
            mensaje(chb_suma)
        }

    }

    fun  mensaje(checkBox: CheckBox){
        Toast.makeText(this,"Seleccionaste la opción: ${checkBox.text} ", Toast.LENGTH_SHORT).show()
    }


    override fun onClick(v: View?) {
        if ((chb_suma.isChecked)&&(chb_resta.isChecked)){
            Toast.makeText(this,"Debes de seleccionas solo una opción", Toast.LENGTH_SHORT).show()
        }else if (!chb_suma.isChecked && !chb_resta.isChecked){
            Toast.makeText(this,"Debes seleccionar una opción",Toast.LENGTH_SHORT).show()
        }else {
            accion_suma_resta()
        }

    }
    @SuppressLint("SetTextI18n")
    fun accion_suma_resta() {
        if ((edt_first_number.getText().toString().isEmpty()) || (edt_second_number.getText().toString().isEmpty())) {
            Toast.makeText(applicationContext, "No debe dejar espacios en blanco", Toast.LENGTH_SHORT).show()
        }else {
            val n1 = Integer.parseInt(edt_first_number.text.toString())
            val n2 = Integer.parseInt(edt_second_number.text.toString())
            if (chb_suma.isChecked){
                txtv_resultado.text = "La suma de numeros es; ${n1.plus(n2)} "
                Toast.makeText(applicationContext, "La suma de los número es: ${n1.plus(n2)}", Toast.LENGTH_SHORT).show()
            }else if (chb_resta.isChecked){
                txtv_resultado.text = "La resta de numeros es; ${n1.minus(n2)} "
                Toast.makeText(applicationContext, "La resta de los número es: ${n1.minus(n2)}", Toast.LENGTH_SHORT).show()

            }
        }

        }
    }

