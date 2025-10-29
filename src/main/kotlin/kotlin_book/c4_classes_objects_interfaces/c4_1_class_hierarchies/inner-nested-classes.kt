package kotlin_book.c4_classes_objects_interfaces.c4_1_class_hierarchies

import java.io.Serializable

interface State: Serializable
interface View{
    fun getCurrentState(): State
    fun restoreState(state: State) {}
}

class ButtonView: View {
    override fun getCurrentState(): State = ButtonState()

    override fun restoreState(state: State) {}

    //Classe aninhada sem modificador explícito é igual uma classe aninhada static em Java
    class ButtonState : State {}
}

class Outer {
    //Classe aninhada interna (sintaxe inner) - pode acessar membros da classe externa
    inner class Inner {
        fun getOuterReference(): Outer = this@Outer
    }
}

// Classe sealed, restrita a um conjunto fixo de subclasses
sealed class Expr {
    class Num(val value: Int) : Expr()
    class Sum(val left: Expr, val right: Expr) : Expr() //Lista todas as subclasses possíveis
}

fun eval(e: Expr): Int =
    when (e) { // Inclui todas as subclasses possíveis, portanto não é necessário o else
        is Expr.Num -> e.value
        is Expr.Sum -> eval(e.left) + eval(e.right)
    }
