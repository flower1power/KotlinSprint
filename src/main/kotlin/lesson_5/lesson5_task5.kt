package org.example.lesson_5

import kotlin.random.Random

fun main() {
    val winningNumbers = List(3) { Random.nextInt(0, 43) }
    val userNumbers = mutableListOf<Int>()

    repeat(3) { i ->
        println("Введите число ${i + 1} от 0 до 42 включительно: ")
        userNumbers.add(readln().toInt())
    }


    val matches = winningNumbers.intersect(userNumbers).size
    val msg = when (matches) {
        3 -> "Поздравляем! Вы угадали все числа и выиграли джекпот!"
        2 -> "Вы угадали два числа и получили крупный приз!"
        1 -> "Вы угадали одно число и получили утешительный приз!"
        else -> "Неудача! Вы не угадали ни одного числа."
    }

    println(msg)
    println("Правильные числа для победы: ${winningNumbers.joinToString(", ")}")
}
