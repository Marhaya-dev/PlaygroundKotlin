package kotlin_book.c4_classes_objects_interfaces.c4_2_class_builders_properties

import javax.naming.Context
import javax.print.attribute.AttributeSet

//Construtores secundários
open class View {
    constructor(ctx: Context) {
        // Inicialização com Context
    }

    constructor(ctx: Context, attr: AttributeSet) {
        // Inicialização com Context e AttributeSet
    }
}

//Chama os construtores da superclasse
class MyButton : View {
    constructor(ctx: Context) : super(ctx) {
        // Inicialização com Context
    }

    constructor(ctx: Context, attr: AttributeSet) : super(ctx, attr) {
        // Inicialização com Context e AttributeSet
    }
}