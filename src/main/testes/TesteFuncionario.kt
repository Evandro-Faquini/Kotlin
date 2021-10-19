package main.testes

import main.Funcionario
import main.Pessoa
import java.math.BigDecimal
import java.math.BigDecimal.valueOf as valueOf1

fun main(){

    val jether = Pessoa(nome = "Jether Rodrigues", cpf = "123.123.123-99")

    println(jether.nome)
    println(jether.cpf)


    val joao = Funcionario(nome = "Jether Rodrigues", cpf = "123.123.123-99", BigDecimal.valueOf(2000.0))
    println(joao.nome)
    println(joao.cpf)
    print(joao.salario)
}