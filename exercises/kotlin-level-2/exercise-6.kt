/*

Exercício 6:
Utilizando o loop de repetição for, desenvolva um algoritmo que imprima qualquer tabuada

*/

fun main() {
    var number : Int = 5

    var multiplyTable : List<Int> = calculusMultiply(number)
    
    println("Taboada do $number: ")

    /* Adicionar vírgula após cada elemento, exceto o último */

    for (eachNumber in multiplyTable) {
        if (eachNumber == multiplyTable.get(multiplyTable.size - 1)) {
            print(eachNumber)
        } else {
            print("$eachNumber, ")
        }
    }
}

fun calculusMultiply(anyNumber : Int) : List<Int> {
    /* Lista de inteiros */

    var listMultiply = listOf<Int>()

    /* For: estabelecer uma variável e o intervalo de repetições, usando o until (ou .. - incluindo o último), que vai excluir o úlimo número. 
    Essa variável (count) vai aumentando conforme as passagens. */
    
    for (count in 1 until 11) {
        listMultiply += anyNumber * count
    }

    return listMultiply
}