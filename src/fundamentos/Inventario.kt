package fundamentos

fun main(){
    val inventory = mutableListOf("pao velho")
    println("O heroi achou uma Espada de diamante!")
    inventory.add("Espada de Diamante")
    println("O heroi achou uma Pocao de Vida!\n")
    inventory.add("Pocao de Vida\n")
    println(inventory)
    println("\nO heroi bebeu a pocao.")
    inventory.remove("Pocao de Vida\n")
    println(inventory)
}