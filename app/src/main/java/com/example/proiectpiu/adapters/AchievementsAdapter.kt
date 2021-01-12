package com.example.proiectpiu.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import com.example.proiectpiu.Achievement
import com.example.proiectpiu.R
import java.util.zip.Inflater

class AchievementsAdapter(private val context: Context, private var achievementsList: ArrayList<Achievement>) : BaseAdapter() {

    private var viewType: Int=1

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

    fun setViewType(type: Int){
        viewType=type
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var item: View= View(context)

        if (viewType==2) {
             item = inflater.inflate(R.layout.layout_activity_item_unlocked, parent, false)

            val displayAchievementName = item.findViewById<TextView>(R.id.text1_unlocked)
            val displayAchievementDate = item.findViewById<TextView>(R.id.text2_unlocked)
            val displayPhoto = item.findViewById<ImageView>(R.id.image_unlocked)

            displayAchievementName.text = achievementsList[position].numeAchievement
            displayAchievementDate.text = achievementsList[position].data
            displayPhoto.setImageResource(achievementsList[position].iconita)

        }
        else{
            item = inflater.inflate(R.layout.layout_activity_item_available, parent, false)

            val displayAchievementName = item.findViewById<TextView>(R.id.text1_available)
            val displayAchievementDate = item.findViewById<TextView>(R.id.text2_available)
            val displayPhoto = item.findViewById<ImageView>(R.id.image_available)

            displayAchievementName.text = achievementsList[position].numeAchievement
            displayAchievementDate.text = achievementsList[position].data
            displayPhoto.setImageResource(achievementsList[position].iconita)
        }

        return item
    }


}