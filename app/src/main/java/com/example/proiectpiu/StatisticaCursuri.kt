package com.example.proiectpiu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.Observer
import com.example.proiectpiu.adapters.CursuriAdapter
import java.util.*

class StatisticaCursuri : AppCompatActivity(){

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

    fun modificare(view : View){
        lista.addCurs(Curs(findViewById<EditText>(R.id.nume_curs).text.toString(),findViewById<EditText>(R.id.nume_profesor).text.toString(),Integer.parseInt(findViewById<EditText>(R.id.prezente_curs).text.toString()),findViewById<EditText>(R.id.link_curs).text.toString()))
        cursuriAdapter?.notifyDataSetChanged()
        Toast.makeText(this,"Curs Adaugat",Toast.LENGTH_SHORT).show()
    }


}