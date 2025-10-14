package org.example.lesson_2

fun main(){
    val hours = 9
    val minutes = 39
    val timePathToMinutes = 457

    val totalMinutes = hours * 60 + minutes + timePathToMinutes
    val arrivalHours = (totalMinutes / 60) % 24
    val arrivalMinutes = totalMinutes % 60

    println("Поезд прибудет в: ${String.format("%02d:%02d", arrivalHours, arrivalMinutes)}")
}
