package kotlin_book.c4_classes_objects_interfaces.c4_2_class_builders_properties

interface UserX {
    val nickname: String
}

//Propriedade do construtor primário
class PrivateUser(override val nickname: String) : UserX

class SubscribingUser(val email: String) : UserX {
    override val nickname: String
        //getter personalizado
        get() = email.substringBefore('@')
}

class FacebookUser(val accountId: Int) : UserX {
    override val nickname: String
        //Inicializador da propriedade
        get() = "fb_$accountId"
}

interface UserY {
    val email: String
    val nickname: String
        //A Propriedade não tem um backing field; o valor resultante é gerado a cada acesso
        get() = email.substringBefore('@')
}

// Acessando o backing field em um setter
class UserZ(val name: String) {
    var address: String = "unspecified"
        set(value: String) {
            println(
                """ 
                Address was changed for $name:
                 "$field" -> "$value".""".trimIndent() //ler o valor do backing field
            )
            field = value // Atualiza o valor do backing field
        }
}

class LengthCounter {
    var counter: Int = 0
        private set // O setter é privado, impedindo modificações fora da classe

    fun addWord(word: String) {
        counter += word.length // Incrementa o contador com o tamanho da palavra
    }
}

fun testPropertiesDeclaredOnInterfaces() {
    println("===Properties Declared On Interfaces===")

    println(PrivateUser("test@kotlinlang.org").nickname)
    println(SubscribingUser("test@kotlinlang.org").nickname)

    println("===Acessando o backing field em um setter===")
    val user = UserZ("Alice")
    user.address = "123 Main St"

    println("===Declarando uma propriedade com um setter private===")
    val lengthCounter = LengthCounter()
    lengthCounter.addWord("Hello")
    println(lengthCounter.counter)
}