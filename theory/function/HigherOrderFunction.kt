
fun main() {

    /**
     * Make some variables and convert to lambda expression
     * The variable that converted as lambda expression will be using as parameter
    */
    val toUpperCase = {value: String -> value.uppercase()}
    val toLowerCase = {value: String -> value.lowercase()}

    println(hello("Gabriela", toUpperCase))
    println(hello("Gabriela", toLowerCase))

    /**
     * Trailing lambda
     * It makes easy to read
     * But it must be placed at the end where lambda expression placed
    */
    val result1 = hello("Gabriela") { value: String ->
        value.uppercase()
    }

    val result2 = hello("Rafaela") { value: String ->
        value.lowercase()
    }

    val result3 = hello("Gabriela Santos") {
        it.uppercase()
    }

    val result4 = hello("Gabriela") {
        it.lowercase()
    }

    val result5 = hello("Bruna", ({
        it.uppercase()
    }))

    val result6 = hello("Rafael", ({
        it.lowercase()
    }))

    println(result1)
    println(result2)
    println(result3)
    println(result4)
    println(result5)
    println(result6)
}

/**
 * This method will convert lambda expression as parameter
 * Lambda expression not only as function, but also as parameter
 */
fun hello(name: String, transformer: (String) -> String): String {
    return "Hello, ${transformer(name)}"
}