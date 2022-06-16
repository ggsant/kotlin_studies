
/**
 * Adding label by type inputName and add @ mark
 * Label also can integrate with break, continue, and return
 * It is called break to label, continue to label, and return to label
*/
fun main() {

    label()
    labelBreak()
    labelContinue()

    //Using return@inputNameOfLabel, we can return value which code will be returned
    test("Gabriela") test@ {
        when (it) {
            "" -> return@test
            else -> println("Santos")
        }
    }
}

//We can add label by adding inputNameOfLabel@
fun label() {
    println("Label")
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10) {
            println("$i x $j = ${i * j}")
        }
    }
}

/**
 * Using break@inputNameOfLabel, we can stop which code will be stopped
 * Ex: We will stop for loop I after break, we can add break@loopI
*/
fun labelBreak() {
    println("Label break")
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10) {
            if (i > 5) {
                break@loopI
            }
            println("$i x $j = ${i * j}")
        }
    }
}

/**
 * Using continue@inputNameOfLabel, we can continue which code will be continued
 * Ex: We will continue at loop I, we can add continue@loopI
 */
fun labelContinue() {
    println("Label continue")
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10) {
            if (j == 5) {
                continue@loopI
            }
            println("$i x $j = ${i * j}")
        }
    }
}

fun test(inputName: String, operation: (String) -> Unit): Unit = operation(inputName)