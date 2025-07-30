package kotlin_book.c2_basic_kotlin.enums_and_whens

interface Expr
class Num(val value: Int) : Expr //A classe implemnta a interface Expr
class Sum(val left: Expr, val right: Expr) : Expr //O argumento de uma operação Sum pode ser qualquer Expr: pode ser num ou outro sum