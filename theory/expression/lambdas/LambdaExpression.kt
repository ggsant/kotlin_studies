
/**
 * With lambda, we are not required to type return as return type The lambda's end body is
 * automatically convert as return
 */
fun main() {

    /**
     * Variable with lambda expression using two parameters (String, String) -> They are two as
     * input but also parameters with String data type. String -> It is return as String type
     */
    val lambda: (String, String) -> String = { firstName: String, lastName: String ->
        val result = "Hello $firstName $lastName" // This body is converted automatically as return
        result
    }

    println(lambda("Gabriela", "Santos"))

    val lambdaInt: (Int, Int) -> Int = { a: Int, b: Int ->
        val result = a + b
        result
    }

    println(lambdaInt(1, 2))

    // variable with lambda expression using it as single parameter
    val sayHelloIt: (String) -> String = { "Hello, $it" }

    println(sayHelloIt("Gabriela"))

    // Or we can use lambda expression without using it but using parameter name
    val sayHello: (String) -> String = { value: String -> "Hello, $value" }

    println(sayHello("Gabriela"))

    val helloName: (String) -> String = { "Halo, $it" }

    println(helloName("Gabriela"))

    // Making lambda expression from existing function was called as method reference
    val toUpperCase: (String) -> String = ::toUpper
    println(toUpperCase("Gabriela Santos"))
}

fun toUpper(value: String): String = value.uppercase()
