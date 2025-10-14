package org.example.lesson_2

fun main() {
    val buffPercent = 0.2
    val crystals = 7
    val iron = 11

    val bonusCrystals = (crystals * buffPercent).toInt()
    val bonusIron = (iron * buffPercent).toInt()

    println("""
        Кристаллы: $bonusCrystals
        Железная руда: $bonusIron
    """.trimIndent())
}
