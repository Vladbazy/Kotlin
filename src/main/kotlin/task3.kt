package org.example

fun main() {
    println("Try to guess:")
    val random = (0..10).random()

    while (true){
        val guessNumber = readln().toInt()

        when {
            guessNumber > random -> println("A lot")
            guessNumber < random -> println("Not enough")
            else -> {
                println("You guessed it!")
                break
            }
        }
    }
}