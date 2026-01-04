package controle_fluxo

fun main(){
    var monsterLife = 50
    while (monsterLife > 0) {
        val damage = (5..20).random()
        monsterLife -= damage
        println("Golpe acertado! Vida do monstro: [$monsterLife]")
    }
    println("O monstro foi derrotado!")
}