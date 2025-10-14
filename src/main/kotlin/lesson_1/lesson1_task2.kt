package org.example.lesson_1


fun main(){
    val gratitudeMsg: String = "Спасибо за доверие к нашему магазину"
    val amountOrders: Int = 75;
    var countEmployees: Int = 2000
    println("Количество заказов: $amountOrders")
    println("Благодарственное сообщение: $gratitudeMsg")
//    println("Количество работников: $countEmployees")
    countEmployees--
    println("Количество работников: $countEmployees")
}


