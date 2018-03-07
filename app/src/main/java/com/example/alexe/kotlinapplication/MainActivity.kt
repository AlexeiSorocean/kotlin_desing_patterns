    package com.example.alexe.kotlinapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.alexe.kotlinapplication.decorator.DecoratorActivity
import com.example.alexe.kotlinapplication.template.TemplateActivity

    class MainActivity : AppCompatActivity(), ClickListener {
        override fun onClick(position: Int) {
             var  intent = Intent(this, DecoratorActivity::class.java)
            when (position) {
                0 -> intent = Intent(this, DecoratorActivity::class.java)
                1 -> intent = Intent(this, TemplateActivity::class.java)
            }
            startActivity(intent)
        }

        private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var recyclerView: RecyclerView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler_view)

        linearLayoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = linearLayoutManager

        val patternList = arrayListOf<PatternItem>(PatternItem("Decorator"),
                PatternItem("Template"))

        val customAdapter = CustomAdapter(patternList, this)

        recyclerView.adapter = customAdapter




    }


    }

    interface ClickListener {
        fun onClick(position: Int)
    }

