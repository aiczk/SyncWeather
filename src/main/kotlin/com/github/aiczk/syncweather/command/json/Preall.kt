package com.github.aiczk.syncweather.command.json


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Preall(
    @SerialName("day")
    val day: Int?,
    @SerialName("hour")
    val hour: Int?,
    @SerialName("minute")
    val minute: Int?,
    @SerialName("month")
    val month: Int?,
    @SerialName("precip_12h")
    val precip12h: Double?,
    @SerialName("precip_12h_daily_max")
    val precip12hDailyMax: Double?,
    @SerialName("precip_12h_daily_max_q")
    val precip12hDailyMaxQ: Double?,
    @SerialName("precip_12h_new_record_in_decade")
    val precip12hNewRecordInDecade: Double?,
    @SerialName("precip_12h_new_record_month")
    val precip12hNewRecordMonth: Double?,
    @SerialName("precip_12h_q")
    val precip12hQ: Double?,
    @SerialName("precip_1h")
    val precip1h: Double?,
    @SerialName("precip_1h_daily_max")
    val precip1hDailyMax: Double?,
    @SerialName("precip_1h_daily_max_q")
    val precip1hDailyMaxQ: Double?,
    @SerialName("precip_1h_new_record_in_decade")
    val precip1hNewRecordInDecade: Double?,
    @SerialName("precip_1h_new_record_month")
    val precip1hNewRecordMonth: Double?,
    @SerialName("precip_1h_q")
    val precip1hQ: Double?,
    @SerialName("precip_24h")
    val precip24h: Double?,
    @SerialName("precip_24h_daily_max")
    val precip24hDailyMax: Double?,
    @SerialName("precip_24h_daily_max_q")
    val precip24hDailyMaxQ: Double?,
    @SerialName("precip_24h_new_record_in_decade")
    val precip24hNewRecordInDecade: Double?,
    @SerialName("precip_24h_new_record_month")
    val precip24hNewRecordMonth: Double?,
    @SerialName("precip_24h_q")
    val precip24hQ: Double?,
    @SerialName("precip_3h")
    val precip3h: Double?,
    @SerialName("precip_3h_daily_max")
    val precip3hDailyMax: Double?,
    @SerialName("precip_3h_daily_max_q")
    val precip3hDailyMaxQ: Double?,
    @SerialName("precip_3h_new_record_in_decade")
    val precip3hNewRecordInDecade: Double?,
    @SerialName("precip_3h_new_record_month")
    val precip3hNewRecordMonth: Double?,
    @SerialName("precip_3h_q")
    val precip3hQ: Double?,
    @SerialName("precip_48h")
    val precip48h: Double?,
    @SerialName("precip_48h_daily_max")
    val precip48hDailyMax: Double?,
    @SerialName("precip_48h_daily_max_q")
    val precip48hDailyMaxQ: Double?,
    @SerialName("precip_48h_new_record_in_decade")
    val precip48hNewRecordInDecade: Double?,
    @SerialName("precip_48h_new_record_month")
    val precip48hNewRecordMonth: Double?,
    @SerialName("precip_48h_q")
    val precip48hQ: Double?,
    @SerialName("precip_6h")
    val precip6h: Double?,
    @SerialName("precip_6h_daily_max")
    val precip6hDailyMax: Double?,
    @SerialName("precip_6h_daily_max_q")
    val precip6hDailyMaxQ: Double?,
    @SerialName("precip_6h_new_record_in_decade")
    val precip6hNewRecordInDecade: Double?,
    @SerialName("precip_6h_new_record_month")
    val precip6hNewRecordMonth: Double?,
    @SerialName("precip_6h_q")
    val precip6hQ: Double?,
    @SerialName("precip_72h")
    val precip72h: Double?,
    @SerialName("precip_72h_daily_max")
    val precip72hDailyMax: Double?,
    @SerialName("precip_72h_daily_max_q")
    val precip72hDailyMaxQ: Double?,
    @SerialName("precip_72h_new_record_in_decade")
    val precip72hNewRecordInDecade: Double?,
    @SerialName("precip_72h_new_record_month")
    val precip72hNewRecordMonth: Double?,
    @SerialName("precip_72h_q")
    val precip72hQ: Double?,
    @SerialName("precip_daily")
    val precipDaily: Double?,
    @SerialName("precip_daily_new_record_in_decade")
    val precipDailyNewRecordInDecade: Double?,
    @SerialName("precip_daily_new_record_month")
    val precipDailyNewRecordMonth: Double?,
    @SerialName("precip_daily_q")
    val precipDailyQ: Double?,
    @SerialName("updatedAt")
    val updatedAt: String?,
    @SerialName("year")
    val year: Int?
)