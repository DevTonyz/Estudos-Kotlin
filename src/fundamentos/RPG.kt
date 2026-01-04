package fundamentos

fun main(){
    val name = "Dokaz"
    var level = 1
    var gold = 100.50

    println("O personagem $name esta no nivel $level e possui $gold de ouro.")

    println("O personagem acabou de derrotar um monstro!")
    level = 2
    gold = 150.00
    println("atualizacao de status!\nnivel = $level\nouro = $gold")

    println("O personagem $name esta no nivel $level e possui $gold de ouro.")
}