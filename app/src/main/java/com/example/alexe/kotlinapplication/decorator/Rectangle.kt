package com.example.alexe.kotlinapplication.decorator

import android.util.Log

/**
 * Created by alexe on 3/6/18.
 */
class Rectangle : Shape{
    override fun draw() {
        println("Rectangle")
        Log.d("PATTERN_DECORATOR", "Rectangle")
    }

}