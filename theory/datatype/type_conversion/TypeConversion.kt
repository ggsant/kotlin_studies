// A conversão de tipo (também chamada de conversão de tipo) refere-se à alteração da entidade de
// uma
// variável de tipo de dados em outro tipo de dados. Como sabemos, Java suporta conversão de tipo
// implícita
// de tipos de dados menores para maiores. Um valor inteiro pode ser atribuído ao tipo de dados
// longo.
// Mas, Kotlin não suporta conversão de tipo implícita. Um valor inteiro não pode ser atribuído ao
// tipo de dados longo.

fun main() {
    var myNumber = 100
    // var myLongNumber: Long = myNumber // Erro do compilador
    // Tipo incompatível: o tipo inferido é Int, mas Long era esperado

    // Em Kotlin, a função auxiliar pode ser usada para converter explicitamente um tipo de dados em
    // outro tipo de dados.
    var myLongNumber: Long = myNumber.toLong() // compila com sucesso
    print(myLongNumber)

    // Conversão de tipo de dados maior para menor

    var myLongNumber2 = 10L
    var myNumber2: Int = myLongNumber2.toInt()
    print(myNumber2)

    // As seguintes funçõese auxiliares podem ser utilizadas para converter um tipo de dados em
    // outro:
    // toByte()
    // paraShort()
    // toInt()
    // ajuda()
    // flutuar()
    // dobrar()
    // toChar()
    // Nota: Não há nenhuma função auxiliar disponível para converter em tipo booleano.

    println("259 to byte: " + (259.toByte()))
    println("50000 to short: " + (50000.toShort()))
    println("21474847499 to Int: " + (21474847499.toInt()))
    println("10L to Int: " + (10L.toInt()))
    println("22.54 to Int: " + (22.54.toInt()))
    println("22 to float: " + (22.toFloat()))
    println("65 to char: " + (65.toChar()))
    println("A to Int: " + ('A'.code))
}
