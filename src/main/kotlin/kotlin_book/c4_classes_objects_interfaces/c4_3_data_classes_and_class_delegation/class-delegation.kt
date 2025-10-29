package kotlin_book.c4_classes_objects_interfaces.c4_3_data_classes_and_class_delegation

class DelegatingCollection<T>(
    private val innerList: Collection<T> = ArrayList()
) : Collection<T> by innerList {
    // Aqui você pode adicionar membros adicionais ou sobrescrever
    // os métodos da interface Collection, se necessário.
}

class CountingSet<T>(
    val innerSet: MutableCollection<T> = HashSet<T>()
) : MutableCollection<T> by innerSet { //Delega a implementação de MutableCollection para innerSet.
    var objectsAdded = 0
    override fun add(element: T): Boolean { //Não delega; provê uma implementação diferente.
        objectsAdded++
        return innerSet.add(element)
    }
    override fun addAll(c: Collection<T>): Boolean { //Não delega; provê uma implementação diferente.
        objectsAdded += c.size
        return innerSet.addAll(c)
    }
}

fun testClassDelegation() {
    println("===Class Delegation===")

    val cset = CountingSet<Int>()
    cset.addAll(listOf(1, 1, 2))
    println("${cset.objectsAdded} objects were added, ${cset.size} remain")
}
