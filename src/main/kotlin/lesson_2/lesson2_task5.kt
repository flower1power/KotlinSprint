package org.example.lesson_2

import kotlin.math.pow

fun main() {
    val years = 20
    val initialAmount = 70_000
    val rate = 0.167
    val timesPerYear = 1
    val resultAmount = initialAmount * (1 + rate / timesPerYear).pow(timesPerYear * years)

    println(String.format("%.3f", resultAmount))
    assert(resultAmount == 1536438.428)
}
