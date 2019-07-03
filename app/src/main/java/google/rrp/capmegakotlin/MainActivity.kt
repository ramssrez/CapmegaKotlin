package google.rrp.capmegakotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_go_ejercicio_one.setOnClickListener(this)
        btn_go_ejercicio_two.setOnClickListener(this)
        btn_go_ejercicio_three.setOnClickListener(this)
        btn_go_ejercicio_four.setOnClickListener(this)
        btn_go_ejercicio_six.setOnClickListener(this)
        btn_go_ejercicio_seven.setOnClickListener(this)
    }


    override fun onClick(v: View?) {
        when (v?.id){
            R.id.btn_go_ejercicio_one ->{
                val intent = Intent(this, EjercicioOne::class.java)
                startActivity(intent)
                finish()
            }
            R.id.btn_go_ejercicio_two ->{
                val intent = Intent(this, EjercicioTwo::class.java)
                startActivity(intent)
                finish()
            }
            R.id.btn_go_ejercicio_three ->{
                val intent = Intent(this, EjercicioThree::class.java)
                startActivity(intent)
                finish()
            }
            R.id.btn_go_ejercicio_four ->{
                val intent = Intent(this, EjercicioFour::class.java)
                startActivity(intent)
                finish()
            }
            R.id.btn_go_ejercicio_six ->{
                val intent = Intent(this, EjercicioSix::class.java)
                startActivity(intent)
                finish()
            }
            R.id.btn_go_ejercicio_seven ->{
                val intent = Intent(this, EjercicioSeven::class.java)
                startActivity(intent)
                finish()
            }

        }

    }



}
