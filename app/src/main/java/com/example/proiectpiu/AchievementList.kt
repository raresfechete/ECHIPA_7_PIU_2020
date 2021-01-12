package com.example.proiectpiu

class AchievementList {
    private var achievements = ArrayList<Achievement>()

    init {
        achievements.add()
        achievements.add()
        achievements.add()
    }

    fun getachievement():ArrayList<Achievement>{
        return achievements
    }

    fun addCurs(achievement: Achievement){
        achievements.add(achievement)
    }
}