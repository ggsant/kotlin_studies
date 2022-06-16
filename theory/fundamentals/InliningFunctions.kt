package io.kotlin.fundamentals

import java.lang.Exception

fun main() {
    val listOfIntegers = listOf(1,2,3,4,5)
    val integers = foo(listOfIntegers, {i -> i == 3})
    print(integers)
}

inline fun <T> foo(items: List<T>,predicate: (T)-> Boolean) : T {
    for(item in items){
        if(predicate(item)) return item;
    }
    throw Exception()
}