
fun main() {
    val rangeOfIntegers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    val smallIntegers = rangeOfIntegers.filter { it <= 4 }

    for (i: Int in smallIntegers) {
        println(i)
    }


    val meetings = listOf(Books("Calculo", "guidorrizi"), Books("Geometria Analitica", "boulos"))

    val titles: List<String> = meetings
            .filter { it.title.startsWith("T") }
            .map { meeting -> meeting.title }


    for (title in titles) print(title)


    val titleSequence = meetings
            .asSequence()
            .filter { it.title.startsWith("T") }
            .map { meeting -> meeting.title }

    for (titleSequences in titleSequence){
        println(titleSequences)
    }

}