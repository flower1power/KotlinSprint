package org.example.lesson_2

const val MINUTES_IN_HOUR = 60
const val HOURS_IN_DAY = 24

fun main() {
    val departureHours = 9
    val departureMinutes = 39
    val travelTimeMinutes = 457

    val totalMinutes = departureHours * MINUTES_IN_HOUR + departureMinutes + travelTimeMinutes
    val arrivalHours = (totalMinutes / MINUTES_IN_HOUR) % HOURS_IN_DAY
    val arrivalMinutes = totalMinutes % MINUTES_IN_HOUR

    println("Поезд прибудет в: ${String.format("%02d:%02d", arrivalHours, arrivalMinutes)}")
}