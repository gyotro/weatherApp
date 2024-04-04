package com.plcoding.weatherapp.domain.weather

data class WeatherInfo(
        val weatherDataPerDay: Map<Int, List<WeatherData>>, //the first field is the day ( 0 --> today, 1 --> tomorrow, ..)
        val currentWeatherData: WeatherData?
    )
