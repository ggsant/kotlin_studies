/*

Exercício 3:
Utilizando a estrutura condicional e operadores relacionais, 
desenvolva um algoritmo que identifique se um determinado número inteiro é par ou ímpar

 */

 fun main() {
    var number : Int = 6

    var result = evenOdds(number)
    println("$number: $result")
 }

 fun evenOdds(anyNumber : Int) : String {
    if (anyNumber % 2 == 0) {
        return "Numero par!"
    } else {
        return "Numero ímpar!"
    }
 }