package org.example.lesson_3

fun main() {
    val moveStr = "D2-D4;0"

    val pars = moveStr.split("-", ";")
    val moveFrom = pars[0]
    val moveTo = pars[1]
    val moveNumber = pars[2]
    println("Откуда: $moveFrom")
    println("Куда: $moveTo")
    println("Номер хода: $moveNumber")
}