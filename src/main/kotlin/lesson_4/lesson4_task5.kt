package org.example.lesson_4

const val MIN_CREW = 55
const val MAX_CREW = 70
const val RECOMMENDED_CREW = 70
const val MIN_PROVISIONS_NORMAL = 50
const val MIN_PROVISIONS_WITH_DAMAGE = 50
const val SHIP_MUST_BE_UNDAMAGED = true
const val WEATHER_MUST_BE_GOOD = true


fun main() {
    print("Есть повреждения корпуса? (true/false): ")
    val hasDamage = readln().toBoolean()

    print("Количество экипажа: ")
    val crewCount = readln().toInt()

    print("Количество ящиков с провизией: ")
    val provisionsCount = readln().toInt()

    print("Благоприятная погода? (true/false): ")
    val isWeatherGood = readln().toBoolean()


    val canSail =
        (hasDamage != SHIP_MUST_BE_UNDAMAGED && crewCount in MIN_CREW..MAX_CREW && provisionsCount > MIN_PROVISIONS_NORMAL) ||
                (hasDamage == SHIP_MUST_BE_UNDAMAGED && crewCount == RECOMMENDED_CREW && isWeatherGood == WEATHER_MUST_BE_GOOD && provisionsCount >= MIN_PROVISIONS_WITH_DAMAGE)

    println("Корабль может отправиться в плавание: $canSail")
}