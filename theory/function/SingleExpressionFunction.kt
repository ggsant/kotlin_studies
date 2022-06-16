
fun main() {
    println("multipleByTwo: " + multipleByTwo(4))
    println("Hello, " + greetings("Gabriela"))
    hello("Gabriela")
}

fun multipleByTwo(firstNumb: Int): Int = firstNumb * 2

fun greetings(name: String): String = name

fun hello(name: String): Unit = println("Hello, $name")
