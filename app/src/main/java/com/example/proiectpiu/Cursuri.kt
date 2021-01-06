package com.example.proiectpiu

class Cursuri {

    fun getCursuri():ArrayList<Curs>{

        val cursuri = ArrayList<Curs>()

        cursuri.add(Curs("PIU", "Teodor Stefanut",10,"www.moodle.cs.utcluj.ro/piu"))
        cursuri.add(Curs("PIU Laborator", "Cristi Miron",14,"www.moodle.cs.utcluj.ro/piu/lab"))
        cursuri.add(Curs("Sistem distribuite", "Claudia Pop",10,"www.moodle.cs.utcluj.ro/sd"))

        return cursuri

    }
}