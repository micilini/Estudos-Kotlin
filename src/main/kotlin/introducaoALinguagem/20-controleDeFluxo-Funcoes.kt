package introducaoALinguagem

fun main(){
    //Exemplo de funções com a estrutura IF/ELSE:

    //Podemos ter um retorno direto
    val resultado = retornoUm(true)

    println("Maior de Idade? ${maiorDeIdade(15)}")

    println(retornoDois(true))

    //Exemplo de funções com o controle de fluxo While:

    println(bonusWhen("Engenheiro de Software"))

    println(whenComRange(5))

    println(whenComBoolean(false))

}

//Funções com IF/ELSE:

fun maiorDeIdade(idade: Int): Boolean{
    if(idade > 18){
        return true
    }
    return false
    //Poderiamos ter retornado assim: return (idade > 18), pois o proprio retorno é um booleano
}

fun retornoUm(t: Boolean): String{
    return if(t){
        "Bom dia"
    }else{
        "Boa Noite"
    }//Esse return do IF só funciona se existir
}

fun retornoDois(t: Boolean) = if(t){
    "Bom dia"
}else{
    "Boa Noite"
}

//Funções com While:

fun bonusWhen(cargo: String): Float{
    return when(cargo){
        "Gerente" -> 2000f
        "Coordenador" -> 1500f
        "Engenheiro de Software" -> 1000f
        "Estagiário" -> 500f
        else -> 0f
    }//Exemplo de When com Retorno automático
}

fun whenComRange(n: Int): Unit{
    when(n){
        in 1..10 -> println("1...10")
        in 10..20 -> println("10...20")
    }
}

fun whenComBoolean(b: Boolean): Unit{
    when(b){
        true -> println("Verdadeiro")
        false -> println("Falso")
    }
}