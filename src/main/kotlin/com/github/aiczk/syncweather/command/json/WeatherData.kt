package com.github.aiczk.syncweather.command.json


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WeatherData(
    @SerialName("about")
    val about: String?,
    @SerialName("author")
    val author: String?,
    @SerialName("datasource")
    val datasource: String?,
    @SerialName("stations")
    val stations: List<Station>?,
    @SerialName("version")
    val version: String?
)