
fun main() {

    //Call function with random parameter
    fullName(
        lastName = "Gabriela",
        firstName = "Santos",
        middleName = null
    )
}

fun fullName(
    firstName: String,
    middleName: String?,
    lastName: String
) {
    when (middleName) {
        null -> {
            println("Hello, $firstName $lastName")
        }
        else -> {
            println("Hello, $firstName $middleName $lastName")
        }
    }
}