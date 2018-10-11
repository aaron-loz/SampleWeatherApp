package com.redtaildevel.weatherapp
import android.location.Location
import java.util.*


class weatherGeoLocation{

    //TODO: figure out what package allows geolocation data, and implement here.

    private var mCurrentLocation : Location = Location("Google Play")
    private var latitude = mCurrentLocation.latitude
    private var longitude = mCurrentLocation.longitude
    private var latestUpdateTime : Date = Calendar.getInstance().getTime()

    var locResult : String = "$latitude,$longitude/forecast"

    fun updateLocation(){
        val timeSinceLastUpdate : Int = Calendar.getInstance().getTime().compareTo(latestUpdateTime)
        if(timeSinceLastUpdate >= 300000) {
            mCurrentLocation = Location("Google Play")
            latestUpdateTime  = Calendar.getInstance().getTime()
        }
    }
    //This is all called only in WeatherAPI.
}