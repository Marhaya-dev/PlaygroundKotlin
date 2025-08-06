package kotlin_book.c3_defining_calling_functions.local_functions_and_extensions

fun testLocalFunctionsAndExtensions() {
    println("===Local Functions And Extensions===")
    //saveUserWithRepetitiveCode(User(1,"",""))
    //saveUser(User(1,"",""))
    saveUserWithExtension(User(1,"",""))
}

class User(val id: Int, val name: String, val address: String)

// Função com código repetitivo
fun saveUserWithRepetitiveCode(user: User) {
    if (user.name.isEmpty()) {
        throw IllegalArgumentException(
            "Can't save user ${user.id}: empty Name")
    }
    if (user.address.isEmpty()) {
        throw IllegalArgumentException(
            "Can't save user ${user.id}: empty Address")
    }
    // Salva o usuário no banco de dados
}

//Extraindo função local para evitar repetição de código
fun saveUser(user: User) {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user ${user.id}: empty $fieldName")
        }
    }
    validate(user.name, "Name")
    validate(user.address, "Address")
    // Salva o usuário no banco de dados
}

//Extraindo a lógica para uma função de extensão
fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user $id: empty $fieldName")
        }
    }
    validate(name, "Name")
    validate(address, "Address")
}

fun saveUserWithExtension(user: User) {
    user.validateBeforeSave()
    // Salva o usuário no banco de dados
}