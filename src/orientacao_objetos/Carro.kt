package orientacao_objetos

//construtor
class Carro(var cor: String, var modelo: String, var velocidade: Int) {
    fun acelerar(){
        velocidade += 10
        println("Vrum! o $modelo $cor acelerou para $velocidade km/h")
    }

    fun frear(){
        velocidade -= 10
        println("Skrr! o $modelo $cor reduziu a velocidade para $velocidade km/h")
    }
}

fun main(){
    val corolla = Carro(cor = "branco", modelo = "corolla", velocidade = 0)
    val civic = Carro(cor = "Cinza", modelo = "Civic", velocidade = 0)

    println("-_-_ Corrida iniciada -_-_")

    //corolla
    corolla.acelerar()
    corolla.acelerar()

    //civic
    civic.acelerar()
    civic.acelerar()
    civic.acelerar()

    println("-_-_ Fim da Corrida -_-_")
    println("Velocidade final do Corolla: ${corolla.velocidade}")
    println("Velocidade final do Civic ${civic.velocidade}")
}