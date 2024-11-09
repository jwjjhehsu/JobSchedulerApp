package com.example.jobScheduler.adopterclass.todays

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.recyclerview.widget.RecyclerView

import com.example.jobScheduler.R





class Tadopter() : RecyclerView.Adapter<Tadopter.viewholder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.tlay,parent,false)
        return viewholder(layout)
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(
        holder: Tadopter.viewholder,
        position: Int,
        ) {


    }

    class viewholder(v: View): RecyclerView.ViewHolder(v)
    {

    }

}
