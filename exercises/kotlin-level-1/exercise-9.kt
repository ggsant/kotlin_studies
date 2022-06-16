/*
 * Exercício 9:
 * Desenvolva um algoritmo que calcule o desconto na venda 
 * de um produto
 */

fun main() {
    var price : Double = 25.50
    var discount : Double = 0.15
    var quantity : Int = 3
    var newPrice : Double = price

    /* Desconto varia com a quantidade */

    if (quantity >= 2) {
        newPrice -= (discount * price)
    } else if (quantity >= 4) {
        discount += 0.05
        newPrice -= (discount * price)
    } else  {
        discount += 0.10
        newPrice -= (discount * price)
    }

    discount = discount * 100

    println("O preço original era de R$ $price. Para $quantity unidades, o desconto foi de $discount %. Assim, o preço final com desconto é de R$ $newPrice." )
}
