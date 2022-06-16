package io.kotlin.fundamentals

fun main(args: Array<String>) {
    for(i in args.indices){
        print("$i ${args[i]}")
    }
    // Initializes an array of size 2.
    val items = IntArray(2)
    items[0] = 1
    items[1] = 2

    val numbers = intArrayOf(1,2,3,4,5)

    numbers.forEachIndexed{index,element ->
        print("$index is $element")
    }
}