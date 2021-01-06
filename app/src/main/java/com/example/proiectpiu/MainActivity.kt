package com.example.proiectpiu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun login(view: View) {


        val usernameText: EditText = findViewById(R.id.et_user_name)
        val passwordText: EditText = findViewById(R.id.et_password)
        var isOK = false

        if (usernameText.text.toString() =="piu" && passwordText.text.toString() == "piu"){

            val intent = Intent(this, Student::class.java)
            startActivity(intent)
        }

    }



}