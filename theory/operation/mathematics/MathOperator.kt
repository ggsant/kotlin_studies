
fun main() {

    //Using int type
    val resultInt = 10 / 2
    println(resultInt)

    //Using double type
    val resultDouble = 10.0 / 3.0
    println(resultDouble)

    //Using scientific operator
    val result = 10 + 10 / 2
    println(result)

    //Augmented assignments
    var total = 0

    val num1 = 100
    total += num1

    val num2 = 200
    total -= num2

    val num3 = 300
    total *= num3

    val num4 = 400
    total /= num4

    println("Total: $total")

    //Unary operator
    total++ //total = total + 1
    total-- //total = total - 1
    println(total)

    val a = true
    println(!a)

}