package google.rrp.capmegakotlin

import android.annotation.SuppressLint
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
    val strings_types = arrayOf("Spider", "Tiger", "Lion", "Bird", "Monster", "Cat", "Dog", "Duck", "Dragon", "Rat")
    val enteros = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val doubles = doubleArrayOf(1.1, 2.3, 5.9, 45.2, 458.6, 12.9, 15.9, 9.6, 5.1, 2.1)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejercicio_six)
        btn_string.setOnClickListener(this)
        btn_int.setOnClickListener(this)
        btn_double.setOnClickListener(this)

    }

    @SuppressLint("LongLogTag")
    override fun onClick(v: View?) {
        when (v?.id){
            R.id.btn_string ->{
                Log.i("El array tiene la siguiente dimensión ", strings_types.count().toString())
                for (i in strings_types.indices){
                    Log.i("Array de los Strings en la posicion: $i", strings_types[i])
                }
            }
            R.id.btn_int ->{
                Log.i("El array tiene la siguiente dimensión ", enteros.count().toString())
                for (i in enteros.indices){
                    Log.i("Array de los enteros en la posicion: $i", enteros[i].toString())
                }
            }
            R.id.btn_double ->{
                Log.i("El array tiene la siguiente dimensión ", doubles.count().toString())
                for (i in doubles.indices){
                    Log.i("Arrat de los doubles en la posicion: $i", doubles[i].toString())
                }
            }
        }
    }
}