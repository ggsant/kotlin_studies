/*:
### Challenge 1: It’s prime time
When I’m acquainting myself with a programming language, one of the first things I do is write a function to determine
whether or not a number is prime. That’s your first challenge.
First, write the following function:
```kotlin
fun isNumberDivisible(number: Int, divisor: Int): Boolean
```
You’ll use this to determine if one number is divisible by another. It should return `true` when `number` is divisible
by `divisor`.
**Hint**: You can use the modulo (`%`) operator to help you out here.
Next, write the main function:
```kotlin
fun isPrime(number: Int): Boolean
```
This should return `true` if `number` is prime, and `false` otherwise. A number is prime if it’s only divisible by 1
and itself. You should loop through the numbers from 1 to the number and find the number’s divisors. If it has any
divisors other than 1 and itself, then the number isn’t prime. You’ll need to use the `isNumberDivisible(_:by:)`
function you wrote earlier.
Use this function to check the following cases:
```kotlin
isPrime(6) // false
isPrime(13) // true
isPrime(8893) // true
```
**Hint 1**: Numbers less than 0 should not be considered prime. Check for this case at the start of the function and
* return early if the number is less than 0.
**Hint 2**: Use a `for` loop to find divisors. If you start at 2 and end before the number itself, then as soon as you
* find a divisor, you can return `false`.
**Hint 3**: If you want to get *really* clever, you can simply loop from 2 until you reach the square root of `number`
* rather than going all the way up to `number` itself. I’ll leave it as an exercise for you to figure out why. It may
* help to think of the number 16, whose square root is 4. The divisors of 16 are 1, 2, 4, 8 and 16.
*/

fun main() {
    fun isNumberDivisible(number: Int, divisor: Int): Boolean {
        return number % divisor == 0
    }

    fun isPrime(number: Int): Boolean {
        var divisibleCount = 0
        if (number < 0) return false

        for (i in 1..number) {
            var isDivisible = isNumberDivisible(number, i)
            if (isDivisible) divisibleCount++
        }
        return if (divisibleCount > 2) false else true
    }

    println("The number 6 ${isPrime(6)}")
    println("The number 13 ${isPrime(13)}")
    println("The number 8893 ${isPrime(8893)}")
}
