
fun main() {

    //Integer
    var age: Int = 30
    var height: Int = 20

    //For int type
    println("Age: $age")
    println("Height: $height")

    //Floating point
    var sample: Float = 10.2F
    var simple: Float = 10.1F

    //For floating point type
    println("Sample: $sample")
    println("Simple: $simple")

    //Literals
    var decimalLiteral: Int = 100
    var hexadecimalLiteral: Int = 0xFF
    var binaryLiteral: Int = 0b00100111100

    //For literals type
    println("decimalLiteral: $decimalLiteral")
    println("hexadecimalLiteral: $hexadecimalLiteral")
    println("binaryLiteral: $binaryLiteral")

    /**Underscore
     * It's used to easy to read number in thousand, million, billion, trillion, and etc
    */
    var ages = 3_0
    var heights = 1_8_0
    var balance = 1_2_3L
    var priceInMillion = 1_000_999_000L

    //For underscore
    println("ages: $ages")
    println("heights: $heights")
    println("balance: $balance")
    println("priceInMillion: $priceInMillion")

    //Conversion
    var priceInMillionToInt = priceInMillion.toInt()
    var priceInMillionToDouble = priceInMillion.toDouble()

    //For conversion
    println("priceInMillionToInt: $priceInMillionToInt")
    println("priceInMillionToDouble: $priceInMillionToDouble")

}