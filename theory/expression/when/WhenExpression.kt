fun main() {

    //When
    val finalExam = 'A'
    when (finalExam) {
        'A' -> println("Amazing!")
        'B' -> println("Good!")
        'C' -> println("Not bad!")
        'D' -> println("Bad!")
        else -> println("Try again next year!")
    }

    //When using multiple options
    when (finalExam) {
        'A', 'B', 'C' -> println("You passed!")
        else -> println("Not passed!")
    }

    //When using In expression
    val passValue = arrayOf('A', 'B', 'C')
    when (finalExam) {
        in passValue -> println("Amazing!")
        !in passValue -> println("Try again next year!")
    }

    //When using Is expression
    when (finalExam) {
        is Char -> println("Final exam is Char!")
        !is Char -> println("Final exam not Char!")
    }

    //When as variable
    val a = 90
    when {
        a > 90 -> println("Great!")
        a > 80 -> println("Good job!")
        a > 70 -> println("Not bad!")
        a > 60 -> println("Bad!")
        else -> println("Try again next year")
    }
}