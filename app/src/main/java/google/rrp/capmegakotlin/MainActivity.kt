package google.rrp.capmegakotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goToEjercicioOne(view: View) {
        val intent = Intent(this, EjercicioOne::class.java)
        startActivity(intent)
        finish()
    }
}
