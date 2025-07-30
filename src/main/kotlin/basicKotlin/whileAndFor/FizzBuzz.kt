package org.example.basicKotlin.whileAndFor

import java.util.TreeMap

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz"
    i % 3 == 0 -> "Fizz "
    i % 5 == 0 -> "Buzz "
    else -> "$i "
}

fun testsWhileAndFor(){
    println("===While And For===")

    for (i in 1..100){ //sintaxe para criar um intervalo de 1 a 100
        println(fizzBuzz(i))
    }

    //Itera de 2 em 2  em ordem descendente
    /*for (i in 100 downTo 1 step 2){
        println(fizzBuzz(i))
    }

    for (i in 0 until 50){
        println(fizzBuzz(i))
    }*/

    //region Inicializando e iterando por um mapa
    println("\n===Binary Reps===")
    val binaryReps = TreeMap<Char, String>()

    for (c in 'A'..'F') { //sintaxe para criar um intervalo de caracteres
        val binary = Integer.toBinaryString(c.code)
        binaryReps[c] = binary
    }

    for ((letter, binary) in binaryReps) {
        println("$letter = $binary") }
    //endregion

    //region Itera por uma coleção usando índice
    println("\n===Index Reps ===")
    val list = arrayListOf("10", "11", "100", "101", "110", "111")

    for ((index, element) in list.withIndex()) {
        println("$index: $element")
    }
    //endregion

    //region Verificando a pertinência a um intervalo usando in
    println("\n===Verificação de Pertinência em Intervalos===")
    fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
    fun isNotDigit(c: Char) = c !in '0'..'9'
    println("Is letter? " + isLetter('q'))
    println("Is no digit? " + isNotDigit('x'))
    //endregion

    //region Usando verificação com in em ramos de when
    println("\n===Verificação de Pertinência em Ramos de when===")
    fun recognize(c: Char) = when (c) {
        in '0'..'9' -> "$c it's a digit!"
        in 'a'..'z', in 'A'..'Z' -> "$c it's a letter!"
        else -> "$c i don't know…" }

    println(recognize('4'))
    //endregion
}