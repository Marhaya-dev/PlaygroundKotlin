package kotlin_book.c3_defining_calling_functions.c3_5_strings_and_regular_expressions

fun testSplitStrings() {
    println("===Split de String===")

    println("12.345-6.A".split("\\.|-".toRegex())) //Cria uma expressão regular explicitamente

    println("12.345-6.A".split(".", "-")) //Cria uma expressão regular implicitamente"

    parsePath("/Users/yole/kotlin-book/chapter.adoc")
    parsePathWithRegularExpression("/Users/yole/kotlin-book/chapter.adoc")

    multilineStringsWithTripleQuotes()
}

fun parsePath(path: String) {
    println("===Parse Path===")
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")
    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")
    println("Dir: $directory, name: $fileName, ext: $extension")
}

fun parsePathWithRegularExpression(path: String) {
    println("===Parse Path using regular expression===")
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)
    if (matchResult != null) {
        val (directory, filename, extension) = matchResult.destructured
        println("Dir: $directory, name: $filename, ext: $extension")
    }
}

fun multilineStringsWithTripleQuotes(){
    println("===Multiline Strings With Triple Quotes===")

    val kotlinLogo = """| // 
        .|// 
        .|/ \"""

    println(kotlinLogo.trimMargin("."))
}