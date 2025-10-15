package org.example.lesson_1

const val SECONDS_IN_MINUTE = 60
const val SECONDS_IN_HOUR = 3600
const val TOTAL_SECONDS_IN_SPACE = 6480

fun main() {

    val hours = TOTAL_SECONDS_IN_SPACE / SECONDS_IN_HOUR
    val minutes = (TOTAL_SECONDS_IN_SPACE % SECONDS_IN_HOUR) / SECONDS_IN_MINUTE
    val seconds = TOTAL_SECONDS_IN_SPACE % SECONDS_IN_MINUTE

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}