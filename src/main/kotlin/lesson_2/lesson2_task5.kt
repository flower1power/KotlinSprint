package org.example.lesson_2

import kotlin.math.pow

fun main() {
    val years = 20
    val initialAmount = 70_000
    val rate = 167
    val rateToPercent = rate.toDouble() / 100
    val timesPerYear = 1
    val resultAmount = initialAmount * (1 + rateToPercent / timesPerYear).pow(timesPerYear * years)

    println(String.format("%.3f", resultAmount))
    assert(resultAmount == 1536438.428)
}