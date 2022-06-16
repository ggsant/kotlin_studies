

// Basic Functions.
fun display(){
    print("Hello world")
}

// Functions with parameters.
fun display(message: String) :Boolean {
    print("Functions with parameters ${message}")
    return true
}

// Function Expressions.
// This function expression gets the larger integer.
fun maximum(integerA: Int, integerB: Int) : Int = if(integerA > integerB) integerA else integerB


// Using default paremeters.
@JvmOverloads // This says, when you are calling the method from a java class, use the default parameter.
fun logMessages(message: String, logLevel: Int = 5){
    print("${message} logged at level ${logLevel}")
}


// Understanding Extension Functions.
// Approach A
fun replacesMultipleWhiteSpaces(stringValue: String) : String {
    val regex = Regex("\\s+")
    return regex.replace(stringValue, " ")
}

// Approach B - We extend the String class
fun String.replaceWhiteSpaces() : String{
    val regex = Regex("\\s+")
    return regex.replace(this," ")
}

fun main() {
    display()
    display("Hello world")
    print(maximum(5,6))
    logMessages("This is a new day")
    logMessages(message = "This is a new day for named parameters")

    val text = "\n With        multiple \t whitespace"
    print(text)
    print(replacesMultipleWhiteSpaces(text))
    print(text.replaceWhiteSpaces())
}