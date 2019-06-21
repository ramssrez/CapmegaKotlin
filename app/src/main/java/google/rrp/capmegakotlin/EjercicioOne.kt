package google.rrp.capmegakotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast

/*
 * Capmega Soluciones Informáticas S.A.S de C.V
 * Jun 2019
 * Raúl Ramírez
 * rramirez@capmega.com
 */
class EjercicioOne : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejercicio_one)
    }

    fun suma(view : View){
        Toast.makeText(applicationContext, "Prueba de impresion de pantalla del primer boton ", Toast.LENGTH_SHORT).show()
    }
}
