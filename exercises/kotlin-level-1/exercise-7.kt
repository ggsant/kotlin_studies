/*
 * Exercício 7:
 * Desenvolva um algoritmo que calcule e imprima a 
 * média das cinco notas de um aluno. 
 */

import java.util.Arrays

fun main() {
    val note1 : Double = 7.5
    val note2 : Double = 5.5
    val note3 : Double = 2.0
    val note4 : Double = 5.0
    val note5 : Double = 7.0 

    /* Inicializando a lista com elementos do tipo Double */

    var notes = listOf<Double>()

    /* Adicionando elementos ao array */
    notes += note1
    notes += note2
    notes += note3
    notes += note4
    notes += note5


    /* Declarar tipagem */

    var sum : Double = 0.0
    var count : Int = 0
    var printNote : String = ""

    for (note in notes) {
        /* Variável para imprimir cada nota ao final */

        printNote += note

        /* Adicionar vírgula após cada elemento, exceto o último */

        if (note == notes.get(notes.size - 1)) {
            printNote += "" 
        } else {
            printNote += ", " 
        }

        sum += note
        count++
    }

    var media : Double = sum / count

    println("Média das notas $printNote: $media" )
}
