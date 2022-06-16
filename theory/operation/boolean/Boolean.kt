
fun main() {

    /**
     * Boolean
     * && <- AND, || <- OR, ! <- NOT
     */
    val finalExam = 80
    val attendant = 75

    val passFinalExam = finalExam > 75
    val passAttendant = attendant > 80

    println(passFinalExam)
    println(passAttendant)

    //Using AND statement
    val passAND = passFinalExam && passAttendant

    //Using OR statement
    val passOR = passFinalExam || passAttendant

    //Print result
    println("Am I pass? : $passAND")
    println("Am I pass? : $passOR")

}