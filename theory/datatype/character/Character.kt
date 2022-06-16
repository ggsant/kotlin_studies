

fun main() {
// * Os caracteres são representados pela palavra-chave Char .
// Eles não podem ser tratados diretamente como números, mas você pode executar funções de conversão explícitas de 
// acordo com suas necessidades. Vamos entender isso por exemplo.
// *var char: Char = 65// Erro de tempo de compilação . 
// Este código funciona bem em Java, mas gerará erro no kotlin.
// Os literais de caracteres vão entre aspas simples como 'V' , ' J' etc.
// No kotlin, as strings são representadas pela classe String . 
// Os literais de string vão dentro das aspas duplas como “Viveki”, “Jay” etc.
// Caracteres especiais podem ser escapados usando uma barra invertida.

// As seguintes sequências de escape são suportadas:

// \t — Para imprimir a guia
// \b — Para usar uma barra invertida
// \n — caractere de nova linha
// \r — retorno de carro
// \' — Para imprimir aspas simples
// \” — Para imprimir aspas duplas
// \\ — Para imprimir uma barra invertida
// \$ — Para imprimir o cifrão
// Para codificar qualquer outro caractere como hexadecimal ou binário, use a sintaxe de sequência de escape Unicode: '\uFF004'.

    //Char
    var char1: Char = 'G'
    var char2: Char = '4'
    var char3: Char = 'B'
    var char4: Char = 'R'
    var char5: Char = '1'
    var char6: Char = 'E'
    var char7: Char = 'L'
    var char8: Char = '4'


    //For char type
    print("$char1 $char2 $char3 $char4 $char5 $char6 $char7 $char8")
}