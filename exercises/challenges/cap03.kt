import kotlin.math.*

fun main() {

    // 1. What’s wrong with the following code?

    //         val firstName = "Dick"
    //         if (firstName == "Dick") {
    //         val lastName = "Lucas"
    //         } else if (firstName == "Ray") {
    //         val lastName = "Wenderlich"
    //         }
    //         val fullName = firstName + " " + lastName

    // `lastName` is no longer in scope when setting `fullName`.

    val firstName = "Dick"
    var lastName: String = ""
    if (firstName == "Dick") {
        lastName = "Lucas"
    } else if (firstName == "Ray") {
        lastName = "Wenderlich"
    }
    val fullName = firstName + " " + lastName
    println(fullName)

    //     2. In each of the following statements, what is the value of the Boolean answer
    // constant?

    val answer1 = true && true
    val answer2 = false || false
    val answer3 = (true && 1 != 2) || (4 > 3 && 100 < 1)
    val answer4 = ((10 / 2) > 3) && ((10 % 2) == 0)
    println(answer1) // true
    println(answer2) // false
    println(answer3) // true
    println(answer4) // true

    // 3. Suppose the squares on a chessboard are numbered left to right, top to bottom, with
    // 0 being the top-left square and 63 being the bottom-right square. Rows are
    // numbered top to bottom, 0 to 7. Columns are numbered left to right, 0 to 7. Given a
    // current position on the chessboard, expressed as a row and column number,
    // calculate the next position on the chessboard, again expressed as a row and column
    // number. The ordering is determined by the numbering from 0 to 63. The position
    // after 63 is again 0.

    val row = 7
    val column = 7

    var nextRow = row
    var nextColumn = column + 1
    if (nextColumn > 7) {
        nextColumn = 0
        nextRow += 1
    }
    if (nextRow > 7) {
        nextRow = 0
    }
    println("The position after ($row, $column) is ($nextRow, $nextColumn)")

    /*
    4. Given the coefficients a, b and c, calculate the solutions to a quadratic equation with these coefficients. Take
    into account the different number of solutions (0, 1 or 2). If you need a math refresher, this Wikipedia article on
    the quadratic equation will help https://en.wikipedia.org/wiki/Quadratic_formula.
    */
    val a: Double = 1.0
    val b: Double = -5.0
    val c: Double = 6.0

    val delta = b.toDouble().pow(2) - (4 * a * c)
    if (delta < 0) {
        println("Delta é menor que zero ($delta). Portanto a equação não tem solucão real.")
    } else if (delta == 0.0) {
        println(
                "Delta igual a zero ($delta). Portanto a equação tem uma solucão real ou duas soluções iguais."
        )
        val x = -b / (2 * a)
        println("A solução dessa equação é: $x")
    } else {
        println("Delta é maior que zero ($delta). Portanto a equação tem duas solucões reais.")
        val x = (-b + sqrt(delta)) / (2 * a)
        val y = (-b - sqrt(delta)) / (2 * a)

        println("As soluções dessa equação são: $x  e $y")
    }

    //  5. Given a month (represented with a String in all lowercase) and the current year
    // (represented with an Int), calculate the number of days in the month. Remember
    // that because of leap years, "february" has 29 days when the year is a multiple of 4
    // but not a multiple of 100. February also has 29 days when the year is a multiple of
    // 400.
    val month = "february"
    val year = 2016

    if (month == "january" ||
                    month == "march" ||
                    month == "may" ||
                    month == "july" ||
                    month == "august" ||
                    month == "october" ||
                    month == "december"
    ) {
        println("This month has 31 days")
    } else if (month == "april" || month == "june" || month == "september" || month == "november") {
        println("This month has 30 days")
    } else if (month == "february" && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
        println("This month has 29 days")
    } else if (month == "february") {
        println("This month has 28 days")
    } else {
        println("This is not a valid month")
    }
    /*
    6. Given a number, determine if this number is a power of 2. (Hint: you can use log2(number) to find the base 2
    logarithm of number. log2(number) will return a whole number if number is a power of two. You can also solve the
    problem using a loop and no logarithm.)
    */
    val number = 4.0
    val log = log2(number)
  if (log == log.toInt().toDouble()) {
    println("$number is a power of 2")
  } else {
    println("$number is not a power of 2")
  }

   /*
  7. Print a table of the first 10 powers of 2.
  */
  var exponent = 0
  var power = 1
  while (exponent <= 10) {
    println("$exponent, $power")
    exponent += 1
    power *= 2
  }
   /*
  8. Given a number n, calculate the n-th Fibonacci number.  (Recall Fibonacci is 1, 1, 2, 3, 5, 8, 13, ... Start with
  1 and 1 and add these values together to get the next value.  The next value is the sum of the previous two.  So the
  next value in this case is 8+13 = 21.)
  */

  val goal = 10  // the value of n

  var current = 1
  var previous = 1
  var done = 2
  while (done < goal) {
    val next = current + previous
    previous = current
    current = next
    done += 1
  }
  println("Fibonacci number $goal is $current")

   /*
  9. Given a number n, calculate the factorial of n.  (Example: 4 factorial is equal to 1 * 2 * 3 * 4.)
  */

  val n = 4
  var i = 1
  var factorial: Int = 1
  while(i <=4) {
    factorial *=i
    i++
  }
  println("$n! is $factorial")

  /*
  10. Given a number between 2 and 12, calculate the odds of rolling this number using two six-sided dice. Compute it
  by exhaustively looping through all of the combinations and counting the fraction of outcomes that give you that
  value. Don't use a formula.
  */

  val targetValue = 7
  var combinationsFound = 0
  println("Entrou no for")

  for (k in 0..6) {
      for (j in 0..6) {
          if (k + j == targetValue) combinationsFound++
      }
  }
  println("Saiu do for")

  var probability = ((combinationsFound.toDouble() / 36) * 100).toInt()

  println("The odds of rolling a $targetValue are $combinationsFound in 36 or $probability%")

}
