package org.example.kotlinBook.basicKotlin.exceptions

import java.io.BufferedReader
import java.io.StringReader

fun testExceptions() {
    println(validatePercentage(4))
    val readerNumber = BufferedReader(StringReader("42"))
    val readerNotNumber = BufferedReader(StringReader("Not a number"))
    println(readNumberAndClose(BufferedReader(readerNumber)))
    printNumberOrReturn(readerNotNumber)
    readNumber(readerNotNumber)
}

fun validatePercentage(number: Int) =
    if (number in 0..100)
        number
    else
        throw IllegalArgumentException( //throw é uma expressão, então não precisa de new
            "A percentage value must be between 0 and 100: $number")

//try, catch e finally
fun readNumberAndClose(reader: BufferedReader): Int? {
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    } catch (e: NumberFormatException) {
        return null
    } finally {
        reader.close()
    }
}

//try como expressão, ou seja, você pode atribuir o resultado de um try a uma variável
fun printNumberOrReturn(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        return
    }

    println(number)
}

//Devolvendo um valor em catch
fun readNumber(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        null
    }

    println(number)
}