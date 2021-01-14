package com.example.proiectpiu.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.RatingBar
import android.widget.TextView
import com.example.proiectpiu.R
import com.example.proiectpiu.RankedStudent

class RankAdapter(private val context: Context, private var rankList: ArrayList<RankedStudent>) : BaseAdapter() {

    private val inflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount(): Int {
        return rankList.size
    }

    override fun getItem(position: Int): Any {
        return rankList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val item = inflater.inflate(R.layout.ranking_item, parent, false)

        val studentName = item.findViewById<TextView>(R.id.student_name_ranking)
        val starRanking = item.findViewById<RatingBar>(R.id.stars_ranking)
        val rankAbsolut = item.findViewById<TextView>(R.id.rank_absolut)

        val rank = rankList[position].ranking.toFloat()
        val rankScaled = rank * 28

        studentName.text = rankList[position].nume
        starRanking.rating = rank
        rankAbsolut.text = rankScaled.toInt().toString() + " / 140"


        return item
    }
}