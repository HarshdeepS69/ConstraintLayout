package com.harsh.constraintlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewActivity : AppCompatActivity() {
    var recyclerView :RecyclerView? = null
    var arrayListt : ArrayList<News> = arrayListOf<News>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        recyclerView?.layoutManager = LinearLayoutManager(this)

        var arrayListofimg = arrayOf(
        R.drawable.atmosphere_icon,
        R.drawable.alarm_clock,
        R.drawable.clear_icon,
        R.drawable.clouds,
        R.drawable.drizzle_icon,
        R.drawable.fork_spoon,
        R.drawable.minus,
        R.drawable.salad,
        R.drawable.thunderstorm_icon

        )
        var arrayListNewsHeading = arrayOf(

            "sfewfefe",
            "wfewfeerr",
            "seferfeergr",
            "efgergergreg",
            "rgfrgregrerger",
            "refergregregrg",
            "ergfergrggreger",
            "ergergergreg",
            "ergregregrg"


        )
        for (index in arrayListNewsHeading.indices){
            //val news = News(arrayListNewsHeading[index],arrayListofimg[index])
         //   arrayListt.add(news)
        }
    }
}