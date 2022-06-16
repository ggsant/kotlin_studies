fun main() {
    val name = "Gabriela"
    println(name.hello())

    name.printHello()

    "Gabriela".printHello()

    println(2.number())
}

//$this means to access data of function. This method returns String type
fun String.hello():String = "Hello, $this"

//$this means to access data of function. This method doesn't returns any return type
fun String.printHello(): Unit = println("Hello, $this")

fun Int.number(): Int = 4