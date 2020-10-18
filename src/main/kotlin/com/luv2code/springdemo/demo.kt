package com.luv2code.springdemo

interface Coach {
    fun getDailyWorkout(): String
}

class BaseballCoach : Coach {
    override fun getDailyWorkout() = "Spend 30 minutes in batting practice"
}

class TrackCoach : Coach {
    override fun getDailyWorkout() = "Run 5 Km"
}