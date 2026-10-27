package org.example

class NumberArray(private val numbers: IntArray) {

    // Сумма положительных элементов
    fun sumOfPositive(): Int {
        var sum = 0
        for (number in numbers) {
            if (number > 0) sum += number
        }
        return sum
    }

    // Произведение элементов массива
    fun product(): Long {
        var result = 1L
        for (number in numbers) {
            result *= number
        }
        return result
    }

    // Среднее арифметическое элементов массива
    fun average(): Double {
        if (numbers.isEmpty()) return 0.0
        return numbers.sum().toDouble() / numbers.size
    }

    override fun toString(): String = numbers.joinToString(", ", "[", "]")
}

fun main() {
    val numberArray = NumberArray(intArrayOf(4, -3, 8, 2, -1, 5))
    println("Array: $numberArray")
    println("Sum of positive elements: ${numberArray.sumOfPositive()}")
    println("Product of elements: ${numberArray.product()}")
    println("Average: ${numberArray.average()}")
}