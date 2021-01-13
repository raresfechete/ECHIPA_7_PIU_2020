package com.example.proiectpiu.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.proiectpiu.Achievement
import com.example.proiectpiu.R

class ProfilAdapter(private val context: Context, private var achievementsList: ArrayList<Achievement>) : BaseAdapter() {


    private val inflater: LayoutInflater =
            context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount(): Int {
        return achievementsList.size
    }

    override fun getItem(position: Int): Any {
        return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

            val item = inflater.inflate(R.layout.layout_activity_profil_achievement, parent, false)

            val displayPhoto = item.findViewById<ImageView>(R.id.profil_achievement_image)

            displayPhoto.setImageResource(achievementsList[position].iconita)

        return item
    }


}