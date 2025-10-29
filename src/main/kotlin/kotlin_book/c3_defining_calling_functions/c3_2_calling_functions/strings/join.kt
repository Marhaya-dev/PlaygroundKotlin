@file:JvmName("StringFunctions") // Anotação para especificar o nome da classe (que é gerada implicitamente na compilação), não precisa ter o mesmo nome do arquivo
package kotlin_book.c3_defining_calling_functions.c3_2_calling_functions.strings

//Declara uma função de extensão em Collection<T>
fun <T> Collection<T>.joinToString( //Não precisa criar classe, apenas uma função top-level, isso reduz aninhamento desnecessário
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) { //this refere-se à coleção que chama a função de extensão
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

// Função de extensão
fun String.lastChar(): Char = get(length - 1) //Membros de objetos receptores podem ser acessados sem this.

//Propriedade de extensão
var StringBuilder.lastChar: Char //Propriedades de extensão não podem ter estado, então não podem ter campos de apoio
    get() = get(length - 1) //Mas podem ter getters personalizados
    set(value: Char) {
        this.setCharAt(length - 1, value) //E setters personalizados
    }
