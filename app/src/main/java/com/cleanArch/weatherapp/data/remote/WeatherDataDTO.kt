package com.cleanArch.weatherapp.data.remote

import com.squareup.moshi.Json

data class WeatherDataDTO(
    val time: List<String>,

    @field:Json(name = "")
    val temperature : List<Double>,

    @field:Json(name = "")
    val weatherCodes : List<Int>,

    @field:Json(name = "")
    val pressures: List<Double>,

    @field:Json(name = "")
    val windspeeds: List<Double>,

    @field:Json(name = "")
    val humidities: List<Double>
)
