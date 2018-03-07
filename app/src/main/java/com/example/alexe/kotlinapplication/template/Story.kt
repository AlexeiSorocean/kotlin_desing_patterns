package com.example.alexe.kotlinapplication.template

import android.content.Context
import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by alexe on 3/6/18.
 */
abstract class Story {
    lateinit var source: String;

    fun publish (context: Context) {
        init(context)
        setDate(context)
        setTitle(context)
        setImage(context)
        setText(context)

    }

    abstract fun setText(context: Context)

    abstract fun setImage(context: Context)

    abstract fun setTitle(context: Context)

    abstract fun init(context: Context)

    fun setDate(context: Context) {
        val calendar = GregorianCalendar()
        val format = SimpleDateFormat("MMMM d")

        format.timeZone = calendar.timeZone

    }


}
