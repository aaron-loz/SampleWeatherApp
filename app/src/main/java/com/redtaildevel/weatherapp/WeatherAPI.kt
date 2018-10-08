package com.redtaildevel.weatherapp

import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/*WeatherAPI houses the API endpoint, any other qualifications needed,
 and the location of the user. The location is given to the checkweather class when needed.
 The location updates if last update was a half hour ago.
*/
class WeatherApi{
    private val apiEndpoint = "https://api.weather.gov/"
    //TODO: append end with coordinates of current area.(e.g. NYC = https://api.weather.gov/points/40.7128,-73.9352)
    private var locationNeeded : weatherGeoLocation = weatherGeoLocation()
    val apiAddendum : String = locationNeeded.locResult
    val weatherData = null//Todo: create an object to hold the weather data
    fun refresh(){
        locationNeeded.updateLocation()
        getWeatherData()
    }
    fun getWeatherData() : String{ //Todo: remove once
        val retrofit = Retrofit.Builder().baseUrl(apiEndpoint).addConverterFactory(GsonConverterFactory.create(Gson()))
                .build()

        val service = retrofit.create(endpointsInterface::class.java)
        val response: Call<WeatherApi> = service.getWeatherData(apiAddendum)
        val listOfText = response.toString()
        return listOfText;//Todo: parse response's body. Use youtube vids to figure it out.
    }
}

