package com.redtaildevel.weatherapp

data class weatherData(
    val context: List<String>? = null,
    val id: String? = null,
    val type: String? = null,
    val geometry: Geometry? = null,
    val properties: Properties? = null
)

data class Geometry(
    val type: String,
    val coordinates: List<Double>
)

data class Properties(
    val id: String,
    val type: String,
    val cwa: String,
    val forecastOffice: String,
    val gridX: Int,
    val gridY: Int,
    val forecast: String,
    val forecastHourly: String,
    val forecastGridData: String,
    val observationStations: String,
    val relativeLocation: RelativeLocation,
    val forecastZone: String,
    val county: String,
    val fireWeatherZone: String,
    val timeZone: String,
    val radarStation: String
)

data class RelativeLocation(
    val type: String,
    val geometry: Geometry,
    val properties: locationProperties
)

data class locationProperties(
    val city: String,
    val state: String,
    val distance: Distance,
    val bearing: Bearing
)

data class Distance(
    val value: Double,
    val unitCode: String
)

data class Bearing(
    val value: Int,
    val unitCode: String
)

