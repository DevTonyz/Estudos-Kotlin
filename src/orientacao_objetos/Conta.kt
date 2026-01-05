package orientacao_objetos

class Conta(val titular: String, var saldo: Double) {
    fun depositar(valor: Double){
        saldo += valor
        println("Deposito de R$ $valor realizado! saldo atual: R$ $saldo")
    }
    fun sacar(valor: Double){
        if (valor <= saldo){
            saldo -= valor
            println("Saque de R$ $valor realizado! saldo atual: R$ $saldo")
        } else {
            println("saldo insuficiente para saque de R$ $valor")
        }
    }
}

fun main(){
    val patrick = Conta(titular = "patrick", saldo = 0.0)

    patrick.depositar(100.0)
    patrick.sacar(50.0)
    patrick.sacar(52.0)
    println(patrick.saldo)
}