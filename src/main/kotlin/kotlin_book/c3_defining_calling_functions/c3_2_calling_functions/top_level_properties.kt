package kotlin_book.c3_defining_calling_functions.c3_2_calling_functions

var opCount = 0 // Propiedade top-level para contar operações, acessível em todo o arquivo

fun performOperation() {
    opCount++ // Altera o valor da propriedade
    // ... outras operações
}

fun reportOperationCount() {
    println("Operation performed $opCount times") // Lê o valor da propriedade
}