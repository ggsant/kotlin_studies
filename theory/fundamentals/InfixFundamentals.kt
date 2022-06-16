
import java.math.BigInteger

fun main() {
    val header1 = Headers("H1")
    val header2 = Headers("H2")

    val header3 = header1 plus header2
    print(header3.name)

    val header4 = header1 + header2
    print(header4.name)

    // Calculate fibbonaci sequence
    print("\n ${calculateFibbonaciSequence(10000, BigInteger("1"),BigInteger("0"))}")
}

class Headers(var name: String) {}


infix operator fun Headers.plus(other: Headers): Headers {
    return Headers(this.name + other.name)
}


tailrec fun calculateFibbonaciSequence(n: Int, a: BigInteger, b: BigInteger) : BigInteger {
    return if (n == 0) b else calculateFibbonaciSequence(n - 1, a + b, a)
}

