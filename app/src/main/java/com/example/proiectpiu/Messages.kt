package com.example.proiectpiu

class Messages {

    fun getMessages(): ArrayList<Message>{
        val messages = ArrayList<Message>()

        messages.add(Message("Computer","5.05.2020 12:00:00","Automated message: 1"))

        return messages
    }
}