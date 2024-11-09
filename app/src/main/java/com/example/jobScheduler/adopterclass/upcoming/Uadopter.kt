package com.example.jobScheduler.adopterclass.upcoming


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import com.example.jobScheduler.R


class Uadopter (): RecyclerView.Adapter<Uadopter.viewholder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
        val layout= LayoutInflater.from(parent.context).inflate(R.layout.ulay,parent,false)
        return viewholder(layout)
    }
//

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(h: viewholder, position: Int) {


    }
    class viewholder(v: View): RecyclerView.ViewHolder(v){

    }
}