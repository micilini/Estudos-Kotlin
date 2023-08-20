fun main() {
    //Introdução ao Map

    /*
    Em conteúdos anteriores, nós vimos como criar nossas listas por meio de Arrays, Sets e Lists, mas em nenhum deles nós vimos uma estrutura capaz de salvar uma relação de chaves e valores, onde essas chaves poderiam ser strings personalizadas.
    Acredito que você acabou de receber um grande spoiler do assunto principal dos Maps.
    E sim, o map é uma coleção de chave e valor quando se trata de listagem de elementos em Kotlin.
    É importante ressaltar que se você criar uma chave que já existe, o Map só ficará com a mais recente.
    */

    //Assim como seus outros irmãos, temos o MapOf que representa uma lista imutável de elementos, e o MutableMapOf que representa uma lista mutável, ou seja, aceita modificações.

    //Vejamos abaixo, como é o processo de declaração de cada um deles:

    val map1 = mapOf<String, Int>()//Criamos um MapOf vazio, que só aceita chaves do tipo STRING e valores do tipo Inteiro.

    val map2 = mutableMapOf<String, String>()//Criamos um MutableMapOf vazio, que só aceita chaves do tipo String e valore do tipo String.

    //Veja agora, como fazemos para declarar uma estrutura de chave e valor usando o MapOf:

    val map3 = mapOf<String, Int>(Pair("Micilini", 1), Pair("Solano", 2))//Usamos o Pair para criar as chaves e valores

    //No código acima, observe que usamos a classe Pair para criar essa estrutura de modo que podemos selecionar o valor 1, informando o índice "Micilini".
    //E o valor 2, informando o índice "Solano".

    //Como visualizar os valores existentes em um Map?

    println(map3["Solano"])//Aqui você tem acesso a um conteúdo de uma chave específica
    println(map3)//Visualiza toda a cadeia de chave-valor

    //Como interagir com todos os elementos em um Map?

    for ((k, v) in map3) {//Aqui estamos fazendo um for, onde a variável k representa a chave, e a variável v representa o valor
        println("Chave: $k, Valor: $v")
    }

    //Como adicionar novos valores dentro de um Map?

    map2["Brasil"] = "Brasilia"//Adicionando novos valores dentro do map mutável

    //Quando voce cria uma chave que já foi setada, você acaba reescrevendo seu valor

    //Como imprimir todas as chaves de um map?

    println(map3.entries)//Imprime na tela todas as chaves

    //Como imprimir todos os valores de um map´?

    println(map3.values)//Imprime na tela todos os valores

    //Como remover uma chave do map?

    map2.remove("Brasil")//Remove pela chave

    //Como checar se o map possui uma chave?

    map2.contains("Brasil")//Se existe a chave buscada

    //Como Limpar todos os itens de um Map?

    map2.clear()//Limpa o map


}