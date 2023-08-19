fun main() {
    //Introdução a ListOf

    /*
    ListOf nada mais é do que um conjunto ordenado de elementos, que funciona de forma muito similar aos ArrayOf e ArrayList que vimos anteriormente em outros conteúdos.
    Ele funciona da seguinte forma, conforme você vai adicionando novos elementos para dentro da lista, você sempre os adiciona ao final daquela lista, conforme visto no ArrayList.
    É importante ressaltar que uma coleção em Kotlin, é um conjunto de elementos, que quando agrupados, formam aquilo que chamamos de coleção.
    E no caso do ListOf, nós não dispomos de uma funcionalidade capaz de alterar seus valores, sendo considerado uma lista estática.
    */

    //Vejamos alguns exemplos do ListOf:

    val list1 = listOf(1, 2, 3, 4, 5)//Exemplo de Coleção com números inteiros

    val listStrings = listOf("Micilini Roll", "Gabriel Solano", "Lucas Zenkys")//Exemplo de coleção com strings

    val list2 = listOf(false, 18, 98.0, "Micilini Roll")//Exemplo de coleção com tipos diferentes

    //Podemos criar uma lista definindo o padrão do tipo de dados que essa lista irá armazenar, observe:

    val list3 : List<Int> = listOf(1, 2, 3, 4, 5)//Lista definida que só recebe dados do tipo INT

    val list4: List<Any> = listOf(false, 18, 98.0, "Micilini Roll")//Lista definida que só recebe dados do tipo ANY (qualquer dado)

    //Se o listOf é um tipo de lista na qual não conseguimos alterar seus valores, e isso incluí adicionar ou remover seus índices, como fazemos então para que essas funcionalidades funcionem?

    //Bem, para isso, nós temos um outro tipo de ListOf, chamado de MutableList, que como o nome já diz, é uma lista mutável, ou seja, uma lista que permite alterações.

    //Vejamos abaixo, alguns exemplos do uso da MutableList:

    val list5: MutableList<Int> = mutableListOf(1, 8, 10, 22, 36, 48)//Aqui estamos definindo uma lista mutável que só permite números inteiros.

    val list6 = mutableListOf(1, 8, 10, 22, 36, 48)//Outro exemplo de declaração de lista mutável, declarada sem informar o seu tipo de dados.

    val list7: MutableList<Any> = mutableListOf(false, 18, 98.0, "Micilini Roll")//Outro exemplo de lista mutável, que permite qualquer dado (Any)

    //É importante ressaltar que as listas mais utilizadas no Kotlin, costumam ser as do tipo Mutable, pois elas permitem alterações.

    //Como selecionar as posições da listas?

    println(list1[0])//Pega o elemento no index 0 da lista

    println(list7[3])//Pega o elemento no index 3 da lista

    //Como calcular o tamanho dos itens existentes na lista?

    println(list7.size)

    //Como adicionar novos elementos na lista mutável?

    list7.add("Rikkity")
    list7.add(14)

    //Como remover elementos existentes na lista mutável?

    list7.remove(14)//Remove o elemento chamando 14
    list7.removeAt(0)//Remove o elemento que está no index 0
    list7.clear()//Limpa a lista

    //Como verificar se existe algum elemento na lista?

    println(list2.contains(7))//Verifica se existe dentro da lista o elemento 7

    //Como verificar se uma determinada lista está vazia?

    println(list7.isEmpty())//Verifica se a lista está vazia

    //Veja abaixo alguns exemplos de criação de listas vazias, do tipo imutável:

    val list8: List<Any> = listOf()//Lista imutável vazia, com declaração de tipos.

    val list9: List<Any> = emptyList()//Lista que começa vazia, com declaração de tipos.

    val list10 = listOf<Any>()//Lista imutável vazia, sem declaração de tipos.

    val list11 = emptyList<Any>()//Lista imutável vazia, sem declaração de tipos.

    //Mas espere! Porque criar uma lista imutável vazia, se ela não aceita ser alterada?

    /*
    A principal razão pela qual essa função existe é economizar alocações.
    Uma vez que emptyList retorna a mesma instância singleton toda vez que é chamada, pode-se usá-la de maneira livre de alocação.
    Observe que o mesmo objeto é retornado independentemente do tipo de elemento, ou seja, emptyList<String>() === emptyList<Int>() é verdadeiro.
    Um outro exemplo é quando você tem uma parte do seu código que você precisar retornar uma lista vazia, e não em outra:

    val minhasOpcoes: List<String> = when {
    x > 0 -> listOf(...)
    else -> emptyList()
    }
     */

    //Veja agora, outros exemplos de criação de listas vazias do tipo mutável:

    val list12: MutableList<Any> = mutableListOf()//Lista mutável vazia, com declaração dos tipos.

    val list13 = mutableListOf<Any>()//Lista mutável vazia, sem declaração dos tipos.

    //Nos exemplos acima estamos criando listas vazias de Any, mas podem ser Int, String, Float e afins

}