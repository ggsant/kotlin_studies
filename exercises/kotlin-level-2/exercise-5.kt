/*

Exercício 5:
Desenvolva uma função que calcule o IMC de uma pessoa, 
imprimir o valor do IMC e sua classificação

 */
import java.text.DecimalFormat

fun main() {
   var weight : Double = 60.2
   var height : Double = 1.60

   var classification : String = classificationImcParameter(calculusImc(weight, height))
   println(classification)
}

fun calculusImc(anyWeight : Double, anyHeight: Double) : Double {
   var resultImc : Double = anyWeight / Math.pow(anyHeight, 2.0)
   return resultImc
}

fun classificationImcParameter(imc : Double) : String {
   val decimalFormat = DecimalFormat("#.##")

   var imcPrint : String = decimalFormat.format(imc)

   if (imc < 18.5) {
      return "IMC $imcPrint: Abaixo do peso"
   } else if (18.5 <= imc && imc <= 24.9) {
      return "IMC $imcPrint: Peso normal"
   } else if (25.0 <= imc && imc<= 29.9) {
      return "IMC $imcPrint: Sobrepeso"
   } else if (30.0 <= imc && imc <= 34.9) {
      return "IMC $imcPrint: Obesidade peso 1"
   } else if (35.0 <= imc && imc <= 39.9) {
      return "IMC $imcPrint: Obesidade peso 2"
   } else {
      return "IMC $imcPrint: Obesidade peso 3"
   }

}