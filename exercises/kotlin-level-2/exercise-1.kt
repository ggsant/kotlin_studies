/*

Exercício 1:
Crie funções para as 4 operações aritméticas básicas

 */

import java.text.DecimalFormat

fun main() {
    /* Números */

    var number1 : Int = 4
    var number2 : Int = 6

    /* Soma */
    var resultSum = soma(number1, number2)
    println("Soma de $number1 e $number2: $resultSum")    

    /* Subtração */
    var resultSub = subtracao(number1, number2)
    println("Subtracao de $number1 e $number2: $resultSub")

    /* Multiplicação */
    var resultMultiply = multiplicacao(number1, number2)
    println("Multiplicao de $number1 e $number2: $resultMultiply")

    /* Divisão */
    var resultDiv = divisao(number1, number2)
    println("Divisao de $number1 e $number2: $resultDiv")
}

/* Ao criar a função, declarar o tipo das variáveis e do retorno */
fun soma(num1 : Int, num2 : Int) : Int {
    return num1 + num2
}

fun subtracao(num1 : Int, num2 : Int) : Int {
    return num1 - num2
}

fun multiplicacao(num1 : Int, num2 : Int) : Int {
    return num1 * num2
}

fun divisao(num1 : Int, num2 : Int) : String {

    /* Resultado em double, numerador deve ser double */

    var doubleNum1 : Double = num1.toDouble()

    /* Formatar double para duas casas decimais */

    var result : Double = doubleNum1 / num2

    val decimalFormat = DecimalFormat("#.##")

    return decimalFormat.format(result)
}