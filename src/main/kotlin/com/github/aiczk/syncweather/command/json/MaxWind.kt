package com.github.aiczk.syncweather.command.json


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MaxWind(
    @SerialName("day")
    val day: Int?,
    @SerialName("hour")
    val hour: Int?,
    @SerialName("max_wind_daily")
    val maxWindDaily: Double?,
    @SerialName("max_wind_daily_dir")
    val maxWindDailyDir: String?,
    @SerialName("max_wind_daily_dir_q")
    val maxWindDailyDirQ: Int?,
    @SerialName("max_wind_daily_hour")
    val maxWindDailyHour: Int?,
    @SerialName("max_wind_daily_minute")
    val maxWindDailyMinute: Int?,
    @SerialName("max_wind_daily_q")
    val maxWindDailyQ: Int?,
    @SerialName("max_wind_daily_time_q")
    val maxWindDailyTimeQ: Int?,
    @SerialName("max_wind_monthly_record")
    val maxWindMonthlyRecord: Int?,
    @SerialName("max_wind_monthly_record_day")
    val maxWindMonthlyRecordDay: Int?,
    @SerialName("max_wind_monthly_record_dir")
    val maxWindMonthlyRecordDir: String?,
    @SerialName("max_wind_monthly_record_dir_q")
    val maxWindMonthlyRecordDirQ: Int?,
    @SerialName("max_wind_monthly_record_month")
    val maxWindMonthlyRecordMonth: Int?,
    @SerialName("max_wind_monthly_record_q")
    val maxWindMonthlyRecordQ: Int?,
    @SerialName("max_wind_monthly_record_year")
    val maxWindMonthlyRecordYear: Int?,
    @SerialName("max_wind_record")
    val maxWindRecord: Int?,
    @SerialName("max_wind_record_day")
    val maxWindRecordDay: Int?,
    @SerialName("max_wind_record_dir")
    val maxWindRecordDir: String?,
    @SerialName("max_wind_record_dir_q")
    val maxWindRecordDirQ: Int?,
    @SerialName("max_wind_record_month")
    val maxWindRecordMonth: Int?,
    @SerialName("max_wind_record_q")
    val maxWindRecordQ: Int?,
    @SerialName("max_wind_record_year")
    val maxWindRecordYear: Int?,
    @SerialName("max_wind_start_year")
    val maxWindStartYear: Int?,
    @SerialName("minute")
    val minute: Int?,
    @SerialName("month")
    val month: Int?,
    @SerialName("updatedAt")
    val updatedAt: String?,
    @SerialName("wind_new_record_in_decade")
    val windNewRecordInDecade: Int?,
    @SerialName("wind_new_record_month")
    val windNewRecordMonth: Int?,
    @SerialName("year")
    val year: Int?
)