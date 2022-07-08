![image](https://user-images.githubusercontent.com/61892998/174152153-21b130f8-6e78-42a7-9fad-ae9699b8617d.png)

# O que é Kotlin?

Kotlin é uma linguagem de programação moderna mantida como um projeto de código aberto pela JetBrains, líder mundial em IDEs. Em 2011, a JetBrains estava escrevendo principalmente código Java e procurando uma nova linguagem de programação para ajudar a torná-los programadores mais eficientes. Por fim, eles decidiram criar uma nova linguagem de programação chamada Kotlin.

Ao longo dos anos, o Kotlin cresceu e se tornou um substituto imediato para o Java, permitindo que os desenvolvedores Java atualizem facilmente para uma linguagem mais expressiva. Além disso, em maio de 2017, o Google anunciou que Kotlin seria uma linguagem oficialmente suportada na plataforma Android. Com a JetBrains e agora o Google apoiando o projeto, não é surpresa que Kotlin tenha visto um aumento tão grande na popularidade.

# Usando Kotlin
Para começar com Kotlin, a primeira coisa que você precisa é de um lugar para escrever código. O lugar mais fácil para tentar escrever código Kotlin é o site try.kotlinlang.org . Ele oferece muita prática Kotlin, e se você entrar (tem a maioria das principais redes sociais como opções de entrada), você pode até criar seus próprios programas que ele salvará para você na nuvem (uma vez conectado, clique no botão botão de pasta com um sinal de adição para criar um novo programa).

Você também pode praticar o uso do Kotlin em um IDE como o IntelliJ IDEA. 

# Overview
- [x] Introduction to Kotlin
- [x] Environment setup for Command Line
- [x] Environment setup with Intellij IDEA
# Basics
- [x] Data Types
- [x] Variables
- [x] Operators
- [ ] Standard Input/Output
- [x] Type Conversion
- [ ] Expression, Statement and Block

# Control Flow
- [x] if-else expression
- [x] while loop
- [x] do-while loop
- [x] for loop
- [x] when expression
- [ ] Unlabeled break
- [ ] labeled break
- [ ] unlabeled continue
- [ ] labeled continue
# Array & String
- [x] Array
- [x] String

# Functions
- [x] functions
- [x] Default and Named argument
- [x] Recursion
- [ ] Tail Recursion

# Lambdas Expressions and Anonymous Functions
- [ ] Inline functions
- [ ] infix function notation
- [ ] Higher-Order Functions
# Collections
- [ ] Collections
- [ ] list : Arraylist
- [ ] list : listOf()
- [ ] Set : setOf()
- [ ] mutableSetOf()
- [ ] hashSetOf()
- [ ] Map : mapOf()
- [ ] Hashmap
# OOPs Concept
- [ ] Class and Objects
- [ ] Nested class and Inner class
- [ ] Setters and Getters
- [ ] | Class Properties and Custom Accessors
- [ ] Constructor
- [ ] Visibility Modifiers
- [ ] Inheritance
- [ ] Interfaces
- [ ] Data Classes
- [ ] Sealed Classes
- [ ] Abstract class
- [ ] Enum classes in Kotlin
- [ ] extension function
- [ ] generics
# Exception Handling
- [ ] Exception Handling | try, catch, throw and finally
- [ ] Nested try block and multiple catch block
# Null Safety
- [ ] Null Safety
- [ ] Type Checking and Smart Casting
 ] Explicit type casting
# Regex & Ranges
- [ ] Regular Expression
- [ ] Ranges
- [ ] Java Interoperability
- [ ] Java Interoperability – Calling Kotlin from Java
- [ ] Java Interoperability – Calling Java from Kotlin
# Miscellaneous
- [ ] annotations
- [ ] Reflection
- [ ] Operator Overloading
- [ ] Destructuring Declarations in Kotlin
- [ ] Equality evaluation in Kotlin
- [ ] Comparator in Kotlin
- [ ] Triple in Kotlin
- [ ] Pair in Kotlin
- [ ] Kotlin | apply vs with

# Challenges

1. Declare a constant exercises with value 9 and a variable exercisesSolved with
value 0. Increment this variable every time you solve an exercise (including this
one).

2. Given the following code:

            age = 16
            print(age)
            age = 30
            print(age)

Declare age so that it compiles. Did you use var or val?

3. Consider the following code:

            val a: Int = 46
            val b: Int = 10

Work out what answer equals when you replace the final line of code above with each of
these options:

            // 1
            val answer1: Int = (a * 100) + b
            // 2
            val answer2: Int = (a * 100) + (b * 100)
            // 3
            val answer3: Int = (a * 100) + (b / 10)

4. Add parentheses to the following calculation. The parentheses should show the
order in which the operations are performed and should not alter the result of the
calculation.

            5 * 3 - 4 / 2 * 2

