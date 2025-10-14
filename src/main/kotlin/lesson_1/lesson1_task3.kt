package org.example.lesson_1

fun main(){
    val year = 1961
    var hour = 9
    var minute = 7

    println("""
        $year
        ${String.format("%02d", hour)}
        ${String.format("%02d", minute)}
    """.trimIndent())

    hour = 10
    minute = 55
    println(String.format("%02d:%02d", hour, minute))
}
