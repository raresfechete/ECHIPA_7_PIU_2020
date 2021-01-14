package com.example.proiectpiu

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.proiectpiu.adapters.RankAdapter

class RankingActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    var rankAdapter : RankAdapter? = null
    var spinner : Spinner? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ranking)

        val spinner: Spinner = findViewById(R.id.curs_spinner)
        spinner.onItemSelectedListener = this
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            this,
            R.array.cursuri_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner.adapter = adapter
        }

        val listReference = findViewById<ListView>(R.id.rank_list)
        rankAdapter = RankAdapter(this, RankingList().getRankingsCurs0())
        listReference.adapter = rankAdapter
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        var list: ArrayList<RankedStudent>

        when (position){
            0 -> list = RankingList().getRankingsCurs0()
            1 ->  list =RankingList().getRankingsCurs1()
            2 ->  list =RankingList().getRankingsCurs2()
            3 ->  list =RankingList().getRankingsCurs3()
            else -> {list = RankingList().getRankingsCurs0()}
        }

        val listReference = findViewById<ListView>(R.id.rank_list)
        rankAdapter = RankAdapter(this, list)
        listReference.adapter = rankAdapter
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("Not yet implemented")
    }


}