fun main() {
    var a: String = "abc" // Regular initialization means non-null by default
    // a = null // compilation error
    print(a)

    var b: String? // can be set to null
    b = null // ok
    print(b)

    // Safe Calls

    val l = b?.length ?: -1 // elvis operator

    print(l)

    print(b?.length) // using ?.

    // To perform a certain operation only for non-null values, you can use the safe call operator together with let:

    val listWithNulls: List<String?> = listOf("Kotlin", null)
    for (item in listWithNulls) {
        item?.let { println(it) } // prints Kotlin and ignores null
    }

    // Since throw and return are expressions in Kotlin, 
    // they can also be used on the right-hand side of the Elvis operator.
    //  This can be handy, for example, when checking function arguments:

    fun foo(node: String?, example: String?): Int? {
        val parent = node?.length ?: return null
        val name = example?.length ?: throw IllegalArgumentException("name expected")
        return parent + name
    }

    //The third option is for NPE-lovers: the not-null assertion operator (!!) 
    // converts any value to a non-null type and throws an exception if the value is null. 
    // You can write b!!, and this will return a non-null value of b (for example, a String in 
    // our example) or throw an NPE if b is null:
    val c: String? = null
    val operator = if (c != null) c!!.length else null

}
