package google.rrp.capmegakotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.ejercicio_seven.*

/*
 * Capmega Soluciones Informáticas S.A.S de C.V
 * Jul 2019
 * Raúl Ramírez
 * rramirez@capmega.com
 */
class EjercicioSeven : AppCompatActivity() , View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejercicio_seven)
        btn_double.setOnClickListener(this)
        btn_int.setOnClickListener(this)
        btn_double.setOnClickListener(this)
        var strings = ArrayList<String>()
        var ints = ArrayList<Int>()
        var doubloss = ArrayList<Double>()

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

    override fun onClick(v: View?) {

    }
}