// Student: Sage Johnson
// CS 3013
// Dr. Evans

package example.getpassengers

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class GetPassengers : AppCompatActivity() {
    var passList: MutableList<Passenger> = ArrayList<Passenger>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_passengers)

    }

    fun enterPassenger(v: View) {
        // retrieve pointers to (3) relevant EditText views
        val textFirst = findViewById<EditText>(R.id.first_name)
        val textLast = findViewById<EditText>(R.id.last_name)
        val textPhone = findViewById<EditText>(R.id.phone_number)

        // extract data from (3) relevant EditText views
        val firstName = textFirst.getText().toString()
        val lastName = textLast.getText().toString()
        val phoneNumber = textPhone.getText().toString()

        // create Passenger object
        val passengerToAdd: Passenger = Passenger(firstName, lastName, phoneNumber)

        // add passenger to ArrayList
        passList.add(passengerToAdd)

        // add passenger object to accumulating list (TextView of second screen)
        val textPut = findViewById<TextView>(R.id.accum_list)
        textPut.append("\n" + passengerToAdd.toString())

        // clear text fields for new passenger addition
        textFirst.setText("")
        textLast.setText("")
        textPhone.setText("")
    }

    fun backToMain(v: View) {
        // initialize count variable
        val count = passList.size.toString()

        // pack data into Intent
        Intent().let { passengerList ->
            // place count into passengerList
            passengerList.putExtra("COUNT", count)

            // iterate over passList to add to Intent
            for (i in passList.indices) {
                // create key
                val key = "PASS" + (i + 1)
                // pass passenger object into Intent
                passengerList.putExtra(key, passList[i].toString())
            }

            setResult(Activity.RESULT_OK, passengerList)
            finish()
        }
    }
}