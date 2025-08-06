package kotlin_book.c3_defining_calling_functions.creating_collections

fun testCreatingCollections() {
    println("===Creating Collections===")

    // Creating a set
    val set = hashSetOf(1, 7, 53)
    println("Set: $set")

    // Creating a list
    val list = arrayListOf(1, 7, 53)
    println("List: $list")

    // Creating a map
    val map = mapOf("1" to "one", "7" to "seven", "53" to "fifty-three")
    println("Map: $map")

    printCollectionTypes(set, list, map)

    testListAndSetOperations()
}

fun printCollectionTypes(set: Set<*>, list: List<*>, map: Map<*, *>) {
    println("===Printing collection types===")
    println(set.javaClass) //javaClass é o equivalente de Kotlin para getClass() de Java.
    println(list.javaClass)
    println(map.javaClass)
}

fun testListAndSetOperations() {
    println("===Operações com List e Set===")
    val strings = listOf("first", "second", "fourteenth")
    println("Last value: ${strings.last()}") //função de extensão
    val numbers = setOf(1, 14, 2)
    println("Max value: ${numbers.max()}") //função de extensão
}

fun infixFunction() {
    println("===Chamadas infixas===")
    val map = mapOf("1" to ("one"), "7" to "seven", "53" to "fifty-three")
    println("Map: $map")
}

//Versão simplificada da declaração da função de extensão to()
infix fun Any.to(other: Any) = Pair(this, other)