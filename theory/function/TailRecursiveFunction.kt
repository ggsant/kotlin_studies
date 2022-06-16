
fun main() {

    tailrec fun display(value: Int) {
        println("Recursive: $value")
        if (value > 0) {
            display(value - 1)
        }
    }

    display(100_000)

    //Show factorial using tail recursive
    tailrec fun factorialTailRecursive(value: Int, total: Int = 1): Int {
        return when (value) {
            1 -> total
            else -> factorialTailRecursive(value - 1, total * value)
        }
    }

    println("factorialTailRecursive: " + factorialTailRecursive(10))
}