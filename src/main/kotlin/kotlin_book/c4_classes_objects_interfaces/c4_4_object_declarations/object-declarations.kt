package kotlin_book.c4_classes_objects_interfaces.c4_4_object_declarations

import java.io.File

object CaseInsensitiveFileComparator : Comparator<File> {
    override fun compare(file1: File, file2: File): Int {
        return file1.path.compareTo(file2.path, ignoreCase = true)

        //0 - os caminhos são considerados iguais (a comparação ignora maiúsculas/minúsculas).
        //< 0 - file1 é menor que file2 (vem antes lexicograficamente).
        //> 0 - file1 é maior que file2 (vem depois lexicograficamente).
    }
}

data class Person(val name: String) {
    object NameComparator : Comparator<Person> {
        override fun compare(p1: Person, p2: Person): Int =
            p1.name.compareTo(p2.name)
    }
}

fun testObjectDeclarations() {
    println("===Object Declarations===")

    println(CaseInsensitiveFileComparator.compare(File("/User/Example"), File("/user/example")))

    val files = listOf(File("/Z"), File("/a"))
    //Função sortedWith usa o comparador para ordenar a lista de arquivos.
    println(files.sortedWith(CaseInsensitiveFileComparator))

    val persons = listOf(Person("Bob"), Person("Alice"))
    //Usa o comparador NameComparator para ordenar a lista de pessoas pelo nome.
    println(persons.sortedWith(Person.NameComparator))
}