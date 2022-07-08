fun main() {
     // Challenge 1 - Create a constant called coordinates and assign a pair containing two and three to it.

  val coordinates = Pair(2, 3)
  println(coordinates)

  // Challenge 2 - Extract the values 2 and 3 from coordinates into two variables called row and column.

  val (row, column) = coordinates
  println("$row, $column")

  // Challenge 3 - Which of the following are valid statements?

//  val character: Character = "Dog" // INVALID
  val character: Char = 'd' // VALID
  val string: String = "Dog" // VALID
  println(character)
  println(string)

//  val string: String = 'd' // INVALID

  // Challenge 4 - Is this valid code?

  val date = Triple(15, 8, 2015)
//  val day = date.First // INVALID
  val day = date.first
  println(day)

  // Challenge 5 - What is wrong with the following code?

//  val name = "Joe"
//  name += " Howard" // val is immutable
  var name = "Joe"
  name += " Howard"

  // Challenge 6 - What is the type of the constant named value?

  val triple = Triple(100, 1.5, 10)
  val value = triple.second // Double
  println(value)

  // Challenge 7 - What is the value of the constant named month?

  val newDate = Triple(15, 8, 2015)
  val month = newDate.second // Int
  println(month)

  // Challenge 8 - What is the value of the constant named summary?

  val number = 10
  val multiplier = 5
  val summary = "$number multiplied by $multiplier equals ${number * multiplier}"
  println(summary)

  // Challenge 9 - What is the sum of a and b, minus c? What is its type?

  val a = 4
  val b: Short = 100
  val c: Byte = 12
  val sum: Int = a + b + c
  println(sum)

  // Challenge 10 - What is the numeric difference between kotlin.math.PI and kotlin.math.PI.toFloat()?

  println(kotlin.math.PI - kotlin.math.PI.toFloat())
}