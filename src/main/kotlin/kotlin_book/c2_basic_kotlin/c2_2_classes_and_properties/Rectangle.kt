//Declaração de classe e de uma função em um pacote
package kotlin_book.c2_basic_kotlin.c2_2_classes_and_properties //Declaração do pacote

import java.util.Random //Importa a classe da biblioteca-padrão de Java

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width //getter personalizado - o valor é calculado sempre que a prop é acessada
}

fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}

fun testsClassesAndProperties() {
    println("===Classes and Properties===")
    println(createRandomRectangle().isSquare) //Exibe "true" de modo extremamente raro
}