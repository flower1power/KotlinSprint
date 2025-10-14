package org.example.lesson_1

const val GRATITUDE_MSG: String = "Спасибо за доверие к нашему магазину"

fun main(){
    val amountOrders: Int = 75;
    var countEmployees: Int = 2000
    println("Количество заказов: $amountOrders")
    println("Благодарственное сообщение: $GRATITUDE_MSG")
//    println("Количество работников: $countEmployees")
    countEmployees--
    println("Количество работников: $countEmployees")
}


