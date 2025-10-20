package org.example.lesson_5

const val GREETING_MESSAGE = "2 + 2 * 2 ="
const val EXPECTED_SOLUTION = 6
const val ACCESS_GRANTED = "Добро пожаловать!"
const val ACCESS_DENIED = "Доступ запрещен."

fun main() {
    print("Запишите ответ для уравнения: $GREETING_MESSAGE: ")
    val solution = readln().toInt()

    if (solution == EXPECTED_SOLUTION) {
        print(ACCESS_GRANTED)
    } else {
        print(ACCESS_DENIED)
    }
}
