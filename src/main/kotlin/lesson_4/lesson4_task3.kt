package org.example.lesson_4

const val REQUIRED_HUMIDITY_BOBS = 20
const val FORBIDDEN_SEASON_BOBS = "зима"
const val REQUIRED_SUNNY_WEATHER_BOBS = true
const val REQUIRED_TENT_OPEN_BOBS = true

fun main() {
    val isSunnyWeather: Boolean = true
    val isTentOpen: Boolean = true
    val humidity: Int = 20
    val currentSeason: String = "зима"

    val isGoodConditions = isSunnyWeather == REQUIRED_SUNNY_WEATHER_BOBS
            && isTentOpen == REQUIRED_TENT_OPEN_BOBS
            && humidity == REQUIRED_HUMIDITY_BOBS
            && currentSeason != FORBIDDEN_SEASON_BOBS

    println("Благоприятные ли условия сейчас для роста бобовых? $isGoodConditions")
}