package com.redtaildevel.weatherapp

import rx.Observable
import retrofit2.http.GET
import retrofit2.http.Path


interface weatherInterface{
    @GET("points/{coordinates}")
    fun getWeatherData(@Path("coordinates") apiAddendum:String): Observable<weatherData>
}