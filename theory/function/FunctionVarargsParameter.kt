
fun main() {

    //Data for Total function
    val values = arrayOf(10, 10, 10, 10)
    val result = total(values)
    println("result $result")

    //Data for TotalVarargs function
    val name = "Gabriela"
    val resultVarArgs = totalVarargs(name, 10, 10, 10, 10, 10, 10)
    println("resultVarArgs $name $resultVarArgs")

    //Data for TotalVarargs function with empty input for varargs
    val resultEmptyVarArgs = totalVarargs("Taufik")
    println("resultEmptyVarArgs $resultEmptyVarArgs")
}

//Common function with array as parameter and Int as return type
fun total(values: Array<Int>): Int {

    var total = 0

    for (value in values) {
        total += value
    }

    return total
}

/**
 * Function with vararg as parameter
 * Vararg must be placed in last parameter, neither in first parameter nor in middle parameter
 * If using vararg, it would be converted to array automatically
 * We can also use an empty input for vararg parameter
*/
fun totalVarargs(name: String, vararg values: Int): Int {

    var total = 0

    for (value in values) {
        total += value
    }
    print(name)

    return total
}