5. Declare two constants a and b of type Double and assign both a value. Calculate the
average of a and b and store the result in a constant named average.

6. A temperature expressed in °C can be converted to °F by multiplying by 1.8 then
incrementing by 32. In this challenge, do the reverse: convert a temperature from °F
to °C. Declare a constant named fahrenheit of type Double and assign it a value.
Calculate the corresponding temperature in °C and store the result in a constant
named celcius.

7. Suppose the squares on a chessboard are numbered left to right, top to bottom, with
0 being the top-left square and 63 being the bottom-right square. Rows are
numbered top to bottom, 0 to 7. Columns are numbered left to right, 0 to 7. Declare
a constant position and assign it a value between 0 and 63. Calculate the
corresponding row and column numbers and store the results in constants named
row and column.

8. A circle is made up of 2� radians, corresponding with 360 degrees. Declare a
constant degrees of type Double and assign it an initial value. Calculate the
corresponding angle in radians and store the result in a constant named radians.

9. Declare four constants named x1, y1, x2 and y2 of type Double. These constants
represent the two-dimensional coordinates of two points. Calculate the distance
between these two points and store the result in a constant named distance.

Challenges Types & Operations

1. Create a constant called coordinates and assign a pair containing two and three to
it.

2. Extract the values 2 and 3 from coordinates into two variables called row and
column.

3. Which of the following are valid statements?

            val character: Character = "Dog"
            val character: Char = 'd'
            val string: String = "Dog"
            val string: String = 'd'

4. Is this valid code?

            val date = Triple(15, 8, 2015)
            val day = date.First

5. What is wrong with the following code?

            val name = "Dick"
            name += " Lucas"

6. What is the type of the constant named value?

            val triple = Triple(100, 1.5, 10)
            val value = triple.second

Challenges Basic control flow

1. What’s wrong with the following code?

            val firstName = "Dick"
            if (firstName == "Dick") {
            val lastName = "Lucas"
            } else if (firstName == "Ray") {
            val lastName = "Wenderlich"
            }
            val fullName = firstName + " " + lastName

2. In each of the following statements, what is the value of the Boolean answer
constant?

            val answer1 = true && true
            val answer2 = false || false
            val answer3 = (true && 1 != 2) || (4 > 3 && 100 < 1)
            val answer4 = ((10 / 2) > 3) && ((10 % 2) == 0)

3. Suppose the squares on a chessboard are numbered left to right, top to bottom, with
0 being the top-left square and 63 being the bottom-right square. Rows are
numbered top to bottom, 0 to 7. Columns are numbered left to right, 0 to 7. Given a
current position on the chessboard, expressed as a row and column number,
calculate the next position on the chessboard, again expressed as a row and column
number. The ordering is determined by the numbering from 0 to 63. The position
after 63 is again 0.

4. Given the coefficients a, b and c, calculate the solutions to a quadratic equation
with these coefficients. Take into account the different number of solutions (0, 1 or
2). If you need a math refresher, this Wikipedia article on the quadratic equation
will help: https://en.wikipedia.org/wiki/Quadratic_formula.

5. Given a month (represented with a String in all lowercase) and the current year
(represented with an Int), calculate the number of days in the month. Remember
that because of leap years, "february" has 29 days when the year is a multiple of 4
but not a multiple of 100. February also has 29 days when the year is a multiple of
400.

6. Given a number as a Double value, determine if this number is a power of 2. (Hint:
you can use log2(number) to find the base 2 logarithm of number. log2(number) will
return a whole number if number is a power of two. You can also solve the problem
using a loop and no logarithm.)

7. Print a table of the first 10 powers of 2.

8. Given a number n, calculate the n-th Fibonacci number. (Recall Fibonacci is 1, 1, 2,
3, 5, 8, 13, ... Start with 1 and 1 and add these values together to get the next value.
The next value is the sum of the previous two. So the next value in this case is 8+13
= 21.)

9. Given a number n, calculate the factorial of n. (Example: 4 factorial is equal to 1 * 2
* 3 * 4.)

10. Given a number between 2 and 12, calculate the odds of rolling this number using
two six-sided dice. Compute it by exhaustively looping through all of the
combinations and counting the fraction of outcomes that give you that value. Don’t
use a formula.

Challenges Advanced control flow

1. In the following for loop, what will be the value of sum, and how many iterations
will happen?

        var sum = 0
        for(i in 0..5) {
        sum += i
        }

2. In the while loop below, how many instances of “a” will there be in aLotOfAs? Hint:
aLotOfAs.count tells you how many characters are in the string aLotOfAs.

        var aLotOfAs = ""
        while (aLotOfAs.length < 10) {
        aLotOfAs += "a"
        }

