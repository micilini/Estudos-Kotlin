fun main() {
    //Introdução ao Set

    /*
    Set é um outro conjunto de elementos de listas em Kotlin, onde possui algumas particularidades com relação aos seus outros irmãos (ArrayOf, ListOf...):

    1) O Set é um conjunto de elementos que não segue uma sequência ordenada.
    2) O set não permite valores duplicados.

    No caso do Set, nós temos o SetOf que representa uma lista imutável de elementos, e temos também o MutableSetOf que representa uma lista mutável de elementos
    */

    //Vejamos abaixo, as declarações das listas do tipo SetOf e MutableSetOf:

    val set1 = setOf<Int>()//Criamos uma lista imutável de elementos do tipo Int vazia.

    val set2 = mutableSetOf<String>()//Criamos uma lista mutável de elementos do tipo String vazia.

    val set3: Set<Int> = setOf<Int>()//Mesma lógica acima, só que com declaração de tipos em uma lista imútavel.

    val set4: MutableSet<String> = mutableSetOf<String>()//Mesma lógica acima, só que fazendo uso da lista mutável.

    //Veja abaixo como instanciar uma lista de Sets com valores pré-definidos:

    val set5 = setOf<Any>(true, null, false, 24, 36, 16, 12, "Nome")//Exemplo de lista imutável que recebe qualquer tipo de valor.

    val set6 = mutableSetOf<Any>(14, 26, 8f, 9.87, "Lun")//Exemplo de lista mutável que recebe qualquer tipo de valor.

    //Observe abaixo o que acontece quando tentamos criar um elemento que já existe dentro da lista:

    val set7 = mutableSetOf<String>("William", "Roll", "Roll")//Você até pode adicionar valores repetido, mas...

    println(set7)//No final das contas ele não é adicionado rs

    //Como visto no código acima, o elemento repetido "Roll" não é adicionado a lista pela segunda vez.

    //Como adicionar elementos dentro de um Set?

    set7.add("Micilini")

    //Como remover elementos dentro de um Set?

    set7.remove("Roll")

    set7.clear()//Limpa toda a lista

    //É importante ressaltar que o Set não é uma lista ordenada, logo não possuí índices, nesse caso não conseguimos remover um elemento pelo seu índice.

    //Como verificar se o Set contém um determinado elemento?

    println(set7.contains("Roll"))

    //Como calcular o tamanho dos elementos em um Set?

    println(set7.size)//Retorna a quantidade de elementos

    //Como interagir com todos os elementos em um Set?

    for(item in set7){
        println(item)
    }

}