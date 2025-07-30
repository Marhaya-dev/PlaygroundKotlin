package kotlin_book.c3_defining_calling_functions.calling_functions;

import kotlin_book.c3_defining_calling_functions.calling_functions.strings.JoinKt;
import kotlin_book.c3_defining_calling_functions.calling_functions.strings.StringFunctions;

public class TopLevelFunctions {
    public static void main(String[] args) {
        //Chamada de uma função de nível superior em java, com classe fixa igual o nome do arquivo
        JoinKt.joinToString(
                java.util.Arrays.asList("apple", "banana", "cherry"),
                ", ",
                "[",
                "]"
        );

        //Chamada de uma função de nível superior em kotlin com classe renomeada
        StringFunctions.joinToString(
                java.util.Arrays.asList("apple", "banana", "cherry"),
                ", ",
                "[",
                "]"
        );
    }
}
