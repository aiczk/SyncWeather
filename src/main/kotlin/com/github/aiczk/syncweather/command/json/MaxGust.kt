package com.github.aiczk.syncweather.command.json


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MaxGust(
    @SerialName("day")
    val day: Int?,
    @SerialName("gust_new_record_in_decade")
    val gustNewRecordInDecade: Int?,
    @SerialName("gust_new_record_month")
    val gustNewRecordMonth: Int?,
    @SerialName("hour")
    val hour: Int?,
    @SerialName("max_gust_daily")
    val maxGustDaily: Double?,
    @SerialName("max_gust_daily_dir")
    val maxGustDailyDir: String?,
    @SerialName("max_gust_daily_dir_q")
    val maxGustDailyDirQ: Int?,
    @SerialName("max_gust_daily_hour")
    val maxGustDailyHour: Int?,
    @SerialName("max_gust_daily_minute")
    val maxGustDailyMinute: Int?,
    @SerialName("max_gust_daily_q")
    val maxGustDailyQ: Int?,
    @SerialName("max_gust_daily_time_q")
    val maxGustDailyTimeQ: Int?,
    @SerialName("max_gust_monthly_record")
    val maxGustMonthlyRecord: Double?,
    @SerialName("max_gust_monthly_record_day")
    val maxGustMonthlyRecordDay: Int?,
    @SerialName("max_gust_monthly_record_dir")
    val maxGustMonthlyRecordDir: String?,
    @SerialName("max_gust_monthly_record_dir_q")
    val maxGustMonthlyRecordDirQ: Int?,
    @SerialName("max_gust_monthly_record_month")
    val maxGustMonthlyRecordMonth: Int?,
    @SerialName("max_gust_monthly_record_q")
    val maxGustMonthlyRecordQ: Int?,
    @SerialName("max_gust_monthly_record_year")
    val maxGustMonthlyRecordYear: Int?,
    @SerialName("max_gust_record")
    val maxGustRecord: Double?,
    @SerialName("max_gust_record_day")
    val maxGustRecordDay: Int?,
    @SerialName("max_gust_record_dir")
    val maxGustRecordDir: String?,
    @SerialName("max_gust_record_dir_q")
    val maxGustRecordDirQ: Int?,
    @SerialName("max_gust_record_month")
    val maxGustRecordMonth: Int?,
    @SerialName("max_gust_record_q")
    val maxGustRecordQ: Int?,
    @SerialName("max_gust_record_year")
    val maxGustRecordYear: Int?,
    @SerialName("max_gust_start_year")
    val maxGustStartYear: Int?,
    @SerialName("minute")
    val minute: Int?,
    @SerialName("month")
    val month: Int?,
    @SerialName("updatedAt")
    val updatedAt: String?,
    @SerialName("year")
    val year: Int?
)