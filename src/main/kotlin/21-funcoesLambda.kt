fun main() {
    //Funções Lambda, são consideradas funções anônimas que podem ser passadas por parâmetro.
    //De modo que podemos chamá-la dentro de uma outra função. Isso significa que podemos passar uma regra por parâmetro.

    val a = {}//Essa declaração basta para ser considerado um lambda
    a()//Executo a, pois o nome da função vira o nome da própria variável

    //Exemplo de função Lambda com somente um parâmetro
    val b = { println("Olá") }

    b()//Executo b, pois o nome da função vira o nome da variável

    //Exemplo de função Lambda com mais de um parâmetro
    val c = {
        println("Mundo!")
        val s = 1 + 5
        s
    }

    c()//Executo C, pois o nome da função vira o nome da varável

    //Exemplo de Lambda com 1 parâmetro
    val d = { x: Int -> x*x }//Recebe um parâmetro do tipo int que multiplica o valor por ele mesmo
    var resultadoD = d(20)//Resultado de 40

    //Exemplo de Lambda com mais de 1 parâmetro
    val e = { x: Int, y: Int ->
        println("Executando...")
        x * y//A última linha do lambda é responsável por fazer o retorno
    }
    var resultadoE = e(2, 5)//Retorna o resultado

    //Exemplo de envio de parâmetro para dentro de uma função
    receberA(b, 12)

    receberE(e, "Micilini")

    //Existe também a possibilidade de passar um lambda sem a necessidade de atribuir a uma variável
    receberA({
        println("Olá mundo...")
    }, 12)

    //Quando temos um único parâmetro o Kotlin diz que não precisamos dos parêntesis:
    receberADeNovo {
        println("Olá mundo do Roll...")
    }

    receberADeNovo { println("Olá mundo do Roll...") }

}

fun receberA(lambda: () -> Unit, a: Int){//É dessa forma que recebemos uma função por parâmetro
    lambda()
    println(a)
}

fun receberE(minhaFuncao: (x: Int, y: Int) -> Int, a: String ){//Quando a função tem parâmetros
    var inteiro: Int = minhaFuncao(12, 8)
    println("Outra execução: ${inteiro}")
}

fun receberADeNovo(lambda: () -> Unit){
    lambda()
}

