package com.example.proiectpiu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import com.example.proiectpiu.adapters.QuizAdapter

class QuizDemo : AppCompatActivity(){

    var quizAdapter : QuizAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_demo)
        val listReference = findViewById<ListView>(R.id.quiz_list)
        quizAdapter = QuizAdapter(this@QuizDemo, Quizuri().getQuizDemo())
        listReference.adapter = quizAdapter

    }

    fun goToProfil(view: View) {
        val intent = Intent(this, Profil::class.java)
        startActivity(intent)
    }

    fun demoQuiz(view: View) {
        val intent = Intent(this, QuizDemoIntrebari::class.java)
        startActivity(intent)
    }


}