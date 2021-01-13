package com.example.proiectpiu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import com.example.proiectpiu.adapters.ProiectAdapter
import com.example.proiectpiu.adapters.QuizAdapter

class ProiectActivity : AppCompatActivity() {
    var proiectAdapter : ProiectAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_demo)
        val listReference = findViewById<ListView>(R.id.quiz_list)
        proiectAdapter = ProiectAdapter(this@ProiectActivity, ProiectLista().getProiecte())
        listReference.adapter = proiectAdapter

    }

    fun joinTeam(view : View)
    {
        Toast.makeText(
                applicationContext,
                "Te-ai alaturat echipei",
                Toast.LENGTH_SHORT
        ).show()
    }

    fun propuneLider(view : View){
        Toast.makeText(
                applicationContext,
                "Ai propus un lider",
                Toast.LENGTH_SHORT
        ).show()

    }

    fun vreiSaFiiLider(view : View){
        Toast.makeText(
                applicationContext,
                "Vrei sa fii lider",
                Toast.LENGTH_SHORT
        ).show()

    }

}