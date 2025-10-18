package org.example.lesson_4

fun main() {
    val startDay = 1
    val currentDay = 5
    val isEvenDay = (currentDay - startDay) % 2 == 1

    println("""
        Упражнения для рук:    ${!isEvenDay}
        Упражнения для ног:    ${isEvenDay}
        Упражнения для спины:  ${isEvenDay}
        Упражнения для пресса: ${!isEvenDay}
    """.trimIndent())
}