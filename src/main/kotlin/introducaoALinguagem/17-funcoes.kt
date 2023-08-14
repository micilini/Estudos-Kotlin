package introducaoALinguagem

fun main() {
    //Funções Normais:
    olaMundo()//Modo de chamar a função, pode ser chamado quantas vezes quiser
    olaMundoUnit()//Mesma lógica do de cima

    val retorno = olaMundoRetorno()//Como essa função retorna algo, estamos salvando numa variável, mas poderiamos imprimir direto no println

    println(retorno)//Mostra o retorno

    println(olaMundoRetorno())//Mostrando o retorno diretamente

    println(mensagem("Micilini"))//Chamando uma função com 1 parâmetro

    println(soma(10, 2))//Chamando uma função com dois parâmetros

    //Uma função pode ter mais de dois parâmetros
    println("A soma de 10 e 2 é: ${soma(10, 2)}")//Uso da interpolação

    //Funções em uma única linha:
    println(somaDois(12, 9))
    println(somaTres(15, 14))
    helloWorld()

    //Println e Print também são funções!
    println("")//Função padrão do Kotlin que printa no console (com quebra de linha)
    print("")//Mesma lógica anterior (sem quebra de linha)

    //Exemplo de Funções com Parâmetros personalizados

    endereco(estado = "Rio de Janeiro", rua = "Brazilis", cidade = "Rio de Janeiro")//Aqui estamos passando os parâmetros de forma desordenada.
    //É importante ressaltar que a função acima só trocar a ordem da declaração dos parâmetros, mas não influencia em nada na função.
    //Se em um parâmetro voce teve que informar o nome, você precisa informar todos até o fim!

    media(1f, 2f, 3f, 4f, 5.98f);//Exemplo de multiplos parâmetros com vararg
}

fun olaMundo(){//Função simples que não recebe parâmetros nem retorno
    println("Olá Mundo!")//Dentro da função podemos ter diversos comandos
}

fun olaMundoUnit(): Unit{//Significa que essa função não tem retorno, deixa isso de forma explícita (opcional usar Unit quando não tem retorno)
    println("Olá Mundo!")
}

fun olaMundoRetorno(): String{//Função que retorna uma string
    return "Olá Mundo"//usamos o return para retornar
}

fun mensagem(nome: String): String{//Função com parâmetro e retorno de string
    return "Olá $nome"
}

fun soma(a: Int, b: Int): Int{//Função com mais de um parâmetro que faz a soma
    return (a + b)
}

fun somaDois(a: Int, b: Int): Int = (a + b)//Tipo de função que tem apenas um único comando

fun somaTres(a: Int, b: Int) = (a + b)//Tipo de função que tem apenas um único comando, dessa vez sem o INT (pois o JVM se vira para identificar o retorno)

fun helloWorld() = println("Hello, world!")//Função que não tem retorno, mas é única linha

//Podemos ter mais de uma única variação da mesma função:

fun subtrair(){}

fun subtrair(a: Int){}

fun subtrair(a: Int, b: Int){}

//Funções com Parâmetros Opcionais:

fun minhaFuncao(rua: String, cep: Int = 99999999){
    //Você chamaria essa função assim: minhaFuncao("Rua Bellas Artes"), e poderiamos usar o cep com o valor padrão.
    //Caso desejar, você poderia passar o cep também: minhaFuncao("Rua Bellas Artes", 21521478)
}

fun endereco(rua: String, cidade: String, estado: String){

}

//Recebendo múltiplos parâmetros dentro de uma única variável:

fun media(vararg notas: Float){
    var soma = 0f
    var tamanho = notas.size//Size é o tamanho das variáveis que vieram
    for(n in notas){
        soma +=n
    }
    println(soma/tamanho)//Resultado da média
}

//Tenha em mente que quando o VARARG existe nos seus parâmetros ele deve ser ÚNICO, ou seja, deve existir ele e somente ele como parâmetro, ok?

