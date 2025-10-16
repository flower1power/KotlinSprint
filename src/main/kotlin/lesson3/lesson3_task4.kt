package org.example.lesson3

fun main() {
    var moveNumber = 1
    var moveFrom = "E2"
    var moveTo = "E4"

    var moveStr = "$moveFrom-$moveTo;$moveNumber"
    println(moveStr)

    moveNumber++
    moveFrom = "D2"
    moveTo = "D3"

    moveStr = "$moveFrom-$moveTo;$moveNumber"
    println(moveStr)
}