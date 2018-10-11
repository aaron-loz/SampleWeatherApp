package com.redtaildevel.weatherapp

import com.google.gson.ExclusionStrategy
import com.google.gson.FieldAttributes
import com.google.gson.GsonBuilder
import io.realm.Realm
import io.realm.RealmObject
import retrofit.GsonConverterFactory
import retrofit.Retrofit
import retrofit.RxJavaCallAdapterFactory

class weatherBuilder {
    val gson = GsonBuilder().setExclusionStrategies(object : ExclusionStrategy {
        override fun shouldSkipField(f: FieldAttributes): Boolean {
            return f.declaringClass == RealmObject::class.java
        }

        override fun shouldSkipClass(clazz: Class<*>): Boolean {
            return false
        }
    }).create()

    val retrofit: Retrofit = Retrofit.Builder()
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create(gson))
            .baseUrl("https://api.weather.gov/")
            .build()

    val weatherService: weatherInterface = retrofit.create(
            weatherInterface::class.java
    )

    var locationNeeded: weatherGeoLocation = weatherGeoLocation()
    var currentWeather : weatherData= weatherData()

    fun getObservable() {
        weatherService.getWeatherData(locationNeeded.locResult)
                .subscribe { currentWeather ->

                }
    }

    val realm = Realm.getDefaultInstance()
    //get data if already saved
}