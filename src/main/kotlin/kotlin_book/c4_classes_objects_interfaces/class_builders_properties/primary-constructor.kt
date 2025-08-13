package kotlin_book.c4_classes_objects_interfaces.class_builders_properties

// Construtor primário com um parâmetro (sintaxe constructor)
class User3 constructor(_nickname: String) {
    val nickname: String
    init { // Bloco de inicialização (sintaxe init)
        nickname = _nickname
    }
}

// Podemos omitir a palavra-chave constructor se não houver nenhuma anotação nem modificadores de visibilidade
class User2(_nickname: String) {
    val nickname = _nickname // Propriedade inicializada diretamente
}

class User(val nickname: String,
           val isSubscribed: Boolean = true) { //variável de instância com valor default
    // Propriedade inicializada diretamente no construtor primário
    // Não é necessário o bloco init, pois a propriedade já é inicializada
}

// Construtor private para impedir a criação de instâncias fora da classe
class Secretive private constructor()

fun testPrimaryConstructor() {
    println("===Primary Constructor===")

    val alice = User("Alice") //instância da classe User, sem a palavra-chave new
    println(alice.isSubscribed)

    val bob = User("Bob", false)
    println(bob.isSubscribed)

    val carol = User("Carol", isSubscribed = false)
    println(carol.isSubscribed)
}