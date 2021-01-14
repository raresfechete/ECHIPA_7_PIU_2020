package com.example.proiectpiu

class RankingList {

    fun getRankingsCurs1() : ArrayList<RankedStudent>{
        val list = ArrayList<RankedStudent>()

        list.add(RankedStudent("Farcasiu Paul", 4.2))
        list.add(RankedStudent("Fechete Rares", 2.5))
        list.add(RankedStudent("Pereanu Alexandru", 4.5))
        list.add(RankedStudent("Vasiu Cristian", 4.3))

        return list
    }
}