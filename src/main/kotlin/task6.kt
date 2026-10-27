package org.example

fun main() {
    val array = arrayOf(3, -2, 7, 5, 1, -4, 6)
    println("Array: ${array.joinToString(", ")}")

    // Цикл for
    var product = 1L
    var min = array[0]
    var max = array[0]
    for (element in array) {
        product *= element
        if (element < min) min = element
        if (element > max) max = element
    }
    println("for:           proizvedenie = $product, min = $min, max = $max")

    // Цикл while
    product = 1L
    min = array[0]
    max = array[0]
    var i = 0
    while (i < array.size) {
        product *= array[i]
        if (array[i] < min) min = array[i]
        if (array[i] > max) max = array[i]
        i++
    }
    println("while:            proizvedenie = $product, min = $min, max = $max")

    // Оператор forEach
    product = 1L
    min = array[0]
    max = array[0]
    array.forEach { element ->
        product *= element
        if (element < min) min = element
        if (element > max) max = element
    }
    println("forEach:         proizvedenie = $product, min = $min, max = $max")

    // Функция reduce()
    val productReduce = array.map { it.toLong() }.reduce { acc, element -> acc * element }
    val minReduce = array.reduce { acc, element -> if (element < acc) element else acc }
    val maxReduce = array.reduce { acc, element -> if (element > acc) element else acc }
    println("reduce():        proizvedenie = $productReduce, min = $minReduce, max = $maxReduce")

    // Функции min() и max()
    println("min() and max():   min = ${array.min()}, max = ${array.max()}")
}