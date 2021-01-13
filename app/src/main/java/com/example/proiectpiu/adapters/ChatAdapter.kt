package com.example.proiectpiu.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.proiectpiu.Message
import com.example.proiectpiu.R
import com.example.proiectpiu.viewholders.ChatViewHolder

class ChatAdapter(private val context: Context, private val dataSource: ArrayList<Message>):
    RecyclerView.Adapter<ChatViewHolder>() {
    private val inflater: LayoutInflater =
        context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        val view = inflater.inflate(R.layout.chat_model_1,parent,false)
        return ChatViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataSource.size
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        holder.bindData(dataSource.get(position))
    }

    fun addItem(index: Int, message: Message){
        dataSource.add(index,message)
    }
}