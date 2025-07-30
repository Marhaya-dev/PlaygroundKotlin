@file:JvmName("StringFunctions") // Anotação para especificar o nome da classe (que é gerada implicitamente na compilação), não precisa ter o mesmo nome do arquivo
package kotlin_book.c3_defining_calling_functions.calling_functions.strings

fun <T> joinToString( //Não precisa criar classe, apenas uma função top-level, isso reduz aninhamento desnecessário
    collection: Collection<T>,
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}