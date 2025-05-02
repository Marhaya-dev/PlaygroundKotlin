package org.example

import org.example.basicKotlin.enumsAndWhens.Num
import org.example.basicKotlin.enumsAndWhens.Sum
import org.example.basicKotlin.enumsAndWhens.evalWithLogging

fun main() {
    println(evalWithLogging(Sum(Sum(Num(1), Num(2)), Num(4))))
}