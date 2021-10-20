package main.testes

import main.Cliente
import main.ClienteTipo

fun main(){
    val jose = Cliente(
        nome = "Jose da Silva",
        cpf =  "123.123.123-99",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )
    println(jose)

    TesteAutenticacao().autentica(jose)

}







