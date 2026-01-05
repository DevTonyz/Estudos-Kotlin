package fundamentos

fun main(){
    // variavel que pode ser nula
    var bio: String? = null

    //se pode ser nulo, nao eh possivel medir o tamanho
    //println(bio.length)

    //tentativa segura, o ?. so executa o length se a bio nao for nulo
    println(bio?.length)

    //operador elvis ?. (o valor existe? se sim, use ele. senao, use esse valor padrao
    val tamanho = bio?.length ?: 0
    println("Tamanho da bio: $tamanho")

    bio = "Programador Kotlin"

    println(bio?.length ?: 0)
}