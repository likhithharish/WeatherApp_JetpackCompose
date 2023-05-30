package com.cleanArch.weatherapp.data.remote

import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {

    //Querying the api and getting the data
    @GET("v1/forecast?hourly=temperature_2m,weathercode,realtivehumidity_2m,windspeed_10m,pressure_msl")
    suspend fun getWeatherData(
        @Query("latitude") lat: Double,
        @Query("longitude") long: Double
    )
}