package com.example.alexe.kotlinapplication.decorator

/**
 * Created by alexe on 3/6/18.
 */
class BlackDecorator(var shapeDecorator: ShapeDecorator) : ShapeDecorator(shapeDecorator) {

    override fun draw() {
        shapeDecorator.draw();
        setRedBorder(shapeDecorator)

    }

    private fun setRedBorder(shapeDecorator: ShapeDecorator) {
        println("Black border added")
    }
}