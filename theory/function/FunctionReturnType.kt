
fun main() {
    add(2,4)
    divided(5.0, 0.0)
    divided(4.0, 7.0)
}

fun add(firstNumb: Int, secondNumb: Int): Int {

    val sumResult = firstNumb + secondNumb
    println("sumResult: $sumResult")
    return sumResult
}

fun divided(firstNumb: Double, secondNumb: Double): Double {

    return if (secondNumb == 0.0) {
        0.0
    } else {
        val dividedResult = firstNumb / secondNumb
        println("dividedResult: $dividedResult")
        dividedResult
    }
}