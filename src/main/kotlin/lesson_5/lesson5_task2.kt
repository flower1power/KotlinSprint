package org.example.lesson_5

import java.time.LocalDate

const val AGE_OF_MAJORITY = 18
const val FULL_ACCESS_MSG = "Показать экран со скрытым контентом"
const val PARTIAL_ACCESS_MSG = "Показать часть контента"
const val NO_ACCESS_MSG = "Вернуть на базовый экран"

fun main() {
    val currentYear = LocalDate.now().year

    val greetingMsg = "Введите год рождения (1999):"
    print(greetingMsg)

    val userYear = readln().toInt()
    val userAge = currentYear - userYear

    val msg = when {
        userAge > AGE_OF_MAJORITY -> FULL_ACCESS_MSG
        userAge == 16 || userAge == 17 -> PARTIAL_ACCESS_MSG
        else -> NO_ACCESS_MSG
    }

    print(msg)
}
