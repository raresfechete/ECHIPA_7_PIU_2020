package com.example.proiectpiu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ListView
import android.widget.TextView
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.example.proiectpiu.adapters.AchievementsAdapter
import com.example.proiectpiu.adapters.CursuriAdapter
import com.example.proiectpiu.adapters.ProfilAdapter
import com.example.proiectpiu.adapters.ProfilRewardAdapter
import java.util.*


class Profil : AppCompatActivity() {

    var profilAdapter : ProfilAdapter? = null
    var profilRewardAdapter : ProfilRewardAdapter? = null
    var lista= AchievementList()
    var listaRewarduri= RewardList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)

        val listReference = findViewById<ListView>(R.id.myRecyclerView_achievement_profil)
        val listReference2 = findViewById<ListView>(R.id.myRecyclerView_reward_profil)
        profilAdapter = ProfilAdapter(this@Profil, lista.getAchievementsProfil())
        profilRewardAdapter = ProfilRewardAdapter(this@Profil, listaRewarduri.getRewardsProfil())

        listReference.adapter = profilAdapter
        listReference2.adapter = profilRewardAdapter
    }

    fun goToProfil(view: View) {
        val intent = Intent(this, Profil::class.java)
        startActivity(intent)
    }



}