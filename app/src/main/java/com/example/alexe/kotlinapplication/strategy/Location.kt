package com.example.alexe.kotlinapplication.strategy

import android.app.Activity
import android.content.Context
import android.widget.TextView
import com.example.alexe.kotlinapplication.R

/**
 * Created by alexe on 3/7/18.
 */
class Location {
    var stragegy: Strategy

    constructor(stragegy: Strategy) {
        this.stragegy = stragegy
    }

    fun executeStrategy(context : Context) {
        var textView = TextView(context)
        if (context is Activity) {
            textView = context.findViewById<TextView>(R.id.text_view)
        }

        textView.setText(stragegy.reportWeather())

    }
}