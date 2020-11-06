package com.github.aiczk.syncweather.command.json

import kotlinx.serialization.Serializable

@Serializable
data class Station(
    val address: String,
    val address_sub: String?,
    val alt_anemometer: Double?,
    val alt_anemometer_sub: Double?,
    val alt_thermometer: Double?,
    val alt_thermometer_sub: Double?,
    val elevation: Int,
    val elevation_sub: Int?,
    val lat: Double,
    val lat_sub: Double?,
    val lng: Double,
    val lng_sub: Double?,
    val max_gust: Double?,
    val max_temp: Int?,
    val max_wind: Int?,
    val min_temp: Int?,
    val preall: Preall,
    val pref_en: String,
    val pref_ja: String,
    val snow_stn_num: Int?,
    val start_date_multi: String?,
    val start_date_rain: String,
    val stn_daylight: Boolean,
    val stn_multipoint: Boolean,
    val stn_name_en: String,
    val stn_name_ja: String,
    val stn_name_ja_kana: String,
    val stn_num: Int,
    val stn_temp: Boolean,
    val stn_type: String,
    val target_main_en: String?,
    val target_main_ja: String?,
    val target_sub_en: String?,
    val target_sub_ja: String?,
    val updatedAt: String
)