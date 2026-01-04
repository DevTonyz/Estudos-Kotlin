package controle_fluxo

fun main(){
    val name = "Dokaz"
    var life = 100

    println("Personagem $name possui $life pontos de vida.")

    println("$name recebeu um ataque forte!")
    var damage = 110
    life = life - damage
    println("dano sofrido -> $damage.")
    if (life > 0){
        println("O heroi sobreviveu!")
    } else {
        println("O heroi foi derrotado.")
    }
}