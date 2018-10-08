package com.redtaildevel.weatherapp

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface endpointsInterface{
    @GET("points/{addon}")
    fun getWeatherData(@Path("addon") apiAddendum:String): Call<WeatherApi>
}