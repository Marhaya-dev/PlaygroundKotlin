package kotlin_book.c3_defining_calling_functions.calling_functions

import kotlin_book.c3_defining_calling_functions.calling_functions.strings.joinToString
import kotlin_book.c3_defining_calling_functions.calling_functions.strings.lastChar
import kotlin_book.c3_defining_calling_functions.calling_functions.strings.lastChar as last //Podemos mudar o nome da função importada


fun testCallingFunctions() {
    println("===Calling Functions===")

    val list = listOf(1, 2, 3) //função declarada com vararg qee aceita qualquer número de argumentos, incluindo nenhum
    println(list) //Chama toString() implicitamente

    //Chama função com todos os argumentos nomeados
    println(joinToString(collection = list, separator = "; ", prefix = "(", postfix = ")"))

    //Chama função sem necessidade de passar todos os argumentos
    println(joinToStringWithDefaultValues(list))

    //Chama função de extensão
    println("Kotlin".last())
    println(list.joinToString(" "))

    //Chama propriedade de extensão
    println(StringBuilder("Kotlin").lastChar)

    val listStrings = listOf("Kotlin", "Java", "Python")
    main(listStrings.toTypedArray())
}

fun <T> joinToString(
    collection: Collection<T>,
    separator: String,
    prefix: String,
    postfix: String
): String {
    println("===joinToString===")
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator) //Não concatena o separador antes do primeiro elemento
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun <T> joinToStringWithDefaultValues(
    collection: Collection<T>,
    separator: String = ", ", //valores padrão para os parâmetros, evitando a necessidade de passar todos os argumentos
    prefix: String = "",
    postfix: String = ""
): String {
    println("===joinToString() with default values===")
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator) //Não concatena o separador antes do primeiro elemento
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun main(args: Array<String>) {
    println("===Operador de espalhamento===")
    //com o *args cada elemento do array args é passado como um argumento separado.
    val list = listOf("args: ", *args) //O operador de espalhamento desempacota o conteúdo do array.
    println(list)
}