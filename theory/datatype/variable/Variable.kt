/**
 * Constant Variable
 * Global: can be accessed in any places
 * Only used for immutable variable
 * Keyword: const val
*/
const val app_name = "variableApp"
const val app_version = "1.0"

fun main() {

    /**
     * Mutable
     * Value can be changed with same data type
     */
    var firstName: String
    var lastName: String 

    firstName = "Gabriela"
    lastName = "Santos"

    //It will print latest value
    print("My name is $firstName $lastName")

    /**
     * Immutable
     * Value can't be changed either with same data type or different data type
    */
    val firstAlias = "T"
    // firstAlias = "Gabriela" //Program will error because cannot be reassigned
    println(firstAlias)

    //Nullable
    var firstNames: String?
    firstNames = null

    //For nullable
    println("nullable string ${firstNames?.length}")

    //Get access of constant variable
    println("name: $app_name version $app_version")
}