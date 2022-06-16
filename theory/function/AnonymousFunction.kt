
fun main() {

    fun hello(name: String, transformer: (String) -> String): String {
        return "Hello, ${transformer(name)}"
    }

    val upper = fun(value: String): String {
        return if (value == "") {
            "UPS!"
        } else {
            value.uppercase()
        }
    }

    println(hello("gabi", upper))
    println(hello("", upper))

    //We can input anonymous function as parameter
    println(hello("gabi", fun(value: String): String {
        return value.lowercase()
    }))

    val upperCase = hello("gabi", fun(name: String): String {
        return name.uppercase()
    })

    println(upperCase)
}