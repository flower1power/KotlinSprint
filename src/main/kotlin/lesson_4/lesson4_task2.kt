package org.example.lesson_4

fun main() {
    val weightMinKg = 35
    val weightMaxKg = 100
    val volumeMaxLiters  = 100

    val weightKg1 = 20
    val volumeLiters1 = 80

    println("Груз с весом $weightKg1 кг и объемом $volumeLiters1 л соответствует категории 'Average': " +
            "${weightKg1 > weightMinKg && weightKg1 <= weightMaxKg && volumeLiters1 < volumeMaxLiters}"
    )

    val weightKg2 = 50
    val volumeLiters2 = 100

    println(
        "Груз с весом $weightKg2 кг и объемом $volumeLiters2 л соответствует категории 'Average': " +
                "${weightKg2 > weightMinKg && weightKg2 <= weightMaxKg && volumeLiters2 < volumeMaxLiters}"
    )
}