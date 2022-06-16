
fun main() {
    print("Hello world \n")

    val message = "hello world"

    val result = if (message == "hello world") {
        "Gabriela"
    } else {
        "Hello world"
    }
    println(result)

    val question: Question? = Question()
    question?.display()
    question?.printResults("42")
    question?.answers = "800"


    // Understanding Try Catch Blocks
    val number: Int? = try {
        Integer.parseInt(question?.answers)
    }catch(numberFormatException: NumberFormatException){
        null
    }
    print(number)
}


class Question {
    var answers: String? = null
    val correctAnswer = "42"
    val nearCorrectAnswer = "43"

    val question: String = "What is the answer to life, the universe and everything"

    fun display() {
        println("You said ${answers}")
    }


    // Using the when statement {-Switch Case Statements }
    fun printResults(providedAnswer: String){
        when(providedAnswer){
            correctAnswer -> print("you were correct")
            nearCorrectAnswer -> print("You are almost there :)")
            else -> print("Try Again Later")
        }
    }
}