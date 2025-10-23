package org.example.lesson_4

fun main() {
    val reservedTablesToday = 13
    val reservedTablesTomorrow = 9

    println(
        "Доступность столиков на сегодня: ${reservedTablesToday < 13}\nДоступность столиков на завтра: ${reservedTablesTomorrow < 13}"
    )
}