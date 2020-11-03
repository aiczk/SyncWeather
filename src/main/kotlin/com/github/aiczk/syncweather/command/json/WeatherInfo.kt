package com.github.aiczk.syncweather.command.json

import kotlinx.serialization.Serializable

@Serializable
data class WeatherInfo(
    val about: String,
    val author: String,
    val datasource: String,
    val stations: List<Station>,
    val version: String
)