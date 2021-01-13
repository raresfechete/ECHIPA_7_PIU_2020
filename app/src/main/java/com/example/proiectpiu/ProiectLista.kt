package com.example.proiectpiu

class ProiectLista {

    fun getProiecte():ArrayList<Proiect>{

        var proiect = ArrayList<Proiect>()

        proiect.add(Proiect("Proiect PIU","-"))
        proiect.add(Proiect("Proiect SD","Ghita"))

        return proiect
    }
    
}