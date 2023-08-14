package introducaoALinguagem

fun main() {
    //Operador Elvis

    var str: String? = null

    if(str == null){
        println("Valor é nulo!")
    }else{
        println(str)
    }

    //O operador Elvis nós permite imprimir uma variável baseado em alguma condição personalizada que você criar.
    println(str ?: "nulo")//Pode ser uma variável ou função que retorne nulo, se for nulo, ele mostra a mensagem "nulo"

    //IMPORTANTE: Elvis não é um operador ternario. Até porque o kotlin atualmente não tem esse tipo de operador

    val idade = 18
    val str2 = if (idade >= 18) "Maior que 18" else "Menor que 18"//Esse comando faz exatemente a ideia do ternario
    println(str2)
}