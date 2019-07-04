package google.rrp.capmegakotlin

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.ejercicio_seven.*
import java.util.*
import kotlin.collections.ArrayList


/*
 * Capmega Soluciones Informáticas S.A.S de C.V
 * Jul 2019
 * Raúl Ramírez
 * rramirez@capmega.com
 */
class EjercicioSeven : AppCompatActivity() , View.OnClickListener {
    var strings = ArrayList<String>()
    var ints = ArrayList<Int>()
    var doubloss = ArrayList<Double>()
    var nombres = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ejercicio_seven)
        btn_string.setOnClickListener(this)
        btn_int.setOnClickListener(this)
        btn_double.setOnClickListener(this)
        btn_names.setOnClickListener(this)


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

        nombres.add("Charmander") //1.-Creacion de los nombres
        nombres.add("Miguel")
        nombres.add("Issac")
        nombres.add("Raúl")
        nombres.add("Marco")
        nombres.add("Chansey")
        nombres.add("Carlos")
        nombres.add("Johnathan")
        nombres.add("Marina")
        nombres.add("Poli")

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

            R.id.btn_names ->{
                Log.i("Enciso 1","Creacion de una lista de 10 elelmentos")
                for (i in nombres.indices) {
                    Log.i("Array de los nombre al inicio en la posicón: $i", nombres[i])
                }
                //Agregar un nuevo nombre
                nombres.add("Pikachu")   //2.-Se agrega un nombre
                Log.i("Enciso 2","Se agrega un nombre")
                for (i in nombres.indices) {
                    Log.i("Array de los nombre al inicio en la posicón: $i", nombres[i])
                }
                //Se agrega un nombre a la posicion 4
                Log.i("enciso 3","Se agrega en la posicion 4")
                nombres.add(4, "Pichardo") //3.- Se agrega un nombre en la posicion 4
                for (i in nombres.indices) {
                    Log.i("Array de los nombre al inicio en la posicón: $i", nombres[i])
                }
                //obtencion del nombre de la posicion 8
                Log.i("Enciso 4","mostrar nombre de la posicion 8")
                Log.i("El nombre de la posicion 8 es ", nombres[8])
                //Remover el nombre de la posicion 0
                Log.i("enciso 5","Se remueve la posicion 0")
                nombres.removeAt(0)  //5.- quitar la posicion 0
                for (i in nombres.indices) {
                    Log.i("Array de los nombre al inicio en la posicón: $i", nombres[i])
                }
                Log.i("enciso 6","Se remplaza la posicion 1")
                //Remplazar el nombre de la posicion 1
                nombres[1] = "Goku" //6.- cambio del nombre en la posicion 1
                for (i in nombres.indices) {
                    Log.i("Array de los nombre al inicio en la posicón: $i", nombres[i])
                }
                //Dimension del arraylist
                Log.i("enciso 7","Dimension del array")
                Log.i("El array ahora tiene la siguiente dimensión ", nombres.size.toString()) //7 .- Tamño del array
                //Obtencion del ultimo nombre
                Log.i("enciso 8","obtener el ultimo nombre")
                Log.i("El ultimo nombre es", nombres[nombres.size - 1]) //8.-Obtener el ultimo valor de la lista
                //obtener la posicion en base al nombre
                Log.i("enciso 9","Obtener la posicion donde se encuentra mi nombre")
                Log.i("Mi nombre se encuentra en la posicion",nombres.indexOf("Raúl").toString()) //9.- Obtener la posicion de la lista en base al nombre
                //Ordenamiento en orden alfabetico
                Log.i("enciso 10","ordenar alfabeticamente")
                Collections.sort(nombres)  //10.- Ordenamiento de los elemnetos alfabeticamente
                Log.i("La lista ordenada queda ", "de la siguiente manera:")
                for (i in nombres.indices) {
                    Log.i("Array final de los nombres en la posicón: $i", nombres[i])
                }
                //Existe abel en el array list?
                Log.i("enciso 11","existe Abel en el arrayList?")
                Log.i("Se encuentra Abel?", nombres.contains("Abel").toString()) //11.- Saber si se encunetra Abel en el arraylist
            }
        }
    }
}