package main.testes


import main.Gerente


fun main(){

    val maria = Gerente(nome = "Maria do Carmo", cpf = "123.123.123-99", 5000.0)
    ImprimeRelatorioFuncionario.imprime(maria)


}
