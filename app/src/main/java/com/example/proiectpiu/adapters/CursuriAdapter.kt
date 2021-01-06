package com.example.proiectpiu.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.EditText
import android.widget.TextView
import com.example.proiectpiu.Curs
import com.example.proiectpiu.R

class CursuriAdapter(private val context: Context, private var cursuriList: ArrayList<Curs>) : BaseAdapter() {

    private val inflater: LayoutInflater =
        context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount(): Int {
        return cursuriList.size
    }

    override fun getItem(position: Int): Any {
        return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val item = inflater.inflate(R.layout.activity_curs_item, parent, false)

        val displayName = item.findViewById<EditText>(R.id.displayName)
        val displayCatchPhrase = item.findViewById<EditText>(R.id.displayCatchPhrase)
        val bs = item.findViewById<EditText>(R.id.displayBs)
        val category = item.findViewById<EditText>(R.id.displayCategory)

        displayName.setText(cursuriList[position].numeCurs)
        displayCatchPhrase.setText(cursuriList[position].profCurs)
        bs.setText(cursuriList[position].prezente.toString())
        category.setText(cursuriList[position].linkCurs)

        return item
    }


}