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
    }

    override fun onClick(v: View?) {
        Toast.makeText(applicationContext, "Prueba de impresion de pantalla del tercer  boton ", Toast.LENGTH_SHORT).show()

    }


    fun suma(view : View){
        Toast.makeText(applicationContext, "Prueba de impresion de pantalla del primer boton ", Toast.LENGTH_SHORT).show()
    }
}
