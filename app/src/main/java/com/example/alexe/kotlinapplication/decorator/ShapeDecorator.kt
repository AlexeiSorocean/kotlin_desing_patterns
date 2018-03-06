package com.example.alexe.kotlinapplication.decorator

/**
 * Created by alexe on 3/6/18.
 */
abstract class ShapeDecorator(val decorateShape : Shape) : Shape {
    override fun draw() {
        decorateShape.draw();
    }
}