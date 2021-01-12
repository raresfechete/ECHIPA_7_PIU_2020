package com.example.proiectpiu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ListView
import com.example.proiectpiu.adapters.AchievementsAdapter

class Achievements : AppCompatActivity() {
    var achievementAdapter : AchievementsAdapter? = null
    var lista= AchievementList()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_achievements_available)

        val listReference = findViewById<ListView>(R.id.myRecyclerView_achievement_available)

        achievementAdapter = AchievementsAdapter(this@Achievements, lista.getAchievementsAvailable())
        listReference.adapter = achievementAdapter

        registerForContextMenu(listReference)
    }


    fun goToProfil(view: View) {
        val intent = Intent(this, Profil::class.java)
        startActivity(intent)
    }

    fun onAvailablePress(view: View){
        setContentView(R.layout.activity_achievements_available)

        val listReference = findViewById<ListView>(R.id.myRecyclerView_achievement_available)

        achievementAdapter = AchievementsAdapter(this@Achievements, lista.getAchievementsAvailable())
        achievementAdapter?.setViewType(1)
        listReference.adapter = achievementAdapter

        registerForContextMenu(listReference)
    }

    fun onUnlockPress(view: View){
        setContentView(R.layout.activity_achievements_unlocked)

        val listReference = findViewById<ListView>(R.id.myRecyclerView_achievement_unlocked)

        achievementAdapter = AchievementsAdapter(this@Achievements, lista.getAchievementsUnlocked())
        achievementAdapter?.setViewType(2)
        listReference.adapter = achievementAdapter

        registerForContextMenu(listReference)
    }


}