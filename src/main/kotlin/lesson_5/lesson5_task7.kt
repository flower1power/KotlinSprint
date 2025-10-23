package org.example.lesson_5

const val DISTANCE_BASE = 100

fun main() {
    println("Введите расстояние поездки (в километрах): ")
    val travelDistanceKm = readln().toFloat()

    println("Введите расход топлива на $DISTANCE_BASE км (в литрах): ")
    val fuelConsumptionPerHundredKm = readln().toFloat()

    println("Введите текущую цену за литр топлива: ")
    val pricePerLiterFuel = readln().toFloat()

    val totalFuel = (travelDistanceKm * fuelConsumptionPerHundredKm) / DISTANCE_BASE
    val totalPriceFuel = totalFuel * pricePerLiterFuel

    println(
        "Общее количество необходимого топлива: ${"%.2f".format(totalFuel)}, " +
                "итоговая стоимость поездки: ${"%.2f".format(totalPriceFuel)}"
    )
}