package kotlin_book.c3_defining_calling_functions.calling_functions.strings;

import java.util.Collection;

public class JoinKt { //nome da classe deve ser o mesmo do arquivo .java
    public static <T> String joinToString(
            Collection<T> collection,
            String separator,
            String prefix,
            String postfix
    ) {
        StringBuilder result = new StringBuilder(prefix);
        int index = 0;
        for (T element : collection) {
            if (index > 0) result.append(separator);
            result.append(element);
            index++;
        }
        result.append(postfix);
        return result.toString();
    }
}
