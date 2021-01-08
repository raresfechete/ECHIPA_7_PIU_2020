package com.example.proiectpiu

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class FeedbackActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feedback)

    }

    fun sendFeedback(view: View) {

        var editText = findViewById<EditText>(R.id.editTextFeedback)
        var editText2 = findViewById<EditText>(R.id.editTextFeedback2)
        var editText3 = findViewById<EditText>(R.id.editTextFeedback3)
        var editText4 = findViewById<EditText>(R.id.editTextFeedback4)

        editText.setText("")
        editText2.text = null
        editText3.text = null
        editText4.text = null

        Toast.makeText(
            applicationContext,
            "Feedback-ul tau va fi luat in considerare ! ",
            Toast.LENGTH_LONG
        ).show()

        Handler().postDelayed({
            val i = Intent(this@FeedbackActivity, Student::class.java)
            startActivity(i)
        }, 3500)


    }

}