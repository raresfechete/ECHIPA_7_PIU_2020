package com.example.proiectpiu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Student : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)
    }
    
    fun statisticaCursuri(view: View){

        val intent = Intent(this, StatisticaCursuri::class.java)
        startActivity(intent)
        
    }

    fun statisticaQuizuri(view: View){

        val intent = Intent(this, StatisticaQuizuri::class.java)
        startActivity(intent)

    }

    fun voteaza(view: View) {

        val intent = Intent(this, VotingActivity::class.java)
        startActivity(intent)

    }


}