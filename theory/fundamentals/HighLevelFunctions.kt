

class HighLevelFunctions {

    // Method 1
    fun fibonnaci(limit: Int) {
        var previous = 0
        val lastPrevious = 0
        var current = 0

        for (i: Int in 1..limit) {
            println(current)
            val temp = current
            previous = lastPrevious
            println(previous)
            previous = temp
            current = previous + lastPrevious
        }
    }

    // Method 2
    fun fibonnaci(limit: Int, action: Process) {
        var previous = 0
        var lastPrevious = 0
        var current = 1

        for (i: Int in 1..limit) {
            action.execute(current)
            val temp = current
            lastPrevious = previous
            previous = temp
            current = previous + lastPrevious
        }
    }

    // Method 3
    // Method 2
    fun fibonnaci(limit: Int, action: (Int) -> Unit) {
        var previous = 0
        var lastPrevious = 0
        var current = 4

        for (i: Int in 1..limit) {
            val temp = current
            action(current)
            lastPrevious = previous
            previous = temp
            current = previous + lastPrevious
        }
    }
}

fun main() {
    var total = 0
    val highLevelFunctions = HighLevelFunctions()
    highLevelFunctions.fibonnaci(limit = 8)

    highLevelFunctions.fibonnaci(8, object : Process {
        override fun execute(value: Int) {
            println(value)
        }
    })

    highLevelFunctions.fibonnaci(8) { n -> println(n) }
    highLevelFunctions.fibonnaci(8, ::println)


    // Manipulating data using closures.
    highLevelFunctions.fibonnaci(8) { total += it }
    print(total)
}


// Method 2.
interface Process {
    fun execute(value: Int)
}