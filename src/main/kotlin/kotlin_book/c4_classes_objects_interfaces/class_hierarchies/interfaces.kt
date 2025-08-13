package kotlin_book.c4_classes_objects_interfaces.class_hierarchies

//Declarando uma interface simples
interface Clickable {
    //membros de interface são implicitamente abertos (open)
    fun click() //Função abstrata (sem corpo). Declaração usual de uma função
    fun showOff() = println("I am clickable") //Função com implementação default
}

interface Focusable {
    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} focus")
    fun showOff() = println("I am focusable")
}

class Button : Clickable, Focusable {
    override fun click() {
        println("I was clicked")
    }

    // Implementando a função showOff da interface Clickable e Focusable para evitar conflito
    override fun showOff() {
        super<Clickable>.showOff() // sintaxe para especificar o pai de uma função
        super<Focusable>.showOff()
    }
}

fun testInterface(){
    println("===Interfaces===")
    val button = Button()
    button.showOff()
    button.click()
    button.setFocus(true)
}