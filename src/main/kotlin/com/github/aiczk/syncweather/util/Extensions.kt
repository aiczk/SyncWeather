package com.github.aiczk.syncweather.util

infix fun <T> Boolean.then(other: T) = if(this) other else null