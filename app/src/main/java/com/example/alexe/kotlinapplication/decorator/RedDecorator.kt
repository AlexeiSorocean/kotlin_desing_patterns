package com.example.alexe.kotlinapplication.decorator

import android.util.Log

/**
 * Created by alexe on 3/6/18.
 */
class RedDecorator (var shapeDecorator: Shape) : ShapeDecorator(shapeDecorator) {

    override fun draw() {
        shapeDecorator.draw();
        setRedBorder(shapeDecorator)

    }

    private fun setRedBorder(shapeDecorator: Shape) {
        Log.d("PATTERN_DECORATOR", "Red border added")
    }
}