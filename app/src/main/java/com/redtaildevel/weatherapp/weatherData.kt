package com.redtaildevel.weatherapp

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass

@RealmClass
open class weatherData: RealmObject() {
    @PrimaryKey
    @SerializedName("generatedAt")
    @Expose
    open var updatedTime: String? = null

    @SerializedName("name")
    @Expose
    open var name: String? = null
    open var isToday: Boolean = (name == "Today")

    @SerializedName("temperature")
    @Expose
    open var temperature: Int = 0

    @SerializedName("temperatureUnit")
    @Expose
    open var tempUnit: String? = null

    @SerializedName("shortForecast")
    @Expose
    open var shortForecast: String? = null
}
//Todo: Build a Farenheit to Celsius converter for that feature.