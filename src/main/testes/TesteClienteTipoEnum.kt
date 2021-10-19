import main.ClienteTipo

fun main() {

    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.Descricao}")

    }

    ClienteTipo.values().forEach {
        println("${it.name} - ${it.Descricao}")
    }

    val pf = ClienteTipo.PF
    println("${pf.name} - ${pf.Descricao}")

    val pj = ClienteTipo.PJ
    println("${pj.name} - ${pj.Descricao}")

}




