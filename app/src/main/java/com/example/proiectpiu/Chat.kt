package com.example.proiectpiu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.proiectpiu.adapters.ChatAdapter
import java.text.SimpleDateFormat
import java.util.*
import kotlin.concurrent.schedule

class Chat : AppCompatActivity() {

    private var chatAdapter: ChatAdapter? = null
    private lateinit var submitButton: Button
    private lateinit var qaButton: Button
    private var messageNumber: Int = 2



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        val recyclerRef = findViewById<RecyclerView>(R.id.chat_rv)
        submitButton = findViewById(R.id.chat_submit_button)
        qaButton = findViewById(R.id.chat_qa_button)


        chatAdapter = ChatAdapter(this@Chat, Messages().getMessages())
        recyclerRef.adapter = chatAdapter

        val linearLayoutManager = LinearLayoutManager(this)
        recyclerRef.layoutManager = linearLayoutManager

        submitButton.setOnClickListener(){
            val messageText: EditText = findViewById(R.id.chat_message_text)
            if(!messageText.text.isEmpty()){
                val sdf = SimpleDateFormat("dd/M/yyyy hh:mm:ss")
                val currentDate = sdf.format(Date())

                val message =  Message("Cristi", currentDate,messageText.text.toString())
                messageText.setText("")
                chatAdapter!!.addItem(0, message)
                chatAdapter!!.notifyItemInserted(0)
                recyclerRef.smoothScrollToPosition(0)

                Timer("AutoReply",false).schedule(2000){
                    Handler(mainLooper).post{
                        val computerCurrentDate = sdf.format(Date())
                        val autoMessage = Message("Computer", computerCurrentDate,"Automated message $messageNumber")
                        chatAdapter!!.addItem(0,autoMessage)
                        chatAdapter!!.notifyItemInserted(0)
                        recyclerRef.smoothScrollToPosition(0)

                        messageNumber+=1

                    }
                }
            }

        }

        qaButton.setOnClickListener(){
            val messageText: EditText = findViewById(R.id.chat_message_text)
            if(!messageText.text.isEmpty()){
                val sdf = SimpleDateFormat("dd/M/yyyy hh:mm:ss")
                val currentDate = sdf.format(Date())

                val message =  Message("Cristi", currentDate,messageText.text.toString())
                messageText.setText("A inceput modul Q&A")
                messageText.setTextColor(R.color.rozulMamei);
                chatAdapter!!.addItem(0, message)
                chatAdapter!!.notifyItemInserted(0)
                recyclerRef.smoothScrollToPosition(0)

            }

        }

    }

}