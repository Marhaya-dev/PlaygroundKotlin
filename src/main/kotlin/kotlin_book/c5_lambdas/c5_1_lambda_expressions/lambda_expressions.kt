package kotlin_book.c5_lambdas.c5_1_lambda_expressions

data class Person(val name: String, val age: Int)

// Fazendo uma busca em uma coleção manualmente
fun findTheOldest(people: List<Person>) {
    var maxAge = 0 //Armazena a idade máxima
    var theOldest: Person? = null //Armazena a pessoa com idade máxima
    for (person in people) {
        if (person.age > maxAge) { //Compara a idade da pessoa atual com a idade máxima
            maxAge = person.age
            theOldest = person }
    }
    println(theOldest)
}

fun printMessagesWithPrefix(messages: Collection<String>, prefix: String) {
    messages.forEach {
        println("$prefix $it")
    }
}

fun printProblemCounts(responses: Collection<String>) {
    var clientErrors = 0
    var serverErrors = 0
    responses.forEach {
        if (it.startsWith("4")) {
            clientErrors++
        } else if (it.startsWith("5")) {
            serverErrors++
        }
    }
    println("$clientErrors client errors, $serverErrors server errors")
}

fun testLambdaExpressions() {
    println("===Lambda Expressions===")

    val people = listOf(Person("Alice", 29), Person("Bob", 31))

    // Buscando a pessoa mais velha sem usar lambda
    findTheOldest(people)

    // Usando uma expressão lambda para encontrar a pessoa mais velha
    val theOldestClean = people.maxByOrNull { p: Person -> p.age }
    println(theOldestClean)

    // Sintaxe de it implícito
    val theOldestImplicit = people.maxBy { it.age }
    println(theOldestImplicit)

    // Lambda armazenada em uma variável
    val sum = { x: Int, y: Int -> x + y }
    println(sum(1, 2)) //trata variável como função

    // Usando lambda como um argumento nomeado
    val names = people.joinToString(separator = " ", transform = { p: Person -> p.name })
    println(names)

    // Usando lambda fora dos parênteses
    val namesClean = people.joinToString(" ") { p: Person -> p.name }
    println(namesClean)

    // Usando parâmetro de função em uma lambda
    val errors = listOf("403 Forbidden", "404 Not Found")
    printMessagesWithPrefix(errors, "Error:")

    //Alterando variáveis locais em uma lambda
    val responses = listOf("200 OK", "418 I'm a teapot", "500 Internal Server Error")
    printProblemCounts(responses)
}