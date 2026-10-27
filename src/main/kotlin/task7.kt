package org.example

import kotlin.math.sqrt

fun sqr(n: Double): Double = n * n

fun discriminant(a: Double, b: Double, c: Double): Double = sqr(b) - 4 * a * c

fun rootsNumber(a: Double, b: Double, c: Double): Int {
    val d = discriminant(a, b, c)
    return when {
        d > 0 -> 2
        d == 0.0 -> 1
        else -> 0
    }
}

fun quadraticRoot(a: Double, b: Double, c: Double) {
    if (a == 0.0) {
        println("a = 0, so the equation is not quadratic.")
        return
    }
    val d = discriminant(a, b, c)
    println("Discriminant D = $d")
    when (rootsNumber(a, b, c)) {
        2 -> {
            val x1 = (-b + sqrt(d)) / (2 * a)
            val x2 = (-b - sqrt(d)) / (2 * a)
            println("The equation has 2 roots: x1 = $x1, x2 = $x2")
        }
        1 -> {
            val x = -b / (2 * a)
            println("The equation has 1 root: x = $x")
        }
        else -> println("The equation has no real roots")
    }
}

// Ввод числа с повтором, если введено не число (дробная часть — через точку или запятую)
private fun readCoefficient(prompt: String): Double {
    while (true) {
        print(prompt)
        val value = readln().trim().replace(',', '.').toDoubleOrNull()
        if (value != null) return value
        println("Error: please enter a number.")
    }
}

fun main() {
    println("Equation: ax^2 + bx + c = 0")
    val a = readCoefficient("a = ")
    val b = readCoefficient("b = ")
    val c = readCoefficient("c = ")
    quadraticRoot(a, b, c)
}