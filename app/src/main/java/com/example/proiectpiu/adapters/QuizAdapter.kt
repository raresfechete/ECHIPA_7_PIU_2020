package com.example.proiectpiu.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.EditText
import android.widget.ListView
import com.example.proiectpiu.Quiz
import com.example.proiectpiu.R

class QuizAdapter(private val context: Context, private var quizList: ArrayList<Quiz>) : BaseAdapter() {

    var res: Int=1

    private val inflater: LayoutInflater =
        context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount(): Int {
        return quizList.size
    }

    override fun getItem(position: Int): Any {
        return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    fun setReso(int: Int)
    {
        res=int
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {



        val item = inflater.inflate(res, parent, false)

        val displayCursName = item.findViewById<EditText>(R.id.displayCursName)
        val displayQuizTitle = item.findViewById<EditText>(R.id.displayQuizTitle)
        val displayPunctaj = item.findViewById<EditText>(R.id.displayPunctaj)

        displayCursName.setText(quizList[position].numeCurs)
        displayQuizTitle.setText(quizList[position].titluQuiz)
        displayPunctaj.setText(quizList[position].punctaj)


        return item

    }
}