package org.example.lesson_1

const val SECONDS_IN_MINUTE = 60
const val SECONDS_IN_HOUR = 3600

fun main() {
    val totalSecondInSpace = 6480

    val hours = totalSecondInSpace / SECONDS_IN_HOUR
    val minutes = (totalSecondInSpace % SECONDS_IN_HOUR) / SECONDS_IN_MINUTE
    val seconds = totalSecondInSpace % SECONDS_IN_MINUTE

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}