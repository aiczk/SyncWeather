package com.github.aiczk.syncweather.command.json


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MaxTemp(
    @SerialName("day")
    val day: Int?,
    @SerialName("hour")
    val hour: Int?,
    @SerialName("is_yearly_max_temp")
    val isYearlyMaxTemp: Int?,
    @SerialName("max_temp_record")
    val maxTempRecord: Double?,
    @SerialName("max_temp_record_day")
    val maxTempRecordDay: Int?,
    @SerialName("max_temp_record_month")
    val maxTempRecordMonth: Int?,
    @SerialName("max_temp_record_q")
    val maxTempRecordQ: Int?,
    @SerialName("max_temp_record_same_month")
    val maxTempRecordSameMonth: Double?,
    @SerialName("max_temp_record_same_month_day")
    val maxTempRecordSameMonthDay: Int?,
    @SerialName("max_temp_record_same_month_month")
    val maxTempRecordSameMonthMonth: Int?,
    @SerialName("max_temp_record_same_month_q")
    val maxTempRecordSameMonthQ: Int?,
    @SerialName("max_temp_record_same_month_year")
    val maxTempRecordSameMonthYear: Int?,
    @SerialName("max_temp_record_year")
    val maxTempRecordYear: Int?,
    @SerialName("max_temp_start_year")
    val maxTempStartYear: Int?,
    @SerialName("minute")
    val minute: Int?,
    @SerialName("month")
    val month: Int?,
    @SerialName("temp_daily_max")
    val tempDailyMax: Double?,
    @SerialName("temp_daily_max_corresponding_month")
    val tempDailyMaxCorrespondingMonth: Int?,
    @SerialName("temp_daily_max_corresponding_season_in_month")
    val tempDailyMaxCorrespondingSeasonInMonth: Int?,
    @SerialName("temp_daily_max_diff_to_avg")
    val tempDailyMaxDiffToAvg: Double?,
    @SerialName("temp_daily_max_diff_to_yesterday")
    val tempDailyMaxDiffToYesterday: Int?,
    @SerialName("temp_daily_max_new_record_in_decade")
    val tempDailyMaxNewRecordInDecade: Int?,
    @SerialName("temp_daily_max_new_record_month")
    val tempDailyMaxNewRecordMonth: Int?,
    @SerialName("temp_daily_max_q")
    val tempDailyMaxQ: Int?,
    @SerialName("temp_daily_max_time_hour")
    val tempDailyMaxTimeHour: Int?,
    @SerialName("temp_daily_max_time_minute")
    val tempDailyMaxTimeMinute: Int?,
    @SerialName("temp_daily_max_time_q")
    val tempDailyMaxTimeQ: Int?,
    @SerialName("updatedAt")
    val updatedAt: String?,
    @SerialName("year")
    val year: Int?,
    @SerialName("yearly_max_temp")
    val yearlyMaxTemp: Double?,
    @SerialName("yearly_max_temp_day")
    val yearlyMaxTempDay: Int?,
    @SerialName("yearly_max_temp_month")
    val yearlyMaxTempMonth: Int?,
    @SerialName("yearly_max_temp_q")
    val yearlyMaxTempQ: Int?,
    @SerialName("yearly_max_temp_year")
    val yearlyMaxTempYear: Int?
)