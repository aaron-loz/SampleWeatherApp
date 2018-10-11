package com.redtaildevel.weatherapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

//we want main activity to call on weatherRecieve class
class MainActivity : AppCompatActivity() {
    private val latestWeather = checkWeather()
    private val temp = "70°"
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       //avgDegreeView.setText(latestWeather.temp)
        //TODO: study how to use onCreate
        //TODO:Figure out why calling latestWeather.temp causes crashing.
        val avgDegreeView:TextView = findViewById<TextView>(R.id.avgDegreeView) as TextView;
        avgDegreeView.setText(latestWeather.getTemp())

    }
}
