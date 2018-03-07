package com.example.alexe.kotlinapplication.decorator

import android.util.Log

/**
 * Created by alexe on 3/6/18.
 */
class Cirlce: Shape {
    override fun draw() {
        println("Circle")
        Log.d("PATTERN_DECORATOR", "Cirlce")
    }

}