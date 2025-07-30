package kotlin_book.c3_defining_calling_functions.calling_functions

fun testCallingFunctions() {
    println("===Calling Functions===")

    val list = listOf(1, 2, 3)
    println(list) //Chama toString() implicitamente

    //Chama função com todos os argumentos nomeados
    println(joinToString(collection = list, separator = "; ", prefix = "(", postfix = ")"))

    //Chama função sem necessidade de passar todos os argumentos
    println(joinToStringWithDefaultValues(list))
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
