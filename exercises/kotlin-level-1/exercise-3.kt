/*
 * Exercício 3:
 * Desenvolva um algoritmo que imprima o valor ao quadrado de um número
 * 
 */

fun main() {
    /* Inicialmente tudo deve ser Double, pra se utilizar a função 
    * Math.pow, depois pra imprimir, fazer o cast, com declaração 
    * implícita.
    */

    val number : Double = 5.0
    
    var result : Double = Math.pow(number, 2.0)
    
    val numberInteger = number.toInt()
    var resultInteger = result.toInt()
    
    println("Número $numberInteger elevado ao quadrado: $resultInteger")
}
