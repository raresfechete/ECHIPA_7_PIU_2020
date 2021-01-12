package com.example.proiectpiu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ListView
import androidx.recyclerview.widget.RecyclerView
import com.example.proiectpiu.adapters.CursuriAdapter

class StatisticaCursuri : AppCompatActivity() {

    var cursuriAdapter : CursuriAdapter? = null
    var lista= Cursuri()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_statistica_cursuri)

        val listReference = findViewById<ListView>(R.id.myRecyclerView)


        cursuriAdapter = CursuriAdapter(this@StatisticaCursuri, lista.getCursuri())
        listReference.adapter = cursuriAdapter

        registerForContextMenu(listReference)
    }


    fun goToProfil(view: View) {
            val intent = Intent(this, Profil::class.java)
            startActivity(intent)
    }

    fun modificare(curs: Curs){
        lista.addCurs(curs)
        cursuriAdapter?.notifyDataSetChanged()
    }

}