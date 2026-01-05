package orientacao_objetos

data class Moeda(val nome: String, val valor: Double)

fun main(){
    val bitcoin = Moeda("bitcoin", 350000.0)
    val ethereum = Moeda("Ethereum", 18000.0)

    println(bitcoin)
    println(ethereum)
}