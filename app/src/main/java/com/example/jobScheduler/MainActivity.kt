package com.example.jobScheduler

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity

import androidx.recyclerview.widget.LinearLayoutManager
import com.example.jobScheduler.adopterclass.todays.Tadopter
import com.example.jobScheduler.databinding.ActivityMainBinding
import com.example.jobScheduler.adopterclass.upcoming.Uadopter

import com.example.task.classes.Cnave
import com.example.task.classes.Nave
import com.example.task.classes.naveobj


class MainActivity : AppCompatActivity() {
    lateinit var b: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)
        b.todayrecycle.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        b.todayrecycle.adapter=Tadopter()
        b.upcomingrecycler.layoutManager = LinearLayoutManager(this)
        b.upcomingrecycler.adapter=Uadopter()


    }

    fun nave() {
        Cnave(this)
        Nave.getInstance(this.applicationContext)
        Nave.add(b.navigatation)
        naveobj.naveobj.imageButton1.setImageResource((R.drawable.home))
        naveobj.naveobj.imageButton2.setImageResource((R.drawable.clipboard))
        naveobj.naveobj.imageButton3.setImageResource((R.drawable.add))
        naveobj.naveobj.imageButton4.setImageResource((R.drawable.chat))
        naveobj.naveobj.imageButton5.setImageResource((R.drawable.chart))
    }
}
