package io.kotlin.fundamentals

fun main() {

    val integers = listOf(1, 2, 3, 4, 5, 6, 7, 8)

    // This will return a true or false, if all the numbers in that list are greater than 3
    val largerIntergers = integers.all { it > 3 }

    println(largerIntergers)

    // any of them greater than 3 ?
    val someOfThemGreaterThanThree = integers.any { it > 3 }

    println(someOfThemGreaterThanThree)

    // count the numbers that are greater than three

    val countNumberGreaterThanThree = integers.count { it > 3 }
    println(countNumberGreaterThanThree)
}