package controle_fluxo

fun main(){
    var monsterLife = 50
    var playerDamage = 10

    while (monsterLife > 0) {
        monsterLife -= playerDamage
        println("Golpe acertado! Vida do monstro: [$monsterLife]")
    }
    println("O monstro foi derrotado!")
}