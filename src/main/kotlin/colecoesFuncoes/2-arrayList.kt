fun main(){
    //Introdução ao ArrayList

    /*
    No Kotlin nós dispomos de uma classe chamada "ArrayList", que nos ajuda a criar um array de forma dinânima.
    Diferente do ArrayOf, o ArrayList, dispõe de métodos e atributos que nos ajudam a adicionar e remover índices.
    ArrayList pode conter duplicatas, ou seja, valores que se repetem, ao mesmo tempo que esse tipo de array não é sincronizado por natureza.
     */

    //Veja abaixo as 2 formas que temos para criar um ArrayList vazio

    var listaUm = ArrayList<String>()//Aqui criamos uma lista de array (vazia) que recebem o tipo String

    var listaDois = ArrayList<Any>(4)//Aqui criamos uma lista de array (vazia), com capacidade inicial de 4 índices, do tipo Any

    //Como adicionar elementos dentro do Array?

    listaDois.add("Olá Mundo")//Usamos o comando Add informando o valor que queremos atribuir
    listaDois.add(12)//Mesma lógica de cima

    listaDois.add(2, false)//Aqui estamos informando o índice que queremos adicionar determinado valor.

    listaDois.set(1, "Roll")//Mesma lógica do comando acima

    //No caso do método add com index, lembre-se que não conseguimos adicionar em um índice muito distante. Nesse caso podemos adicionar no índice 0, que ocuparia o lugar de "Olá Mundo", fazendo com que os index se reorganizem.
    //Ou seja, se colocassemos 'false' no índice 0, o valor "Olá Mundo" ocuparia o índice 1, e o 12 o índice 2 e assim por diante.

    //Como modificar um índice do array?

    listaDois[0] =  "Olá Micilini"

    //Como mostrar os valores existentes dentro do array?

    println(listaDois)

    //Como percorrer os valores dentro do array?

    for(i in listaDois){
        println("$i")
    }

    //Como retornar o tamanho da lista do array?

    println(listaDois.size)

    //Como remover elementos dentro do Array?

    listaDois.remove(12)//Busca e remove o elemento cujo valor é igual a 12

    listaDois.removeFirst()//Remove o primeiro elemento da lista
    listaDois.removeLast()//Remove o último elemento da lista
    listaDois.removeAt(0)//Remove o elemento da lista que se encontra no índice 0

    listaDois.clear()//Remove todos os elementos do array, ou seja, limpa ele











}