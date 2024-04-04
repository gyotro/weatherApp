package com.plcoding.weatherapp.data.remote

import com.squareup.moshi.Json

//DTO: Data transfer Object
data class WeatherDto(
    @field: Json(name = "hourly")
    val weatherData: WeatherDataDto
)
