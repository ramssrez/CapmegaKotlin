package google.rrp.capmegakotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.ejercicio_six.*

/*
 * Capmega Soluciones Informáticas S.A.S de C.V
 * Jul 2019
 * Raúl Ramírez
 * rramirez@capmega.com
 */
class EjercicioSix : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejercicio_six)
        btn_string.setOnClickListener(this)
        btn_int.setOnClickListener(this)
        btn_double.setOnClickListener(this)
    }




    override fun onClick(v: View?) {
        when (v?.id){
            R.id.btn_string ->{
                Log.i("Boton de strings", btn_string.toString())
            }
        }
    }
}