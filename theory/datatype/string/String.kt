
import java.util.*

fun main() {

    //String with quotation mark
    var firstName: String = "Gabriela"
    var lastName: String = "Santos"
    var fullName: String = "Gabriela Santos"

    //For quotation mark
    println(firstName)
    println(lastName)
    println(fullName)

    //String with triple quotation mark for more than one line
    var address1: String = """
        Rua das azaleias,
        São Carlos,
        Brazil
    """

    //For triple quotation mark
    print("Your address: $address1")

    /**
     * String with triple quotation mark using trim margin
     * "|" this called is pipe mark (READ: pipe mark)
    */
    var address2: String = """
        |Rua das azaleias,
        |Rua das azaleias,
        |Brazil
    """.trimMargin()

    //Print using pipe mark
    println(address2)

    /**
     * String with triple quotation mark using trim margin
     * ">" this called is more than mark
     */
    var address3: String = """
        >Rua das azaleias,
        >Rua das azaleias,
        >Brazil
    """.trimMargin(">")

    //Print using more than mark
    println(address3)

    //String with triple quotation mark using trim indent
    var address4: String = """
        Rua das azaleias,
        Rua das azaleias,
        Brazil
    """.trimIndent()

    //Print using more than mark
    println("address4: $address4")

    //Merge strings
    var fullNames:String = "fullName: $firstName $lastName"
    println(fullNames)

    //Strings with complex String Template
    var charOfFullName = "My name is $fullName and has ${fullName.length} char"
    println(charOfFullName)

    //In Java for Strings Template
    var myName = firstName
    println(String.format(Locale.getDefault(), "%s", myName.length))

    var firstName1 = "Gabriela"
    var lastName1 = "Santos"
    var fullName1 = "$firstName1 $lastName1"

    println("name: $firstName1 $lastName1")
    println("Total caracteres ${fullName1.length}")
}