
fun main() {

    //Break
    var i = 0

    while (true) {
        println("while: $i")
        i++

        if (i > 10) {
            println("bigger than 10")
            break
        }
    }

    //Continue
    for (j in 1..1000) {
        if (j % 2 == 0) {
            continue
        }

        println("continue $j")
    }
}