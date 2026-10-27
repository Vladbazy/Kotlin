package org.example

fun main() {
    println("Enter any digit or numbers:")

    val numbers = mutableListOf<Int>()
    while (true){
        val input = readln().toInt()
        if (input == 0) break
        numbers.add(input)
    }

    val count = numbers.size
    val sum = numbers.sum()
    val mid = sum / count.toFloat()
    println(numbers)
    println(count)
    println(sum)
    println(mid)
}