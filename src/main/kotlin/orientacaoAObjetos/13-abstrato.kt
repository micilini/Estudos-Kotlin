//Classes Abstratas

//No Kotlin, também podemos fazer o uso do conceito de abstração de classes.

//Classes abstratas funcionam como 'plantas' de uma construção, que são feitas para nos basearmos em como iremos criar um prédio ou uma casa em cima.

//Observe abaixo uma classe Abstrata chamada Mamifero

abstract class Mamifero(val nome: String){

    abstract fun falar()//Aqui criamos um método abstrato que só existe na planta, mas que deve ser implementada para que herdará essa classe

    //Abixo podemos declarar nossos atributos e métodos dessa classe

    var idade: Int = 40

    fun acordar(){
        println("Acordando...")
    }

}

//Com a classe abstrata criada, chegou o momento de criarmos uma herança, e para isso criamos uma classe chamada Cachorro, observe:

class Cachorro(nome: String): Mamifero(nome){
    /*
    Quando herdamos algo de uma classe abstrata, precisamos implementar todos os seus métodos e atributos abstratos.

    Tudo o que vem sem o 'abstract' é opcional de ser implementado pelas classes FILHOS.

    Pois se você for parar para pensar: "Ora... como você vai montar um apartamento sem uma planta?".

    A classe abstrata é definida como se fosse um molde!
     */

    override fun falar() {//É importante ressaltar que quando temos uma classe PAI do tipo abstrata, com um método do tipo abstrato, sua implementação é obrigatória nas classes FILHOS.
        println("Au Au");
    }

}

fun main() {
    //Classes Abstratas
    //Classes abastratas não possuem um OPEN pois não foram criadas para nascer.
    //Não foram criadas para serem instanciadas

    val cachorro = Cachorro("Lucas")
    cachorro.falar()

    //Veja como temos acessos aos atributos e métodos herdados da própria classe abstrata
    cachorro.acordar()
    println(cachorro.idade)
}