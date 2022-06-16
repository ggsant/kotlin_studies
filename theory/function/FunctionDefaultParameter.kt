
fun main() {
    hello("Gabriela")
    hello("Gabriela", "Santos")
    hello("Gabriela", null)
}

//Function with nullable variable and default parameter
fun hello(firstName: String, lastName: String? = null) {
    if (lastName == null) {
        println("Hello, $firstName")
    } else {
        println("Hello, $firstName $lastName")
    }
}