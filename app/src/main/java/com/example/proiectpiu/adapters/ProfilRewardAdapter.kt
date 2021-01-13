package com.example.proiectpiu.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import com.example.proiectpiu.Reward
import com.example.proiectpiu.R

class ProfilRewardAdapter(private val context: Context, private var rewardList: ArrayList<Reward>) : BaseAdapter() {


    private val inflater: LayoutInflater =
            context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount(): Int {
        return rewardList.size
    }

    override fun getItem(position: Int): Any {
        return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val item = inflater.inflate(R.layout.layout_activity_profil_reward, parent, false)

        val displayPhoto = item.findViewById<ImageView>(R.id.profil_reward_image)

        displayPhoto.setImageResource(rewardList[position].iconita)

        return item
    }


}