package org.example.lesson_4

const val COUNT_TABLE = 13

fun main() {
    val countReservedTablesToday = COUNT_TABLE
    val countReservedTablesTomorrow = 9
    val isFreeTablesToday = countReservedTablesToday < COUNT_TABLE
    val isFreeTablesTomorrow = countReservedTablesTomorrow < COUNT_TABLE

    println("Доступность столиков на сегодня: ${isFreeTablesToday}\n" +
            "Доступность столиков на завтра: ${isFreeTablesTomorrow}")
}