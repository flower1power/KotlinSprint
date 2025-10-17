package org.example.lesson_2

fun main() {
    val buff = 20
    val buffToPercent = buff.toFloat() / 100
    val crystals = 7
    val iron = 11

    val bonusCrystals = crystals * buffToPercent
    val bonusIron = iron * buffToPercent

    println("""
        Кристаллы: $bonusCrystals
        Железная руда: $bonusIron
    """.trimIndent())
}
