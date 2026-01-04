package fundamentos

fun main(){
    val inventory = mutableListOf("pao velho")
    var cont = 1
    println("O heroi achou uma Espada de diamante!")
    inventory.add("Espada de Diamante")
    println("O heroi achou uma Pocao de Vida!\n")
    inventory.add("Pocao de Vida")
    println(inventory)
    println("\nO heroi bebeu a pocao.")
    inventory.remove("Pocao de Vida")

    println("\n-- ITENS NO INVENTARIO --")
    for (item in inventory){
        println("$cont: $item")
        cont++
    }
}