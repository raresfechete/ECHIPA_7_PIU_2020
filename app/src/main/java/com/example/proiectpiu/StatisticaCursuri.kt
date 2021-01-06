package com.example.proiectpiu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import androidx.recyclerview.widget.RecyclerView
import com.example.proiectpiu.adapters.CursuriAdapter

class StatisticaCursuri : AppCompatActivity() {

    var cursuriAdapter : CursuriAdapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_statistica_cursuri)

        val listReference = findViewById<ListView>(R.id.myRecyclerView)

        cursuriAdapter = CursuriAdapter(this@StatisticaCursuri, Cursuri().getCursuri())
        listReference.adapter = cursuriAdapter

        registerForContextMenu(listReference)


    }
}