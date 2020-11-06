package com.github.aiczk.syncweather.command.json


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Station(
    @SerialName("address")
    val address: String?,
    @SerialName("address_sub")
    val addressSub: String?,
    @SerialName("alt_anemometer")
    val altAnemometer: Int?,
    @SerialName("alt_anemometer_sub")
    val altAnemometerSub: Int?,
    @SerialName("alt_thermometer")
    val altThermometer: Int?,
    @SerialName("alt_thermometer_sub")
    val altThermometerSub: Int?,
    @SerialName("elevation")
    val elevation: Int?,
    @SerialName("elevation_sub")
    val elevationSub: Int?,
    @SerialName("lat")
    val lat: Double?,
    @SerialName("lat_sub")
    val latSub: Double?,
    @SerialName("lng")
    val lng: Double?,
    @SerialName("lng_sub")
    val lngSub: Double?,
    @SerialName("max_gust")
    val maxGust: MaxGust?,
    @SerialName("max_temp")
    val maxTemp: MaxTemp?,
    @SerialName("max_wind")
    val maxWind: MaxWind?,
    @SerialName("min_temp")
    val minTemp: MinTemp?,
    @SerialName("preall")
    val preall: Preall?,
    @SerialName("pref_en")
    val prefEn: String?,
    @SerialName("pref_ja")
    val prefJa: String?,
    @SerialName("snow_stn_num")
    val snowStnNum: Int?,
    @SerialName("start_date_multi")
    val startDateMulti: String?,
    @SerialName("start_date_rain")
    val startDateRain: String?,
    @SerialName("stn_daylight")
    val stnDaylight: Boolean?,
    @SerialName("stn_multipoint")
    val stnMultipoint: Boolean?,
    @SerialName("stn_name_en")
    val stnNameEn: String?,
    @SerialName("stn_name_ja")
    val stnNameJa: String?,
    @SerialName("stn_name_ja_kana")
    val stnNameJaKana: String?,
    @SerialName("stn_num")
    val stnNum: Int?,
    @SerialName("stn_temp")
    val stnTemp: Boolean?,
    @SerialName("stn_type")
    val stnType: String?,
    @SerialName("target_main_en")
    val targetMainEn: String?,
    @SerialName("target_main_ja")
    val targetMainJa: String?,
    @SerialName("target_sub_en")
    val targetSubEn: String?,
    @SerialName("target_sub_ja")
    val targetSubJa: String?,
    @SerialName("updatedAt")
    val updatedAt: String?
)