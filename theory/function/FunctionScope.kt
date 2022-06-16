
fun main() {

    fun HelloWorld() {
        println("Hello World")
    }

    //The HelloWorld function can accessed from inner main function
    HelloWorld()
}

fun foo() {

    /**
     * It will gives an error because HelloWorld function is private function
     * It can be accessed only by main function
     */
//    HelloWorld()
}

