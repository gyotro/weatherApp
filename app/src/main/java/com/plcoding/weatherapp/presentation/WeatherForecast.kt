package com.plcoding.weatherapp.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.plcoding.weatherapp.domain.weather.WeatherData
import java.nio.file.WatchEvent

@Composable
fun WeatherForecast(
    state: WeatherState,
    modifier: Modifier = Modifier
) {
    state.weatherInfo?.weatherDataPerDay?.get(0)?.let { data->
        Column(
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {
            Text(text = "Today",
                fontSize = 20.sp,
                color = Color.White)
            Spacer(modifier = Modifier.height(16.dp))
            LazyRow(
            ) {
                items(data) {  item: WeatherData ->
                    HourlyWeatherDisplay(
                        weatherData = item,
                        modifier = Modifier.height(100.dp).padding(horizontal = 16.dp)
                    )
                }
            }
        }
    }
    Spacer(modifier = Modifier.height(16.dp))
    state.weatherInfo?.weatherDataPerDay?.get(1)?.let { data->
        Column(
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {
            Text(text = "Tomorrow",
                fontSize = 20.sp,
                color = Color.White)
            Spacer(modifier = Modifier.height(16.dp))
            LazyRow(
            ) {
                items(data) {  item: WeatherData ->
                    HourlyWeatherDisplay(
                        weatherData = item,
                        modifier = Modifier.height(100.dp).padding(horizontal = 16.dp)
                    )
                }
            }
        }
    }
}