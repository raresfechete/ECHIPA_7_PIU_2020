package com.example.proiectpiu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ListView
import com.example.proiectpiu.adapters.QuizAdapter

class StatisticaQuizuri : AppCompatActivity() {

    var quizAdapter : QuizAdapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_statistica_quizuri)


        val listReference = findViewById<ListView>(R.id.myRecyclerViewQuizuri_stat)

        quizAdapter = QuizAdapter(this@StatisticaQuizuri, Quizuri().getQuizuri())
        quizAdapter!!.setReso(R.layout.quiz_item_quiz_stat)
        listReference.adapter = quizAdapter

    }

    fun goToProfil(view: View) {
        val intent = Intent(this, Profil::class.java)
        startActivity(intent)
    }

}