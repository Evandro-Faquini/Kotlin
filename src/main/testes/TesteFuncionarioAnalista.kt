package main.testes

import main.Analista


fun main(){

    val joao = Analista(nome = "Joao Pedro", cpf = "123.123.123-99", 2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)


}
