package org.example.basicKotlin.whileAndFor

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz "
    i % 3 == 0 -> "Fizz "
    i % 5 == 0 -> "Buzz "
    else -> "$i "
}

fun testsWhileAndFor(){
    println("===While And For===")
    for (i in 1..100){
        println(fizzBuzz(i))
    }

    //Itera de 2 em 2  em ordem descendente
    /*for (i in 100 downTo 1 step 2){
        println(fizzBuzz(i))
    }

    for (i in 0 until 50){
        println(fizzBuzz(i))
    }*/
}