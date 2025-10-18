package org.example.lesson_4

const val MIN_CREW = 55
const val MAX_CREW = 70
const val RECOMMENDED_CREW = 70
const val MIN_PROVISIONS_NORMAL = 50
const val MIN_PROVISIONS_WITH_DAMAGE = 50

fun main() {
    print("Есть повреждения корпуса? (true/false): ")
    val hasDamage = readln().toBoolean()

    print("Количество экипажа: ")
    val crewCount = readln().toInt()

    print("Количество ящиков с провизией: ")
    val provisionsCount = readln().toInt()

    print("Благоприятная погода? (true/false): ")
    val isWeatherGood = readln().toBoolean()

    val canSail = (!hasDamage &&
            crewCount in MIN_CREW..MAX_CREW &&
            provisionsCount > MIN_PROVISIONS_NORMAL) ||
            (hasDamage && crewCount == RECOMMENDED_CREW &&
                    isWeatherGood &&
                    provisionsCount >= MIN_PROVISIONS_WITH_DAMAGE)

    println("Корабль может отправиться в плавание: $canSail")
}