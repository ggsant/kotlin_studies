/*

Exercício 7:
Utilizando o loop de repetição for, desenvolva um algoritmo que conte a quantidade de vogais em uma String

*/

fun main() {
    var word : String = "Programacao"

    var vowels : Int = getVowelsLetters(word)
    println("Quantidade de vogais da palavra $word: $vowels")
}

fun getVowelsLetters(anyWord : String) : Int {
    /* Lista de Vogais - String */
    
    var vowels = listOf<Char>('A', 'E', 'I', 'O', 'U')

    var wordUpperCase : String = anyWord.uppercase()

    var count : Int = 0

    /* For recebendo a variável index, que começa em 0. */

    for (index in 0 until wordUpperCase.length - 1) {
        var letter : Char = wordUpperCase[index].toChar()

        if (vowels.contains(letter)) {
            count++
        }
    }

    return count
}