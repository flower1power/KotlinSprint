package org.example.lesson_5

const val MIN_NUMBER = 0
const val MAX_NUMBER = 42

fun main() {
    val firstRandomNumber = (MIN_NUMBER..MAX_NUMBER).random()
    val secondRandomNumber = (MIN_NUMBER..MAX_NUMBER).random()

    println("Введите первое число от $MIN_NUMBER до $MAX_NUMBER включительно: ")
    val firstNumber = readln().toInt()
    println("Введите второе число от $MIN_NUMBER до $MAX_NUMBER включительно: ")
    val secondNumber = readln().toInt()

    val isFirstMatch = firstNumber == firstRandomNumber || firstNumber == secondRandomNumber
    val isSecondMatch = secondNumber == firstRandomNumber || secondNumber == secondRandomNumber

    if (isFirstMatch && isSecondMatch) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (isFirstMatch || isSecondMatch) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }

    println("Правильные числа для победы: $firstRandomNumber и $secondRandomNumber")
}