package com.example.alexe.kotlinapplication

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by alexe on 3/6/18.
 */
internal class CustomAdapter(val patternList: ArrayList<PatternItem>, val clickListener: ClickListener) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {


    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.tvTitle?.text = patternList[position].title
        holder?.itemView?.setOnClickListener(View.OnClickListener {clickListener.onClick(position) })
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.pattern_item, parent, false)

        return ViewHolder(v);
    }

    override fun getItemCount(): Int {
        return patternList.size
    }

    internal class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)



    }



}
