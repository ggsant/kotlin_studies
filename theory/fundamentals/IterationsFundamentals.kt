package io.kotlin.fundamentals

import java.util.*

fun main(){
    var condition = true

    // While loop.
    while(condition){
        //execute some statements.
        Thread.sleep(400)
        print("I slept because condition was ${condition} \n")
        condition = false
    }

    // Do while loop.
    do {
        print("I am in the while loop atleast once")
    }while (condition)


    // The for loop.{Inclusive For Loop}
    for(i in 1..10){
        print("${i} \n")
    }

    // The for loop step
    for(i in 1..100 step 5){
        print("${i} \n")
    }

    // Looping Backwards.
    for(i in 100 downTo 1 step 5){
        print("${i} \n")

    }

    // Half Closed Ranges.
    for (i in 1 until 100){
        print(i)
    }

    // Looping through an array/ list of numbers.

    // List of numbers from 1 to 1000
    val listOfNumbers = listOf(1,2,3,4,5,6,7,8,9,10)
    for(number in listOfNumbers){
        print("${number}")
    }

    // Create a tree map - Equivalent of a hash map.
    val ages = TreeMap<String,Int>()
    ages["Monica"] = 55
    ages["Bruna"] = 24
    ages["Rafaela"] = 24
    ages["Gabriela"] = 26

    for((name,age) in ages){
        print("\n ${name} - ${age}")
    }
}
