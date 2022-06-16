// *  Array
// *  O Array é uma das estruturas de dados mais fundamentais em praticamente todas as linguagens de
// programação.
// * A ideia por trás de um array é armazenar vários itens do mesmo tipo de dados, como um inteiro
// ou string sob um único nome de variável.
// *  Arrays são usados ​​para organizar dados em programação para que um conjunto de valores
// relacionados possa ser facilmente classificado ou pesquisado.
// *  Aqui estão algumas propriedades básicas de arrays:
// *  1) Eles são armazenados em locais de memória contíguos.
// *  2) Eles podem ser acessados ​​programaticamente por meio de seus índices (array[1], array[0],
// etc.)
// *  3) Eles são mutáveis.
// *  4) Seu tamanho é fixo.

fun main() {
    // * Criar um array
    // No Kotlin, os arrays não são um tipo de dados nativo, mas uma coleção mutável de itens
    // semelhantes que são representados pela classe Array.
    // Existem duas maneiras de definir um array em Kotlin: usando a função arrayOf() ou usando o
    // contrutor Array()

    // * Usando a funçao arrayOf()
    val array = arrayOf(1, 2, 3, 4, 5)
    print(array)

    val array2 = arrayOf<Int>(10, 20, 30, 40, 50)
    print(array2)

    // * Usando o construtor Array()
    // Como Array é uma classe em Kotlin, também podemos usar o construtor Array para criar um
    // array.
    // O construtor recebe dois parâmetros:
    // 1) O tamanho da matriz e
    // 2) Uma função que aceita o índice de um determinado elemento e retorna o valor inicial desse
    // elemento.
    val array3 = Array(5, { i -> i * 1 })
    print(array3)

    // Além desses, o Kotlin também possui alguns métodos de factory integrados para criar arrays de
    // tipos de dados primitivos,
    // como byteArray, intArray, shortArray, etc. Essas classes não estendem a classe Array; no
    // entanto, eles implementam os mesmos métodos e propriedades.
    // Os métodos de factory disponíveis para criar arrays são:
    // intArrayOf()
    // byteArrayOf()
    // charArrayOf()
    // shortArrayOf()
    // LongArrayOf()

    // * Acessando e modificando arrays
    // Até agora, vimos como criar e inicializar um array em Kotlin. Agora, vamos ver como
    // acessá-los e modificá-los.
    // Novamente, existem duas maneiras de fazer isso:

    // * Usando os métodos get()e set():

    // Como você sabe, um array em Kotlin é basicamente uma classe.
    // Portanto, podemos acessar os dados de um objeto de classe por meio de suas funções-membro.
    // As funções get() e set() são chamadas de funções-membro.

    // O método get() recebe um único parâmetro — o índice do elemento e retorna o valor do item
    // nesse índice.
    val x = array.get(0)
    print(x)

    // O método set() recebe 2 parâmetros: o índice do elemento e o valor a ser inserido.
    // O código abaixo define o valor do segundo elemento na matriz para 3
    array.set(1, 3)

    // * Usando o operador de índice [ ]
    // O operador [ ] pode ser usado para acessar e modificar arrays.
    // Para acessar um elemento de array, a sintaxe seria:

    val y = array[1]
    print(y)

    // Isso atribuirá o valor do segundo elemento em array a x .
    // Para modificar um elemento de array, devemos fazer:
    array[2] = 5
    // Isso mudará o valor do terceiro elemento na matriz num para 5.
    // * Nota: Internamente, o operador de índice ou [ ] é na verdade um operador sobrecarregado
    // (consulte sobrecarga de operador) e representa apenas chamadas para as funções de membro
    // get()e .set()

    // * Percorrendo um array
    // Uma propriedade importante de um array é que ele pode ser percorrido programaticamente e cada
    // elemento no array pode ser manipulado individualmente. Kotlin suporta algumas maneiras
    // poderosas de atravessar array.
    // O idioma mais simples e mais comumente usado quando se trata de percorrer um array é usar o
    // for-loop .
    for (i in array.indices) {
        println(array[i])
    }

    // Alternativamente, podemos usar o intervalo para obter o mesmo efeito.
    // Em Kotlin, um intervalo é um intervalo entre dois valores (início e fim) e pode ser criado
    // usando o operador (..).
    // A travessia pelo intervalo pode ser feita usando a palavra-chave in .
    for (i in 0..array.size - 1) {
        println(array[i])
    }
    // Podemos utilizar o forEach tambem.
    array.forEach({ index -> println(index) })
}
