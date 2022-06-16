
fun main() {
    val names = listOf("Brian","Kamau", "G")

    val indexOfNames = names.itemAt(0)

    print(indexOfNames)

    val node: Node<Int> = Node(2)
    print(node.value())

    val nodeString: Node<String> = Node("Gabriela")
    print(nodeString)

}


fun <T> List<T>.itemAt(index: Int) : T {
    return this[index]
}

// Implementing Generic Classes.
class Node<T>(private val item : T){
    fun value() : T {
        return item
    }
}