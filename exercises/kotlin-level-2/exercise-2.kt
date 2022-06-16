/*

Exercício 2:
Utilizando a estrutura condicional, desenvolva um algoritmo que determine se uma pessoa 
é maior ou menor de idade

*/

fun main() {
    var age : Int = 17

    var resultClassification = ageClassificationFunction(age)
    println("$age: $resultClassification")

}

fun ageClassificationFunction(anyAge : Int) : String {
    if (anyAge >= 18) {
        return "Maior de idade!"
    } else {
        return "Menor de idade!"
    }
}