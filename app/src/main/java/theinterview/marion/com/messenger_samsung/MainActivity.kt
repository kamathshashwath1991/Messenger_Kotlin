package theinterview.marion.com.messenger_samsung

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        register_button_registration.setOnClickListener {

            val email = email_edittext_registration.text.toString()
            val password= password_edittext_registration.text.toString()


            Log.d("MainActivity","Email is :" + email)
            Log.d("MainActivity", "Password: $password")

            /*Firebase authentication*/

        }

       already_have_textView_registration.setOnClickListener {
           Toast.makeText(this@MainActivity, "Its toast!", Toast.LENGTH_SHORT).show()
           //launch login activity
           val intent= Intent(this,LoginActivity::class.java)
           startActivity(intent)
       }

    }
}
