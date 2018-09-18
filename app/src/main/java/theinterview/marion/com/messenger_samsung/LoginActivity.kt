package theinterview.marion.com.messenger_samsung

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity:AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        login_button_login.setOnClickListener {
            val email= email_edittext_login.text.toString()
            val password= password_edit_text_login.text.toString()

            Log.d("LoginActivity", "Attempt to login with email/password $email")
        }

        back_to_register_textView_login.setOnClickListener {
            finish()
        }

    }

}

