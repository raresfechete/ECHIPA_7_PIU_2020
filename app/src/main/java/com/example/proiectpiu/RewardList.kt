package com.example.proiectpiu

class RewardList {

    fun getRewardsProfil():ArrayList<Reward>{

        var reward = ArrayList<Reward>()

        reward.add(Reward("Elev preferat",R.drawable.p21))
        reward.add(Reward("Mare caracter",R.drawable.p20))

        return reward
    }

}