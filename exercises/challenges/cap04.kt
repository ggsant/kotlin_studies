fun main() {
    // 1. In the following for loop, what will be the value of sum, and how many iterations
    // will happen? 5 iterations and the sum is equal 15
    var sum = 0
    for (i in 0..5) {
        sum += i
    }
    print(sum)

    //  2. In the while loop below, how many instances of “a” will there be in aLotOfAs? Hint:
    // aLotOfAs.count tells you how many characters are in the string aLotOfAs.
    // 10 instances

    var aLotOfAs = ""
    while (aLotOfAs.length < 10) {
        aLotOfAs += "a"
    }

    print(aLotOfAs.count())

    // 3. Consider the following when expression:
    // What will this code print when coordinates is each of the following?

    val (a1, b1, c1) = Triple(1, 5, 0) // On the a1/b1 plane
    // val (a1, b1, c1) = Triple(2, 2, 2)  // a1 = b1 = c1
    // val (a1, b1, c1) = Triple(3, 0, 1)  // On the a1/c1 plane
    // val (a1, b1, c1) = Triple(3, 2, 5)  // Nothing special
    // val (a1, b1, c1) = Triple(0, 2, 4)  // On the b1/c1 plane
    when {
        a1 == b1 && b1 == c1 -> println("a1 = b1 = c1")
        c1 == 0 -> println("On the a1/b1 plane")
        b1 == 0 -> println("On the a1/c1 plane")
        a1 == 0 -> println("On the b1/c1 plane")
        else -> println("Nothing special")
    }

    // 4. A closed range can never be empty. Why?
    // Ranges must always be increasing.  With a closed range the second number is always included
    // in the range.

    val halfOpenRange = 100 until 100 // empty
    val closedRange = 100..100 // contains the number 100

    println(halfOpenRange.isEmpty())
    println(closedRange.isEmpty())

    /*:
    ### Challenge 5
    Print a countdown from 10 to 0.  (Note: do not use the downTo method)
    */
    for (i in 0..10) {
        println(10 - i)
    }

    /*:
    ### Challenge 6
    Print 0.0, 0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 1.0.
    */
    var value = 0.0

    repeat(10) {
        println(value)
        value += 0.1
    }

    // Alternate solution
    for (counter in 0..10) {
        println(counter.toDouble() * 0.1)
    }
}
