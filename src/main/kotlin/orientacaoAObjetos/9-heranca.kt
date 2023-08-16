//Para que uma classe esteja habilitada para ser herdada, a mesma precisa estar declarada como 'open'.
//Isso significa que ela poderá ter seus métodos e atributos públicos herdados por outras classes

open class Pai(){//A classe precisa estar aberta 'open', para dizer que ela pode ser herdada

    //Todos os atributos aqui declarados serão herdados por uma classe do tipo FILHO

    var corOlhos: String = "Azuis"
    var corPele: String = "Branca"

    //Todos os métodos aqui declarados serão herdados por uma classe do tipo FILHO

    fun sobrenomeDaFamilia(){
        println("...Van Der Line")
    }

}

//Para que uma classe FILHO possa HERDAR os métodos e atributos da classe PAI, precisamos fazer a declaração abaixo:

class Filho(): Pai(){//A classe filho herda todos os atributos e métodos da classe pai
var lancheiraCheia: Boolean = true
    fun irAEscola(){
        println("Indo a escola...")
    }
}

fun main() {
    //Herança de Classes
    var filhote: Filho = Filho()

    //Observe que estamos utilizando métodos e atributos que não foram definidos dentro de filho
    filhote.sobrenomeDaFamilia()
    println("Cor do Olhos: ${filhote.corOlhos}")
    println("Cor da Pele: ${filhote.corPele}")

    //Além é claro, de ter seus proprios métodos
    filhote.irAEscola()
    println("Lancheira Cheia? ${filhote.lancheiraCheia}")

    //Obviamente que esses métodos e atributos (irAEscola() e lancheiraCheia) só existem na classe filho e não na classe pai.

    //É importante ressaltar que no Kotlin não existe herança múltipla! As classes só herdam de uma única classe PAI e não de múltiplas classes PAI

}

//Dica Importante: Quando você se deparar com códigos como o de baixo:

//Que se repetem, fique de alerta ligado. Ele deve ser extremamente evitado!
//O primeiro problema é que se você precisar mudar uma das lógicas, a alteração será feita em 2 lugares diferentes
//E segundo... duplicar código é problema, e significa escrita em dobro!

class Computador(var marca: String){
    fun ligar(){}
    fun desligar(){}
}

class Eletronico(var marca: String){
    fun ligar(){}
    fun desligar(){}
}

