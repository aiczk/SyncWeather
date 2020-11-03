package com.github.aiczk.syncweather.command.json

import kotlinx.serialization.Serializable

@Serializable
data class Station(
    val address: String,
    val address_sub: Any,
    val alt_anemometer: Any,
    val alt_anemometer_sub: Any,
    val alt_thermometer: Any,
    val alt_thermometer_sub: Any,
    val elevation: Int,
    val elevation_sub: Any,
    val lat: Double,
    val lat_sub: Any,
    val lng: Double,
    val lng_sub: Any,
    val max_gust: Any,
    val max_temp: Any,
    val max_wind: Any,
    val min_temp: Any,
    val preall: Preall,
    val pref_en: String,
    val pref_ja: String,
    val snow_stn_num: Any,
    val start_date_multi: Any,
    val start_date_rain: String,
    val stn_daylight: Boolean,
    val stn_multipoint: Boolean,
    val stn_name_en: String,
    val stn_name_ja: String,
    val stn_name_ja_kana: String,
    val stn_num: Int,
    val stn_temp: Boolean,
    val stn_type: String,
    val target_main_en: Any,
    val target_main_ja: Any,
    val target_sub_en: Any,
    val target_sub_ja: Any,
    val updatedAt: String
)