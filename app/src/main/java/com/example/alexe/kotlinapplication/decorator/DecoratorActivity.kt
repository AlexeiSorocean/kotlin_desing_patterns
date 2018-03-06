package com.example.alexe.kotlinapplication.decorator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.alexe.kotlinapplication.R

class DecoratorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var circle = Cirlce()

        var redCirle = RedDecorator(Cirlce())



    }
}
