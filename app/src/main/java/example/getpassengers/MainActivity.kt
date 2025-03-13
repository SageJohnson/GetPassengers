package example.getpassengers

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    val listText : TextView
        get() = findViewById(R.id.show_list)
    private val startForResult =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            activityResult ->
            val data = activityResult.data

            val count = (data?.getStringExtra("COUNT") ?: "").toInt()

            val list = findViewById<TextView>(R.id.show_list)

            for (i in 1..count) {
                var key = "PASS$i"

                var passenger = data?.getStringExtra(key) ?: ""

                list.append("\n" + passenger)
            }

        }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun getList(v: View) {
        // clear previous list
        val passengerList: TextView = findViewById(R.id.show_list)
        passengerList.setText("Returned Passenger List:")

        // prepare Intent
        val getPassengersIntent = Intent(this, GetPassengers::class.java)
        // launch activity
        startForResult.launch(getPassengersIntent)
    }
}

class Passenger(val fName:String, val lName:String, val phone:String) {
    override fun toString() : String {
        val s = "<<" + this.fName + " " + this.lName + " " + this.phone + ">>"
        return s
    }
}