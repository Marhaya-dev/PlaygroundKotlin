package kotlin_book.c2_basic_kotlin.c2_3_enums_and_whens

//Usando when no lugar de ifs
fun eval(e: Expr): Int =
    when (e) {
        is Num -> //Ramos de when que verifica o tipo de argumento
            e.value //Cast inteligente
        is Sum ->
            eval(e.right) + eval(e.left)
        else ->
            throw IllegalArgumentException("Unknown expression")
    }

fun evalWithLogging(e: Expr): Int =
    when (e) {
        is Num -> {
            println("num: ${e.value}")
            e.value //última expressão do bloco, será devolvida se e for do tipo Num.
        }
        is Sum -> {
            val left = evalWithLogging(e.left)
            val right = evalWithLogging(e.right)
            println("sum: $left + $right")
            left + right //será devolvida se e for do tipo Sum.
        } else -> throw IllegalArgumentException("Unknown expression")
    }

fun testsEnumsAndWhen() {
    println("===Enums and When===")
    println(evalWithLogging(Sum(Sum(Num(1), Num(2)), Num(4))))
}