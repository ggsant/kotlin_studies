/*

Exercício 4: 
Utilizando a estrutura condicional e operadores lógicos, 
desenvolva um algoritmo que simule um sistema de login

 */

fun main() {
    var email : String = "teste@teste.com"
    var password : Int = 12345

    var resultValidate : String = validateLoginFun(email, password)
    println("$resultValidate")
}

fun validateLoginFun(emailReceived : String, passwordReceived : Int) : String {
    if (emailReceived == "teste@teste.com" && passwordReceived == 12345) {
        return "Usuario logado!"
    } else if (emailReceived != "teste@teste.com" && passwordReceived != 12345) {
        return "Email e senha incorretos. Por favor, tente novamente."
    } else if (emailReceived != "teste@teste.com") {
        return "Email incorreto. Por favor, tente novamente."
    } else {
        return "Senha incorreta. Por favor, tente novamente."
    }
}