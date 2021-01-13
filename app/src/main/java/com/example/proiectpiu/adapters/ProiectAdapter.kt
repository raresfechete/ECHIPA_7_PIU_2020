package com.example.proiectpiu.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.EditText
import android.widget.TextView
import com.example.proiectpiu.Curs
import com.example.proiectpiu.Proiect
import com.example.proiectpiu.R

class ProiectAdapter(private val context: Context, private var proiectList: ArrayList<Proiect>) : BaseAdapter() {

    private val inflater: LayoutInflater =
            context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount(): Int {
        return proiectList.size
    }

    override fun getItem(position: Int): Any {
        return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var item: View

        if (proiectList[position].lider == "-")
        {
            item = inflater.inflate(R.layout.proiect_fara_lider, parent, false)
            val displayProiect = item.findViewById<TextView>(R.id.nume_proiect_fara)
            val displayLider = item.findViewById<TextView>(R.id.nume_lider_fara)

            displayProiect.text = proiectList[position].numeProiect
            displayLider.text = proiectList[position].lider
        }
        else
        {
            item = inflater.inflate(R.layout.proiect_cu_lider, parent, false)

            val displayProiect = item.findViewById<TextView>(R.id.nume_proiect_cu)
            val displayLider = item.findViewById<TextView>(R.id.nume_lider_cu)

            displayProiect.text = proiectList[position].numeProiect
            displayLider.text = proiectList[position].lider
        }

        return item
    }


}