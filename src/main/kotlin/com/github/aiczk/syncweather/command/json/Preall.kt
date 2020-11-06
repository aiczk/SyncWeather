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
    val precip12h: Int?,
    @SerialName("precip_12h_daily_max")
    val precip12hDailyMax: Int?,
    @SerialName("precip_12h_daily_max_q")
    val precip12hDailyMaxQ: Int?,
    @SerialName("precip_12h_new_record_in_decade")
    val precip12hNewRecordInDecade: Int?,
    @SerialName("precip_12h_new_record_month")
    val precip12hNewRecordMonth: Int?,
    @SerialName("precip_12h_q")
    val precip12hQ: Int?,
    @SerialName("precip_1h")
    val precip1h: Int?,
    @SerialName("precip_1h_daily_max")
    val precip1hDailyMax: Int?,
    @SerialName("precip_1h_daily_max_q")
    val precip1hDailyMaxQ: Int?,
    @SerialName("precip_1h_new_record_in_decade")
    val precip1hNewRecordInDecade: Int?,
    @SerialName("precip_1h_new_record_month")
    val precip1hNewRecordMonth: Int?,
    @SerialName("precip_1h_q")
    val precip1hQ: Int?,
    @SerialName("precip_24h")
    val precip24h: Int?,
    @SerialName("precip_24h_daily_max")
    val precip24hDailyMax: Int?,
    @SerialName("precip_24h_daily_max_q")
    val precip24hDailyMaxQ: Int?,
    @SerialName("precip_24h_new_record_in_decade")
    val precip24hNewRecordInDecade: Int?,
    @SerialName("precip_24h_new_record_month")
    val precip24hNewRecordMonth: Int?,
    @SerialName("precip_24h_q")
    val precip24hQ: Int?,
    @SerialName("precip_3h")
    val precip3h: Int?,
    @SerialName("precip_3h_daily_max")
    val precip3hDailyMax: Int?,
    @SerialName("precip_3h_daily_max_q")
    val precip3hDailyMaxQ: Int?,
    @SerialName("precip_3h_new_record_in_decade")
    val precip3hNewRecordInDecade: Int?,
    @SerialName("precip_3h_new_record_month")
    val precip3hNewRecordMonth: Int?,
    @SerialName("precip_3h_q")
    val precip3hQ: Int?,
    @SerialName("precip_48h")
    val precip48h: Int?,
    @SerialName("precip_48h_daily_max")
    val precip48hDailyMax: Int?,
    @SerialName("precip_48h_daily_max_q")
    val precip48hDailyMaxQ: Int?,
    @SerialName("precip_48h_new_record_in_decade")
    val precip48hNewRecordInDecade: Int?,
    @SerialName("precip_48h_new_record_month")
    val precip48hNewRecordMonth: Int?,
    @SerialName("precip_48h_q")
    val precip48hQ: Int?,
    @SerialName("precip_6h")
    val precip6h: Int?,
    @SerialName("precip_6h_daily_max")
    val precip6hDailyMax: Int?,
    @SerialName("precip_6h_daily_max_q")
    val precip6hDailyMaxQ: Int?,
    @SerialName("precip_6h_new_record_in_decade")
    val precip6hNewRecordInDecade: Int?,
    @SerialName("precip_6h_new_record_month")
    val precip6hNewRecordMonth: Int?,
    @SerialName("precip_6h_q")
    val precip6hQ: Int?,
    @SerialName("precip_72h")
    val precip72h: Int?,
    @SerialName("precip_72h_daily_max")
    val precip72hDailyMax: Int?,
    @SerialName("precip_72h_daily_max_q")
    val precip72hDailyMaxQ: Int?,
    @SerialName("precip_72h_new_record_in_decade")
    val precip72hNewRecordInDecade: Int?,
    @SerialName("precip_72h_new_record_month")
    val precip72hNewRecordMonth: Int?,
    @SerialName("precip_72h_q")
    val precip72hQ: Int?,
    @SerialName("precip_daily")
    val precipDaily: Int?,
    @SerialName("precip_daily_new_record_in_decade")
    val precipDailyNewRecordInDecade: Int?,
    @SerialName("precip_daily_new_record_month")
    val precipDailyNewRecordMonth: Int?,
    @SerialName("precip_daily_q")
    val precipDailyQ: Int?,
    @SerialName("updatedAt")
    val updatedAt: String?,
    @SerialName("year")
    val year: Int?
)