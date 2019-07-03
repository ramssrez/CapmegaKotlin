package google.rrp.capmegakotlin

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.ejercicio_seven.*
import java.nio.file.Files.size



/*
 * Capmega Soluciones Informáticas S.A.S de C.V
 * Jul 2019
 * Raúl Ramírez
 * rramirez@capmega.com
 */
class EjercicioSeven : AppCompatActivity() , View.OnClickListener {
    val strings = ArrayList<String>()
    var ints = ArrayList<Int>()
    var doubloss = ArrayList<Double>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejercicio_seven)
        btn_string.setOnClickListener(this)
        btn_int.setOnClickListener(this)
        btn_double.setOnClickListener(this)


        strings.add("Spider")
        strings.add("Tiger")
        strings.add("Leon")
        strings.add("Bird")
        strings.add("Monster")
        strings.add("Cat")
        strings.add("Dog")
        strings.add("Duck")
        strings.add("Dragon")
        strings.add("Ratatas")

        ints.addAll(listOf(1,2,3,4,5,6,7,8,9,10))

        doubloss.add(1.253)
        doubloss.add(112.25543)
        doubloss.add(1.253)
        doubloss.add(89.26553)
        doubloss.add(5416.21233)
        doubloss.add(182.25253)
        doubloss.add(15.489)
        doubloss.add(169.51)
        doubloss.add(12.648)
        doubloss.add(2556.2454)
    }

    @SuppressLint("LongLogTag")
    override fun onClick(v: View?) {
        when (v?.id){
            R.id.btn_string ->{
                Log.i("El arrayList de strings tiene la siguiente dimensión ", strings.size.toString())
                for (i in strings.indices){
                    Log.i("Array de los Strings en la posicion: $i", strings[i])
                }
            }

            R.id.btn_int ->{
                Log.i("El arrayList de enteros tiene la siguiente dimensión ", ints.size.toString())
                for (i in ints.indices){
                    Log.i("Array de los Strings en la posicion: $i", ints[i].toString())
                }
            }

            R.id.btn_double ->{
                Log.i("El arrayList de doubles tiene la siguiente dimensión ", doubloss.size.toString())
                for (i in doubloss.indices){
                    Log.i("Array de los Strings en la posicion: $i", doubloss[i].toString())
                }
            }
        }
    }
}