package com.example.proiectpiu

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.proiectpiu.adapters.RankAdapter

class RankingActivity : AppCompatActivity() {

    var rankAdapter : RankAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ranking)
        val listReference = findViewById<ListView>(R.id.rank_list)
        rankAdapter = RankAdapter(this, RankingList().getRankingsCurs1())
        listReference.adapter = rankAdapter
    }


}