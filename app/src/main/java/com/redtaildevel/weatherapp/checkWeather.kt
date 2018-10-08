package com.redtaildevel.weatherapp

//This will use the National Weather Service's API
//and receive the data for display later.

class checkWeather{
    fun grabWeather() {

    }
        /* val grab = js("$.get('https://api.weather.gov/points/40.750598,-73.982540/forecast', function (response){" +
                ")};");*/
        //TODO:Figure out how to inline grab API for android app development
        //temp = grab; //figure out how to grab API.
        // var is a normal variable, val is a constant
    //TODO: Create function that will allow it to display
    fun getTemp() : String{
        return temp;
    }
    private val temp = "70°"
}
/*
class Weather(const temp: int, url: String, id: int, time:){
    init{
        println("First initializer block that prints this. ${id}")
    }
    fun getTemp(): String{
        return "${temp}°"
    }
}
 */

/*class RetrofitClientInstance{
    private static Retrofit retrofit;
    private static final String BASE_URL = //change this from "https://jsonplaceholder.typicode.com";}
    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
}
 */