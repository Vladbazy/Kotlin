package org.example

import kotlin.math.sqrt

class Vector(val x: Double, val y: Double, val z: Double) {

    // длина вектора
    fun length(): Double {
        return sqrt(x * x + y * y + z * z)
    }

    // скалярное произведение, infix позволяет писать v1 scalar v2
    infix fun scalar(other: Vector): Double {
        return x * other.x + y * other.y + z * other.z
    }

    // скалярное произведение через знак *
    operator fun times(other: Vector): Double {
        return x * other.x + y * other.y + z * other.z
    }
}

// скалярное произведение вне класса
fun scalarProduct(a: Vector, b: Vector): Double {
    return a.x * b.x + a.y * b.y + a.z * b.z
}

fun main() {
    val v1 = Vector(1.0, 2.0, 3.0)
    val v2 = Vector(3.0, 2.0, 1.0)

    println("Length of v1: ${v1.length()}")
    println("Length of v2: ${v2.length()}")
    println("v1.scalar(v2) = ${v1.scalar(v2)}")
    println("v1 scalar v2 = ${v1 scalar v2}")
    println("Vector(1.0, 2.0, 3.0) * Vector(3.0, 2.0, 1.0) = ${Vector(1.0, 2.0, 3.0) * Vector(3.0, 2.0, 1.0)}")
    println("scalarProduct(v1, v2) = ${scalarProduct(v1, v2)}")
}