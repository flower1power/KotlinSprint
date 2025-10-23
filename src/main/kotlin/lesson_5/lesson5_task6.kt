package org.example.lesson_5

const val CM_IN_M = 100
const val IMT_UNDERWEIGHT = 18.5
const val IMT_NORMAL = 25.0
const val IMT_OVERWEIGHT = 30.0

fun main() {
    println("Введите свой рост в см: ")
    val height = readln().toFloat()

    println("Введите свой вес в кг: ")
    val weight = readln().toFloat()

    val heightM = height / CM_IN_M
    val bmi = weight / (heightM * heightM)

    val category = when {
        bmi < IMT_UNDERWEIGHT -> "Недостаточная масса тела"
        bmi < IMT_NORMAL -> "Нормальная масса тела"
        bmi < IMT_OVERWEIGHT -> "Избыточная масса тела"
        else -> "Ожирение"
    }
    println("Категория: $category")
    println("IMT = ${String.format("%02f", bmi)}")
}