3. Consider the following when expression:

        when {
        x == y && y == z -> println("x = y = z")
        z == 0 -> println("On the x/y plane")
        y == 0 -> println("On the x/z plane")
        x == 0 -> println("On the y/z plane")
        else -> println("Nothing special")
        }

What will this code print when coordinates is each of the following?

        val (x, y, z) = Triple(1, 5, 0)
        val (x, y, z) = Triple(2, 2, 2)
        val (x, y, z) = Triple(3, 0, 1)
        val (x, y, z) = Triple(3, 2, 5)
        val (x, y, z) = Triple(0, 2, 4)

4. A closed range can never be empty. Why?

5. Print a countdown from 10 to 0. (Note: Do not use the downTo method)

6. Print 0.0, 0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 1.0.

Challenges Functions

Challenge 1: It’s prime time

When I’m acquainting myself with a programming language, one of the first things I do
is write a function to determine whether or not a number is prime. That’s your first
challenge.
First, write the following function:

    fun isNumberDivisible(number: Int, divisor: Int): Boolean

You’ll use this to determine if one number is divisible by another. It should return true
when number is divisible by divisor.

Hint: You can use the modulo (%) operator to help you out here.

Next, write the main function:

    fun isPrime(number: Int): Boolean

This should return true if number is prime, and false otherwise. A number is prime if
it’s only divisible by 1 and itself. You should loop through the numbers from 1 to the
number and find the number’s divisors. If it has any divisors other than 1 and itself,
then the number isn’t prime. You’ll need to use the isNumberDivisible() function you
wrote earlier.

Use this function to check the following cases:

    isPrime(6) // false
    isPrime(13) // true
    isPrime(8893) // true

Hint 1: Numbers less than 0 should not be considered prime. Check for this case at the
start of the function and return early if the number is less than 0.

Hint 2: Use a for loop to find divisors. If you start at 2 and end before the number itself,
then as soon as you find a divisor, you can return false.

Hint 3: If you want to get really clever, you can simply loop from 2 until you reach the
square root of number, rather than going all the way up to number itself. I’ll leave it as an
exercise for you to figure out why. It may help to think of the number 16, whose square
root is 4. The divisors of 16 are 1, 2, 4, 8 and 16.

Challenge 2: Recursive functions

In this challenge, you’re going to see what happens when a function calls itself, a
behavior called recursion. This may sound unusual, but it can be quite useful.
You’re going to write a function that computes a value from the Fibonacci sequence.
Any value in the sequence is the sum of the previous two values. The sequence is
defined such that the first two values equal 1. That is, fibonacci(1) = 1 and
fibonacci(2) = 1.
Write your function using the following declaration:

    fun fibonacci(number: Int): Int

Then, verify you’ve written the function correctly by executing it with the following
numbers:

    fibonacci(1) // = 1
    fibonacci(2) // = 1
    fibonacci(3) // = 2
    fibonacci(4) // = 3
    fibonacci(5) // = 5
    fibonacci(6) // = 8
    fibonacci(7) // = 13
    fibonacci(10) // = 55

Hint 1: For values of number less than 0, you should return 0.
Hint 2: To start the sequence, hard-code a return value of 1 when number equals 1 or 2.
Hint 3: For any other value, you’ll need to return the sum of calling fibonacci with
number - 1 and number - 2.

Note: This way of calculating the Fibonacci numbers is not terribly efficient. One
technique to improve the performance is called memoization, which stores the
results of previous calculations and reuses them when possible.

# Challenges Nullability

Challenge 1: You be the compiler

Which of the following are valid statements?

    var name: String? = "Ray"
    var age: Int = null
    val distance: Float = 26.7
    var middleName: String? = null

Challenge 2: Divide and conquer

First, create a function that returns the number of times an integer can be divided by
another integer without a remainder. The function should return null if the division
doesn’t produce a whole number. Name the function divideIfWhole.
Then, write code that tries to extract the nullable result of the function. There should
be two cases: upon success, print "Yep, it divides $answer times", and upon failure,
print "Not divisible :[".
Finally, test your function:

    1. Divide 10 by 2. This should print `"Yep, it divides 5 times"`
    2. Divide 10 by 3. This should print `"Not divisible :["`

Hint 1: Use the following as the start of the function signature:

    fun divideIfWhole(value: Int, divisor: Int)

You’ll need to add the return type, which will be a nullable!
Hint 2: You can use the modulo operator (%) to determine if a value is divisible by
another; recall that this operation returns the remainder from the division of two
numbers. For example, 10 % 2 = 0 means that 10 is divisible by 2 with no remainder,
whereas 10 % 3 = 1 means that 10 is divisible by 3 with a remainder of 1.

Challenge 3: Refactor and reduce
The code you wrote in the last challenge used if statements. In this challenge, refactor
that code to use the Elvis operator instead. This time, make it print "It divides X
times" in all cases, but if the division doesn’t result in a whole number, then X should
be 0.