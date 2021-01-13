package com.example.proiectpiu.viewholders

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.proiectpiu.Message
import com.example.proiectpiu.R

class ChatViewHolder(private val view: View): RecyclerView.ViewHolder(view){

    private lateinit var senderRef: TextView
    private lateinit var messageRef: TextView
    private lateinit var timestampRef: TextView
    private var data: Message? = null

    init {
        senderRef = view.findViewById(R.id.chat_sender_info)
        messageRef = view.findViewById(R.id.chat_message)
        timestampRef = view.findViewById(R.id.chat_timestamp)
    }

    fun bindData(data: Message) {
        this.data = data
        senderRef.text = data.sender
        messageRef.text = data.message
        timestampRef.text = data.time

    }

}
