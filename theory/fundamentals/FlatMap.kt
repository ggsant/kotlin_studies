
fun main() {
    val books = listOf(Books("Calculo", "guidorrizi"), Books("Geometria Analitica", "boulos"))

    // U
    val listOfCourses: List<Course> = books.flatMap (Books::allCourses)
            .distinct()

    for(courses in listOfCourses){
        println(courses.title)
    }
}