
fun main() {
    sayHello("Gabriela", null)
    sayHello("Gabriela", "Santos")
    sayHello("Rafaela", null)
    sayHello("Rafaela", "Santos")
    helloName("Gabriela Santos", 17)
}

//Function with parameter
fun sayHello(firstName: String, lastName: String?) {
    if (lastName == null) {
        println("Hello $firstName")
    } else {
        println("Hello $firstName $lastName")
    }
}

fun helloName(name: String, age: Int) {
    println("Hello $name, my age is $age")
}