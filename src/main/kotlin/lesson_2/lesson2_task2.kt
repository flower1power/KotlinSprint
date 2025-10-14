package org.example.lesson_2

fun main(){
    val countWorker = 50
    val salaryWorker = 30000
    val countIntern = 30
    val salaryIntern = 20000

    val salaryExpensesWorker = countWorker * salaryWorker
    val salaryExpensesIntern = countIntern * salaryIntern
    val generalExpenses = salaryExpensesIntern + salaryExpensesWorker
    val avgSalary = generalExpenses / (countIntern + countWorker)

    println("""
        Расходы на зарплату сотрудников: $salaryExpensesWorker
        Расходы на зарплату стажеров: $salaryExpensesIntern
        Общие расходы по зарплатам: $generalExpenses
        Средняя зарплата одного сотрудника: $avgSalary
    """.trimIndent())
}