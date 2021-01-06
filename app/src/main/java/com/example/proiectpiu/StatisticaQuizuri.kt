package com.example.proiectpiu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.proiectpiu.adapters.CursuriAdapter
import com.example.proiectpiu.adapters.QuizAdapter

class StatisticaQuizuri : AppCompatActivity() {

    var quizAdapter : QuizAdapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_statistica_quizuri)


        val listReference = findViewById<ListView>(R.id.myRecyclerViewQuizuri)

        quizAdapter = QuizAdapter(this@StatisticaQuizuri, Quizuri().getQuizuri())
        listReference.adapter = quizAdapter

        registerForContextMenu(listReference)
    }
}