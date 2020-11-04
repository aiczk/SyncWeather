package com.github.aiczk.syncweather.util

import com.github.kittinunf.fuel.httpGet
import com.github.kittinunf.result.Result

class HttpAccess {
    fun getText(url: String): String {
        val (_, _, result) = url.httpGet().responseString()

        return when (result) {
            is Result.Failure -> {
                val ex = result.getException()
                ex.toString()
            }
            is Result.Success -> {
                result.get()
            }
        }
    }
}