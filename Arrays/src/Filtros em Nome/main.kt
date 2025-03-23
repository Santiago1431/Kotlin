
fun main(){
    var nomes = arrayOf("JOAO", "mARIA", "Jose", "santiago")

    //filtar os nomes que começam com J
    val nomesComJ = nomes.filter {it.startsWith("J")}.toTypedArray()

    //Tranforma em caixa alta
    val nomesMaiusculos = nomes.map {it.toUpperCase()}.toTypedArray()

    //Ordenar em ordem alfabetica
    val nomesAlfabetico = nomes.sorted().toTypedArray()

    //imprimir
    println("Nomes com J:")
    nomesComJ.forEach { println(it) }

    println("Nomes em maiusculo: ")
    nomesMaiusculos.forEach { println(it) }

    println("Nomes em Ordem: ")
    nomesAlfabetico.forEach { println(it) }

}