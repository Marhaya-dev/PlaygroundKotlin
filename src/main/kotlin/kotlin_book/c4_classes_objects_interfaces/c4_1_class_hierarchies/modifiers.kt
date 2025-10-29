package kotlin_book.c4_classes_objects_interfaces.c4_1_class_hierarchies

// Classe aberta (sintaxe open) - outras classes podem herdar dela
open class RichButton : Clickable{

    //Função final (sem modificador específico) - não pode ser sobrescrita
    fun disable() {}

    //Função aberta (sintaxe open) - pode ser sobrescrita
    open fun animate() {}

    //Sobrescreve uma função aberta e é fechada (sintaxe final). override sem final é aberta
    final override fun click() {}
}

// Classe abstrata (sintaxe abstract) - não pode ser instanciada
abstract class Animated {
    //Função abstrata (sem corpo) - deve ser implementada por subclasses
    abstract fun animate()

    //Função aberta (sintaxe open) - pode ser sobrescrita
    open fun stopAnimating() {}

    //Função final (sem modificador específico) - não pode ser sobrescrita
    fun animateTwice() {}
}

internal open class TalkativeButton : Focusable {
    private fun yell() = println("Hey!")
    protected fun whisper() = println("Let's talk")
}

//fun TalkativeButton.giveSpeech() {
//    yell()
//    whisper()
//}