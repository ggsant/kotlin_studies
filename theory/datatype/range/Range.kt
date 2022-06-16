
fun main() {

    //Range
    val range = 1..1000

    //For range
    println(range)

    //Print kinds of range method
    println(range.count()) //Getting total data in range
    println(range.contains(50)) //Checking any of the that value, eg: 50? answer is return true or false value
    println(range.first) //Getting first value
    println(range.last) //Getting last value
    println(range.step) //Getting value of each step

    //Range up using step
    val rangeUpToN = 1..100 step 3
    println(rangeUpToN)
    println("Total: ${rangeUpToN.count()}")
    println("first: ${rangeUpToN.first}")
    println("lst: ${rangeUpToN.last}")
    println("Contains: ${rangeUpToN.contains(7)}")

    //Range down
    val rangeDownToN = 100 downTo -100 step 4

    //Print range down to N
    println("total: ${rangeDownToN.count()}") //Getting total data in range
    println(rangeDownToN.contains(50)) //Checking any of the that value, eg: 50? answer is return true or false value
    println(rangeDownToN.first) //Getting first value
    println(rangeDownToN.last) //Getting last value
    println(rangeDownToN.step) //Getting value of each step
}