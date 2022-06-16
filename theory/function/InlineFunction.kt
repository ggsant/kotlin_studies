
fun main() {

    for (i in 1..100) {
        println(hello({ "Gabriela" }, { "Santos" }))
    }

    for (j in 1..100) {
        println(helloNoInline({"Rafaela"}, {"Santos"}))
    }
}

//Inline function is one of ability of Kotlin to change higher order function into common function
inline fun hello(
    firstName: () -> String,
    lastName: () -> String
): String {
    return "Hello, ${firstName()} ${lastName()}"
}

/**
 * If we want to make some parameters not as inline,
 * We can add 'noinline' at the first before parameter name
 * Ex: We will change lastName parameter as noinline,
 * Kotlin bytecode will change it into common function
 * And no inline parameter will be called repeatedly
 * Consequently, the app perform will be slow
*/
inline fun helloNoInline(
    firstName: () -> String,
    noinline lastName: () -> String
): String {
    return "Hello, ${firstName()} ${lastName()}"
}