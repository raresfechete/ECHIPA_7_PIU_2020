package com.example.proiectpiu

class RankingList {

    fun getRankingsCurs0() : ArrayList<RankedStudent>{
        val list = ArrayList<RankedStudent>()

        list.add(RankedStudent("Farcasiu Paul", 4.2))
        list.add(RankedStudent("Fechete Rares", 2.5))
        list.add(RankedStudent("Pereanu Alexandru", 4.5))
        list.add(RankedStudent("Vasiu Cristian", 4.3))
        list.add(RankedStudent("Gigel Mare", 1.7))
        list.add(RankedStudent("Ionut Vesel", 2.9))
        list.add(RankedStudent("Maria Ana", 3.7))

        return list
    }

    fun getRankingsCurs1() : ArrayList<RankedStudent>{
        val list = ArrayList<RankedStudent>()

        list.add(RankedStudent("Farcasiu Paul", 2.2))
        list.add(RankedStudent("Fechete Rares", 3.5))
        list.add(RankedStudent("Pereanu Alexandru", 2.5))
        list.add(RankedStudent("Vasiu Cristian", 3.3))
        list.add(RankedStudent("Gigel Mare", 4.7))
        list.add(RankedStudent("Ionut Vesel", 3.9))
        list.add(RankedStudent("Maria Ana", 1.7))

        return list
    }

    fun getRankingsCurs2() : ArrayList<RankedStudent>{
        val list = ArrayList<RankedStudent>()

        list.add(RankedStudent("Farcasiu Paul", 2.9))
        list.add(RankedStudent("Fechete Rares", 1.5))
        list.add(RankedStudent("Pereanu Alexandru", 2.1))
        list.add(RankedStudent("Vasiu Cristian", 3.1))
        list.add(RankedStudent("Gigel Mare", 2.7))
        list.add(RankedStudent("Ionut Vesel", 3.9))
        list.add(RankedStudent("Maria Ana", 2.7))

        return list
    }

    fun getRankingsCurs3() : ArrayList<RankedStudent>{
        val list = ArrayList<RankedStudent>()

        list.add(RankedStudent("Farcasiu Paul", 4.2))
        list.add(RankedStudent("Fechete Rares", 4.5))
        list.add(RankedStudent("Pereanu Alexandru", 4.5))
        list.add(RankedStudent("Vasiu Cristian", 4.3))
        list.add(RankedStudent("Gigel Mare", 4.7))
        list.add(RankedStudent("Ionut Vesel", 3.9))
        list.add(RankedStudent("Maria Ana", 2.7))

        return list
    }
}