package com.example.alexe.kotlinapplication.strategy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.alexe.kotlinapplication.R

class StrategyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_strategy)

        val context : Location?

        val location = "London"

        when (location) {
            "London" -> context = Location(London());
            "Glasgow" -> context = Location(Glasgow());
            else -> { // Note the block
                context = Location(London());
            }
        }

        context.executeStrategy(this)

    }
}
