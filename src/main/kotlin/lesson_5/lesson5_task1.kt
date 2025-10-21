package org.example.lesson_5

const val ACCESS_GRANTED = "Добро пожаловать!"
const val ACCESS_DENIED = "Доступ запрещен."

fun main() {
    val leftNum = 2
    val rightNum = 3
    val expectedSolution = leftNum + rightNum
    print("Запишите ответ для уравнения: $leftNum + $rightNum: ")
    val solution = readln().toInt()

    if (solution == expectedSolution) {
        print(ACCESS_GRANTED)
    } else {
        print(ACCESS_DENIED)
    }
}
