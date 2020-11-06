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
    val maxWindDailyHour: Double?,
    @SerialName("max_wind_daily_minute")
    val maxWindDailyMinute: Double?,
    @SerialName("max_wind_daily_q")
    val maxWindDailyQ: Int?,
    @SerialName("max_wind_daily_time_q")
    val maxWindDailyTimeQ: Int?,
    @SerialName("max_wind_monthly_record")
    val maxWindMonthlyRecord: Double?,
    @SerialName("max_wind_monthly_record_day")
    val maxWindMonthlyRecordDay: Double?,
    @SerialName("max_wind_monthly_record_dir")
    val maxWindMonthlyRecordDir: String?,
    @SerialName("max_wind_monthly_record_dir_q")
    val maxWindMonthlyRecordDirQ: Int?,
    @SerialName("max_wind_monthly_record_month")
    val maxWindMonthlyRecordMonth: Double?,
    @SerialName("max_wind_monthly_record_q")
    val maxWindMonthlyRecordQ: Int?,
    @SerialName("max_wind_monthly_record_year")
    val maxWindMonthlyRecordYear: Double?,
    @SerialName("max_wind_record")
    val maxWindRecord: Double?,
    @SerialName("max_wind_record_day")
    val maxWindRecordDay: Double?,
    @SerialName("max_wind_record_dir")
    val maxWindRecordDir: String?,
    @SerialName("max_wind_record_dir_q")
    val maxWindRecordDirQ: Int?,
    @SerialName("max_wind_record_month")
    val maxWindRecordMonth: Double?,
    @SerialName("max_wind_record_q")
    val maxWindRecordQ: Int?,
    @SerialName("max_wind_record_year")
    val maxWindRecordYear: Double?,
    @SerialName("max_wind_start_year")
    val maxWindStartYear: Double?,
    @SerialName("minute")
    val minute: Int?,
    @SerialName("month")
    val month: Int?,
    @SerialName("updatedAt")
    val updatedAt: String?,
    @SerialName("wind_new_record_in_decade")
    val windNewRecordInDecade: Double?,
    @SerialName("wind_new_record_month")
    val windNewRecordMonth: Double?,
    @SerialName("year")
    val year: Int?
)