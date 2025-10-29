package kotlin_book.c4_classes_objects_interfaces.c4_3_data_classes_and_class_delegation

class Client(val name: String, val postalCode: Int) {
    // Sobrescreve toString() para fornecer uma representação legível
    override fun toString(): String {
        return "Client(name='$name', postalCode=$postalCode)"
    }

    // Sobrescreve equals() para comparar objetos com base em suas propriedades
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Client) return false

        if (name != other.name) return false
        if (postalCode != other.postalCode) return false

        return true
    }

    // Sobrescreve hashCode() para gerar um código hash baseado nas propriedades
    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + postalCode
        return result
    }

    // Métdo copy() para criar uma cópia do objeto com a opção de modificar algumas propriedades
    fun copy(name: String = this.name, postalCode: Int = this.postalCode): Client {
        return Client(name, postalCode)
    }
}

// A classe data sobrescreve automaticamente toString(), equals() e hashCode()
data class ClientData(val name: String, val postalCode: Int)

fun testUniversalObjectMethods() {
    println("===Universal Object Methods===")

    val client1 = Client("Alice", 12345)
    println(client1)

    val client2 = Client("Alice", 12345)
    println("client1 == client2: ${client1 == client2}")

    val processed = hashSetOf(Client("Bob", 54321))
    println("processed.contains(Client(\"Bob\", 54321)): ${processed.contains(Client("Bob", 54321))}")

    println("===Classe Data===")

    val clientData1 = ClientData("Alice", 12345)
    println(client1)

    val clientData2 = ClientData("Alice", 12345)
    println("clientData1 == clientData2: ${clientData1 == clientData2}")

    val processedData = hashSetOf(Client("Bob", 54321))
    println("processed.contains(Client(\"Bob\", 54321)): ${processedData.contains(Client("Bob", 54321))}")

    println("===Método COPY===")
    val bob = Client("Bob", 54321)
    println(bob.copy(postalCode = 382555))
}