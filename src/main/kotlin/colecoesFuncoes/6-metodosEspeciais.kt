fun main() {
    //Introdução aos Métodos Especiais em Coleção de Dados.

    /*
    Neste conteúdo você vai aprender a utilizar alguns métodos e atributos que o Kotlin nos disponibiliza para que possamos trabalhar mais facilmente com nossas coleções de dados.
    */

    //Para iniciar nossos estudos, vamos criar como base 3 variáveis, onde cada uma delas representa um tipo diferente de coleção de dados:

    val list1 : List<Int> = listOf(1, 2, 3, 4, 5)//Coleção de dados do tipo List.

    val set1: Set<String> = setOf<String>("João", "Victor", "Felipe", "William")//Coleção de dados do tipo Set.

    val map1 = mapOf<String, Int>(Pair("Micilini", 1), Pair("William", 2))//Coleção de dados do tipo Map.

    //Lembrando que no código acima, cada uma daquelas coleções poderiam ser do tipo Mutable, como mutableListOf, mutableSetOf e mutableMapOf.

    //Funções Any e Count

    //Em nossas coleções, nós temos acesso às funções Any e Count.

    //Any) Significa algum, e a sua missão é verificar se existe algum elemento dentro da coleção:

    println(listOf<Int>().any())//Retorna falso, pois temos uma lista vazia.

    println(list1.any())//Retorna true, pois a list1 possuí 5 elementos.

    println(set1.any())//Retorna true, pois o set1 possuí 4 elementos.

    println(map1.any())//Retorna true, pois o map1 possuí 2 elementos de chave-valor.

    //Count) Significa contar, e a sua missão é contar o número de elementos que existem em uma coleção:

    println(listOf<Int>().count())//Retorna 0, pois se trata de uma lista vazia.

    println(list1.count())//Retorna o números de elementos de list1.

    println(set1.count())//Retorna o número de elementos de set1.

    println(map1.count())//Retorna o número de elementos de map1.

    //Funções First e Last

    //First) Significa primeira, e a sua missão é recuperar o primeiro elemento existente em uma lista:

    println(list1.first())
    println(set1.first())

    //println(map1.first())//Não funciona com o Map, pois ele possui uma estrutura diferente.

    //Last) Significa último, e a sua missão é recuperar o último elemento existente em uma lista:

    println(list1.last())
    println(set1.last())

    //O único problema dos retornos vistos acima, é quando a nossa coleção se encontra vazia.
    //Para isso dispomos de um outro método que verifica se nossa coleção é nula, onde em caso positivo é retornado nulo, observe:

    println(list1.firstOrNull())//Recupera o primeiro elemento da lista se existir, se não retorna nulo
    println(list1.lastOrNull())//Recupera o último elemento da lista se existir, se não retorna nulo

    println(set1.firstOrNull())//Recupera o primeiro elemento da lista se existir, se não retorna nulo
    println(set1.lastOrNull())//Recupera o último elemento da lista se existir, se não retorna nulo

    //Funções Sum e SumOf:

    //Sum) Se todos os elementos presentes em uma coleção forem numéricos (Int, Float, Double) ele faz a soma de todos eles:

    println(list1.sum())//Faz a soma de todos os numéros da coleção (só funciona se for númerico, sejam eles INT, FLOAT ou DOUBLE)

    //SumOf) Significa soma de, e a sua missão é selecionar cada elemento da coleção de forma a fazer uma soma personalizada:

    println(list1.sumOf { it * 2 })//It representa o elemento em si, onde pegamos ele e multiplicamos por 2, o resultado será adicionado a soma total

    //Observe que no comando acima, ele contém um predicado, onde ele soma todos os números daquela lista depois de tê-los multiplicado por 2.

    //Função Filter

    //Com a função filter, nós criamos um predicado de modo a filtrar somente os valores que nós queremos:

    println( set1.filter { it.length > 5 } )//Neste comando estamos filtrando todos os nomes que possuem caracteres maiores que 5

    //É importante ressaltar que tanto as funções Any e Count, trabalham com predicados, observe:

    set1.any { it.length > 5 }//Any também trabalha com predicados, aqui estamos verificando se existe algum nome onde o total de caracteres é maior que 5

    list1.count{ it > 3 }//Count também trabalha com predicados, aqui estamos verificando se existe algum valor maior que 3, se existem ele começa a contagem a partir destes.

    //Funções Take e TakeLast

    //Take) Recupera a quantidade de elementos que você seleciona no começo da lista:

    list1.take(2)//Quantos elementos você seleciona no começo da lista? Neste caso estamos selecionando os 2 primeiros

    //TakeLast) Recupera a quantidade de elementos que você seleciona no final da lista:

    list1.takeLast(2)//Quantos elementos você seleciona no final da lista? Nesse caso estamos selecionando os 2 últimos.

    //Função ForEach

    //Assim como o For, podemos fazer o uso do método ForEach para interagir sobre cada um dos elementos presentes em nossa lista, vejamos:

    list1.forEach {
        println(it)//Passa item por item retornando o valor
    }

    set1.forEach {
        println(it)//Passa item por item retornando o valor
    }

    map1.forEach{
        println(it.key)//Recupera a chave
        println(it.value)//Recupera o valor
    }

    //Funções Max & Min

    //MaxOf) Retorna o número máximo existente na lista:

    listOf(1, 4, 9).maxOf { it }//Qual o número máximo da lista? Podemos usar predicados também.

    listOf(1, 4, 9).maxOrNull()//Qual o número máximo da lista? Se tiver vazio retorna nulo.

    //MinOf) Retorna o número mínimo existente na lista:

    listOf(1, 4, 9).minOf { it }//Qual o número minímo da lista? Podemos usar predicados também.

    listOf(1, 4, 9).minOrNull()//Qual o numero mínimo da lista? Se tiver vazio retorna nulo.

    //Temos também o MaxByOrNull e o MinByOrNull onde podemos trabalhar também com predicados:

    println(list1.maxByOrNull { it })
    println(list1.minByOrNull { it })

    //Funções Map

    //Essas funções tem por objetivo realizar um mapeamento em toda a sua coleção de modo a retornar uma nova lista a partir de algo.

    println(list1.map {it * it})//Cria uma nova lista retornando cada item existente em list1 multiplicado por si mesmo.

    //Tenha em mente que essas funções podem ser usadas em conjunto, observe:

    println(list1.map { it + 2 }.sum())//Cria uma lista onde cada item do 'list1' é somado com 2, para no final retornar a soma total

    //Função Avarage

    //Essa função retorna a média entre alguns números informados:

    println(listOf(1, 2).average())//Retorna a média

    //Função Distinct, Sorted & Reversed

    //Distinct) Retorna valores distintos, ou seja, retorna valores que se repetem uma única vez:

    println(listOf(1, 4, 5, 6, 3, 2, 8, 1, 1, 1, 1, 1, 3).distinct())
    println(listOf(1, 4, 5, 6, 3, 2, 8, 1, 1, 1, 1, 1, 3).distinctBy {it > 4})

    //Sorted) Por padrão retorna valores ordenados, do menor para o maior. Já o SortedDescending, retorna do maior para o menor:

    println(listOf(1, 4, 5, 6, 3, 2, 8, 1, 1, 1, 1, 1, 3).sorted())//Retorna valores ordenados, DO MENOR PARA O MAIOR
    println(listOf(1, 4, 5, 6, 3, 2, 8, 1, 1, 1, 1, 1, 3).sortedDescending())//Retorna valores ordenados, DO MAIOR PARA O MENOR

    //Reversed) Retorna uma nova lista com os valores em ordem reversa

    println(listOf(1, 4, 5, 6, 3, 2, 8, 1, 1, 1, 1, 1, 3).reversed())//Ordenação reversa da lista

}