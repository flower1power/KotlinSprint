package org.example.lesson_2

fun main() {
        val numberOfStudents = 4
        val assessments: ByteArray = byteArrayOf(3, 4, 3, 5)
        val sumAssessments = assessments.reduce { acc, score -> (acc + score).toByte() }
        val avgScore = sumAssessments.toFloat() / numberOfStudents

        println(String.format("%.2f", avgScore))
}