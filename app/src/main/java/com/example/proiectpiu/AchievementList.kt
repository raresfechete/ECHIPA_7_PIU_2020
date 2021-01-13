package com.example.proiectpiu

class AchievementList {

    fun getAchievementsUnlocked():ArrayList<Achievement>{

        var achievements = ArrayList<Achievement>()

        achievements.add(Achievement("Nota 10 PIU","14.01.2021",R.drawable.p20))
        achievements.add(Achievement("Prezenta la curs","15.12.2020",R.drawable.p22))

        return achievements
    }

    fun getAchievementsAvailable():ArrayList<Achievement>{

        var achievements = ArrayList<Achievement>()

        achievements.add(Achievement("Fara restante","14.02.2021",R.drawable.poza9))
        achievements.add(Achievement("Restantier","14.02.2020",R.drawable.p7))
        achievements.add(Achievement("All achievements","14.02.2020",R.drawable.p8))

        return achievements
    }

    fun getAchievementsProfil():ArrayList<Achievement>{

        var achievements = ArrayList<Achievement>()

        achievements.add(Achievement("Nota 10 PIU","14.01.2021",R.drawable.p20))
        achievements.add(Achievement("Prezenta la curs","15.12.2020",R.drawable.p22))

        return achievements
    }


}