fun main(){
    //Introdução a Arrays

    /*
    Considerado o queridinho dentre muitas linguagens de programação, os arrays são indispensáveis em qualquer software que você vai desenvolver daqui para frente.

    Ele funciona como os objetos que vimos anteriormente, ou seja, uma variável especial que serve para armazenar múltiplos dados por vez.

    Supondo que você tem uma lista de nomes de carros escritas em um papel, ao mesmo tempo que deseja representar isso no Kotlin, você pode fazer isso por meio de Arrays da seguinte forma:
    */

    var listaDeCarros = arrayOf("BMW", "Auston Martin", "Ferrari", "Bugatti")//Usamos o arrayOf para criar uma lista de Arrays (O compilador reconhece como uma lista de STRINGS, pois só existem textos)

    /*
    No entanto, o que acontece se você quiser selecionar a variável que armazena o valor "Auston Martin"? Ou quem sabe verificar se o valor "lamborghini" se encontra presente no meio daquelas variáveis?
    */

    //Bem para selecionar qualquer valor do array, você pode fazer informando o índice daquele elemento. Lembrando que o primeiro índice sempre é 0

    println(listaDeCarros[0])//Mostra "BMW"
    println(listaDeCarros[1])//Mostra "Auston Martin"

    //O que acontece quando tentamos selecionar um índice que não existe no array?

    //println(listaDeCarros[12])//É retornado um erro alegando que o tamanho do índice que queremos selecionar não existe, pois o array só vai até o índice 4

    //Como calcular o tamanho total do array? (Retornar seus índices)

    println(listaDeCarros.size)//Para isso podemos usar o atributo size, que é capaz de retornar o tamanho total do array

    //Como verificar se um determinado elemento existe dentro do array?

    if ("Buggati" in listaDeCarros) {//Podemos usar o IF em conjunto com o comando 'in' que significa 'em', retorna true se achar, false se não achar
        println("Buggati está incluso na lista de carros...")
    } else {
        println("Buggati não está incluso na lista de carros...")
    }

    //É possível modificar um índice do array? Sim, observe:

    listaDeCarros[0] = "Tesla"
    println(listaDeCarros[0])//Retorna "Tesla" em vez de "BMW"

    //Como faço para adicionar mais valores dentro de um Array?

    listaDeCarros += "Lamborguini"//lembrando que nosso array precisa ser do tipo VAR
    println(listaDeCarros[4])

    //Como mostrar a lista de completa de elementos que existe em um array?

    println(listaDeCarros.contentToString())//Com o contentToString mostramos todos os elementos ali existentes separados por vírgula no console

    //Como percorrer todos os elementos do array, um por um? Neste caso podemos usar o for:

    for (carro in listaDeCarros) {
        println(carro)
    }

    //Dentro do for acima, nós podemos fazer IFs de modo a verificar se já percorremos algum elemento.

    //É possível ter um array com diversos tipos de dados? Sim, basta especificá-los:

    var minhaLista = arrayOf("Micilini", true, 12, false, 10f, 7.0, 'A', null)

    //Podemos usar todos os comandos que aprendemos anteriormente na sua lista.

    //Uma lista pode armazenar desde referências a classes, e funções.

    //No entanto, Para Arrays de tipos primitivos(int, double, short, ...), é recomendado que você use funções especiais, que seguem uma assinatura semelhante:

    val arrayDeInteiros = intArrayOf(1, 2, 3)//Usamos o intArrayOf para criar um array de inteiros, neste caso, ele não aceita outro tipo de dado que não seja inteiro

    val arrayDeDoubles = doubleArrayOf(1.0, 1.1, 1.2)//Mesma lógica do comando acima, a diferença é que só aceita inteiros

    var charArr = charArrayOf('a','b','c')//Mesma lógica dos comandos acima, a diferença é que só aceita char

    //Observe abaixo algumas formas de se declarar arrays vazios:

    var vazioUm = arrayOf<String>()//Aqui estamos criando um array de strings vazio

    var vazioDois = arrayOf("","","")//Aqui estamos criando um array com 3 índices vazios

    var vazioTres = Array<String?>(3) { null }//Aqui estamos criando um array de Strings, informando que ele terá 3 índices iniciais, onde cada um deles armazena o valor 'null'

    var vazioQuatro = arrayOfNulls<String>(3)//Mesma lógica de cima, só que sem especificar o valor existente, que por padrão será 'null', pois arrayOfNulls cria um array de nulos

    //É possível remover algum índice do array?

    //Não, pois no caso do arrayOf, assim que seus elementos são definidos, não conseguimos mais remover seus índices. O máximo que podemos fazer atribuir valores vazios ou nulos.

    //Para isso, possuímos outras especieis de arrays em Kotlin, que são os arrayList, Map, List, Set, onde veremos cada um deles mais tarde...

}