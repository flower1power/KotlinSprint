package org.example.lesson_1

fun main(){
    val year = 1961
    var hour = 9
    var minute = 7

    println("""
        $year
        $hour
        $minute
    """.trimIndent())

    hour = 10
    minute = 55
    println("$hour:$minute")
}
