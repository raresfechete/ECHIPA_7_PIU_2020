package com.example.proiectpiu

class Quizuri {

    fun getQuizuri():ArrayList<Quiz>{

        val quizuri = ArrayList<Quiz>()

        quizuri.add(Quiz("PIU","Quiz WEB","60/100"))
        quizuri.add(Quiz("PIU","Quiz ANDROID","101/100"))
        quizuri.add(Quiz("SRF","K nearest neighbour","100/100"))

        return quizuri

    }

}