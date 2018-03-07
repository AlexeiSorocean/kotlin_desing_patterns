package com.example.alexe.kotlinapplication.strategy

/**
 * Created by alexe on 3/7/18.
 */
class London : Strategy {
    override fun reportWeather(): String {
        return "Constant drizzle"
    }

}