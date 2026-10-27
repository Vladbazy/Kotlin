package org.example

fun main() {
    println("Enter the number of prime numbers n:")
    val n = readln().toInt()

    var count = 0
    var number = 2

    while (count < n) {
        if (isPrime(number)) {
            count++
            println("${getOrdinal(count)} number: $number")
        }
        number++
    }
}

fun isPrime(num: Int): Boolean {
    if (num < 2) return false
    for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) return false
    }
    return true
}

fun getOrdinal(n: Int): String {
    return when (n % 10) {
        1 -> "${n}-oe"
        2, 3, 4 -> "${n}-e"
        else -> "${n}-oe"
    }
}