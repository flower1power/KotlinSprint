package org.example.lesson_5

import kotlin.random.Random

fun main() {
    val firstRandomNumber = Random.nextInt(0, 43)
    val secondRandomNumber = Random.nextInt(0, 43)

    println("Введите первое число от 0 до 42 включительно: ")
    val firstNumber = readln().toInt()
    println("Введите второе число от 0 до 42 включительно: ")
    val secondNumber = readln().toInt()

    val isFirstMatch = firstNumber == firstRandomNumber || firstNumber == secondRandomNumber
    val isSecondMatch = secondNumber == firstRandomNumber || secondNumber == secondRandomNumber

    val msg = when {
        isFirstMatch && isSecondMatch -> "Поздравляем! Вы выиграли главный приз!"
        isFirstMatch || isSecondMatch -> "Вы выиграли утешительный приз!"
        else -> "Неудача!"
    }

    println(msg)
    println("Правильные числа для победы: $firstRandomNumber и $secondRandomNumber")
}