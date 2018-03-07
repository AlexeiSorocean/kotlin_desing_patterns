package com.example.alexe.kotlinapplication.template

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.alexe.kotlinapplication.R

class TemplateActivity : AppCompatActivity() {

    var source = "NEWS"
    var story = News() as Story

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visitor)

        var button = findViewById<Button>(R.id.btnChange)

        button.setOnClickListener {
            if (story.source == "News") {
                story = Sport()
            } else {
                story = News()
            }

            story.publish(this)
        }

        story.publish(this)

    }
}
