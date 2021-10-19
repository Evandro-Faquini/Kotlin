package main

class Pessoa {
    var nome: String = "Jether"
    var cpf: String = "123.123.123-11"
    private set

    constructor()

    fun pessoalInfo() = "$nome e $cpf"
}

fun main(){
    val jether = Pessoa()

    println(jether.pessoalInfo())


}