
fun main() {
    val person: List<Persons> = listOf(Persons(23))
    print(person)
}
data class Persons(val age: Int)