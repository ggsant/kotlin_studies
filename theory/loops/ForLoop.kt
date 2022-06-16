package com.yumtaufik.learnkotlinbasic.loops

fun main() {

    //For loop using Array
    val arrayOfName = arrayOf("gabriela", "rafaela", "bruna", "bruno", "victor", "leandro", "paulo")
    var totalLooping = 0

    for (nama in arrayOfName) {
        println(nama)
        totalLooping++
    }
    println("totalLooping: $totalLooping")

    //For loop using range incrementally
    //Basic
    for (value in 0..100) {
        println("value: $value")
    }

    //Using step
    for (value in 0..100 step 5) {
        println("ValueStep: $value")
    }

    //For loop using range decremental
    //Basic
    for (value in 1000 downTo 0) {
        println("ValueDownTo: $value")
    }

    //Using step
    for (value in 1000 downTo 0 step 5) {
        println("ValueDownToStep: $value")
    }

    //Get array size using for loop
    val arraySize = arrayOfName.size - 1

    for (i in 0..arraySize) {
        println("Index $i = ${arrayOfName[i]}")
    }
}