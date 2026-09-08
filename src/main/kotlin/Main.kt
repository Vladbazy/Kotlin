package org.example

fun main() {
    println("Enter Positive integer: ")

    val pos_int = readln()
    val number = pos_int.toInt()
    var first = number
    while (first >= 10){
        first /= 10
    }
    val last = number % 10
    val sum_fist_last =first + last
    println(sum_fist_last)

    val first_pos = pos_int.first()
    val last_pos = pos_int.last()
    val sum2 = first_pos.digitToInt() + last_pos.digitToInt()
    println(sum2)
}