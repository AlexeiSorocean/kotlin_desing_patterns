package com.example.alexe.kotlinapplication.decorator

/**
 * Created by alexe on 3/6/18.
 */
class RedDecorator (var shapeDecorator: Shape) : ShapeDecorator(shapeDecorator) {

    override fun draw() {
        shapeDecorator.draw();
        setRedBorder(shapeDecorator)

    }

    private fun setRedBorder(shapeDecorator: Shape) {
        println("Red border added")
    }
}