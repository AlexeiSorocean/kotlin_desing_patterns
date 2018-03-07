package com.example.alexe.kotlinapplication.template

import android.app.Activity
import android.content.Context
import android.widget.TextView
import com.example.alexe.kotlinapplication.R

/**
 * Created by alexe on 3/7/18.
 */
class News: Story() {
    lateinit var textHeadline : TextView

    override fun setText(context: Context) {
        source = "News"
        if (context is Activity) {
            textHeadline =
                    context.findViewById<TextView>(R.id.text_headline)
        }
    }

    override fun setImage(context: Context) {


    }

    override fun setTitle(context: Context) {

        if (context is Activity) {
            context.setTitle("News")
        }
    }

    override fun init(context: Context) {
        source = "NEWS";
    }

}