package kotlin_book.c4_classes_objects_interfaces.c4_4_object_declarations

class A {
    // O objeto companheiro tem acesso aos membros privados da classe A.
    companion object {
        fun bar() {
            println("Companion object called")
        }
    }
}

class User private constructor(val nickname: String) { //marca o construtor primário como private
    companion object { //Declara um objeto companheiro
        fun newSubscribingUser(email: String) = //Declara um objeto companheiro nomeado
            User(email.substringBefore('@'))
        fun newFacebookUser(accountId: Int) = //Função de fábrica que cria um User com base no ID da conta do Facebook
            User(getFacebookName(accountId))

        private fun getFacebookName(accountId: Int): String {
            return "fb_$accountId"
        }
    }
}

fun testCompanionObjects() {
    println("===Companion Objects===")

    // Chama a função bar() do objeto companheiro da classe A sem precisar instanciar A.
    A.bar()

    // Usa as funções de fábrica do objeto companheiro para criar instâncias de User.
    val subscribingUser = User.newSubscribingUser("bob@gmail.com")
    val facebookUser = User.newFacebookUser(12345)
    println(subscribingUser.nickname)
}