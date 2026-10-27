package org.example

fun main(){
    println("for")
    val possitive_number = listOf(5, 2, 1, 10, 5, 6, 3, 20, 9)

    //цикл for
    for(i in 1..possitive_number.size - 2){
        val selected = possitive_number[i]
        val previous = possitive_number[i-1]
        val next = possitive_number[i+1]

        if(selected > next && selected > previous)
            println(selected)
    }
println("--------------------------------------")
    println("while")
    // цикл while
    var i = 1
    while(i < possitive_number.size - 1){
        val selected = possitive_number[i]
        val previous = possitive_number[i-1]
        val next = possitive_number[i+1]

        if(selected > next && selected > previous)
            println(selected)
        i++
    }
    println("--------------------------------------")
    println("forEach")
    // цикл forEach
    possitive_number.forEachIndexed { i, selected ->
        if (i > 0 && i < possitive_number.size - 1) {
            val previous = possitive_number[i - 1]
            val next = possitive_number[i + 1]

            if (selected > previous && selected > next)
                println(selected)
        }
    }
}