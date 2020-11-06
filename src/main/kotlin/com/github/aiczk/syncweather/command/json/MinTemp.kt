package com.github.aiczk.syncweather.command.json


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MinTemp(
    @SerialName("day")
    val day: Int?,
    @SerialName("hour")
    val hour: Int?,
    @SerialName("is_seasonal_min_temp")
    val isSeasonalMinTemp: Int?,
    @SerialName("min_temp_record")
    val minTempRecord: Double?,
    @SerialName("min_temp_record_day")
    val minTempRecordDay: Int?,
    @SerialName("min_temp_record_month")
    val minTempRecordMonth: Int?,
    @SerialName("min_temp_record_q")
    val minTempRecordQ: Int?,
    @SerialName("min_temp_record_same_month")
    val minTempRecordSameMonth: Double?,
    @SerialName("min_temp_record_same_month_day")
    val minTempRecordSameMonthDay: Int?,
    @SerialName("min_temp_record_same_month_month")
    val minTempRecordSameMonthMonth: Int?,
    @SerialName("min_temp_record_same_month_q")
    val minTempRecordSameMonthQ: Int?,
    @SerialName("min_temp_record_same_month_year")
    val minTempRecordSameMonthYear: Int?,
    @SerialName("min_temp_record_year")
    val minTempRecordYear: Int?,
    @SerialName("min_temp_start_year")
    val minTempStartYear: Int?,
    @SerialName("minute")
    val minute: Int?,
    @SerialName("month")
    val month: Int?,
    @SerialName("temp_daily_min")
    val tempDailyMin: Double?,
    @SerialName("temp_daily_min_corresponding_month")
    val tempDailyMinCorrespondingMonth: Int?,
    @SerialName("temp_daily_min_corresponding_season_in_month")
    val tempDailyMinCorrespondingSeasonInMonth: Int?,
    @SerialName("temp_daily_min_diff_to_avg")
    val tempDailyMinDiffToAvg: Double?,
    @SerialName("temp_daily_min_diff_to_yesterday")
    val tempDailyMinDiffToYesterday: Double?,
    @SerialName("temp_daily_min_new_record_in_decade")
    val tempDailyMinNewRecordInDecade: Int?,
    @SerialName("temp_daily_min_new_record_month")
    val tempDailyMinNewRecordMonth: Int?,
    @SerialName("temp_daily_min_q")
    val tempDailyMinQ: Int?,
    @SerialName("temp_daily_min_time_hour")
    val tempDailyMinTimeHour: Int?,
    @SerialName("temp_daily_min_time_minute")
    val tempDailyMinTimeMinute: Int?,
    @SerialName("temp_daily_min_time_q")
    val tempDailyMinTimeQ: Int?,
    @SerialName("updatedAt")
    val updatedAt: String?,
    @SerialName("year")
    val year: Int?,
    @SerialName("yearly_min_temp")
    val yearlyMinTemp: Double?,
    @SerialName("yearly_min_temp_day")
    val yearlyMinTempDay: Int?,
    @SerialName("yearly_min_temp_month")
    val yearlyMinTempMonth: Int?,
    @SerialName("yearly_min_temp_q")
    val yearlyMinTempQ: Int?,
    @SerialName("yearly_min_temp_year")
    val yearlyMinTempYear: Int?
)