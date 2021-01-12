package com.example.proiectpiu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Profil : AppCompatActivity() {

    var name=R.id.profil_student_name.toString()
    var profil=R.id.profil_profil_student.toString()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)
    }

    fun goToProfil(view: View) {
        val intent = Intent(this, Profil::class.java)
        startActivity(intent)
    }

    fun adaugareCurs(view: View) {
        StatisticaCursuri().modificare(Curs("asd","ccc",10,"htttp"))
    }

}