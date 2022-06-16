// * Para denotar o receptor atual, usamos This Expressions:
// * 1) Se a expressão this for utilizada em um membro de classe, ela refere-se ao objeto atual dessa classe.
// * 2) Se a expressao this for utilizada em uma função de extensão ou um literal de funçao com receptor,
// * ela refere-se o parametro receptor que é passado no lado esquerdo de um ponto. 
// * Se o this não tiver qualificadores, refere-se ao escopo mais interno.
// * Para fazer referência ao this em outros escopos, os label qualifiers são usados:

// * Qualified this:
// * Para acessar o this de um escopo externo (uma classe , função de extensão ou literal de função rotulada com receptor ) 
// * você deve escrever this@label, onde @label é um rótulo no escopo this:

class A { // implicit label @A
    inner class B { // implicit label @B
        fun Int.foo() { // implicit label @foo
            val a = this@A // A's this
            val b = this@B // B's this

            val c = this // foo()'s receiver, an Int
            val c1 = this@foo // foo()'s receiver, an Int

            val funLit = lambda@ fun String.() {
                val d = this // funLit's receiver, a String
            }

            val funLit2 = { s: String ->
                // foo()'s receiver, since enclosing lambda expression
                // doesn't have any receiver
                val d1 = this
            }
        }
    }
}

// * Implicit this
// * Ao chamar uma member function em um this, você poderá pular a parte this. 
// * Se você tiver uma non-member function com o mesmo nome, use-a com cuidado porque em alguns casos ela pode ser chamada:

fun printLine() { println("Top-level function") }

class C {
    fun printLine() { println("Member function") }

    fun invokePrintLine(omitThis: Boolean = false)  { 
        if (omitThis) printLine()
        else this.printLine()
    }
}

C().invokePrintLine() // Member function
C().invokePrintLine(omitThis = true) // Top-level function