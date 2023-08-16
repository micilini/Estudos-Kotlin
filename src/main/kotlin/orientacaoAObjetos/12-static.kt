//Métodos e Atributos Estáticos

/*
No Kotlin, diferente de outras linguagens de programação, nós podemos ter métodos e atributos declarados de forma estática por meio do object ou com o uso do companion object.

E não, diferente de outras linguagens, aqui não conseguimos usar o termo 'static'.

Métodos/Atributos estáticos, pertencem a própria classe, e isso significa que eles podem ser acessados sem a necessidade de instanciar a classe, e isso significa que podemos fazer seu acesso direto.
 */

//Vejamos abaixo um exemplo de uma classe que possui atributos/métodos estáticos:

class MinhaClasseEstatica{

    //Aqui estamos declarando todos os nossos métodos e atributos estáticos por meio do companion object.
    //Pode ser um pouco estranho para você, isto é, caso esteja acostumado a usar o 'static' presente em outras linguagens
    companion object {
        val valor = 123456
        var nome = "Micilini"

        fun mostraMensagem(){
            println("Olá " + this.nome + ", Valor: " + this.valor)//Podemos acessar atributos estáticos

            sair()//Também podemos chamar métodos estáticos
        }

        fun sair(){
            println("Vou sair...")
        }
    }
}

//Tenha em mente que você pode ter uma classe que mescle métodos estáticos com métodos não estáticos, vejamos:

class MinhaClasseMesclada{
    var nome = "Roll"

    fun mostraMensagem(){
        println("Minha Mensagem")
        println(this.nome)
    }

    companion object{
        val valor = 456
        var nome = "Micilini Roll"

        fun mostraMensagem(){
            println("Minha Mensagem")
            println(this.nome)
        }
    }
}

//É importante ressaltar que métodos não estáticos, não conseguem chamar outros métodos/atributos não estáticos, e que o contrário também é válido.
//No exemplo da classe acima, podemos tanto instanciá-la de modo a acessar seus métodos/atributos públicos, como também não instanciá-la e acessar diretamente seus métodos/atributos estáticos.

/*

Tenha em mente que podemos nomear nosso companion object, de modo a organizar o nosso acesso, observe:

companion object ESTATICOS{
var nome = "Micilini Roll"
}

Com isso, poderiamos ter acesso a ele da seguinte forma:

println(ClasseEstatica.ESTATICOS.nome)

*/

//É importante ressaltar que podemos ter somente um ÚNICO compenion object declarado dentro da classe, ok?

/*

O uso do Object

Assim como o companion object, nós podemos fazer o uso somente do object para declarar nossos métodos estáticos existentes dentro da classe, observe:

*/

class MinhaClasseDeObjects{
    object objetoUm{
        val valor = 999
        var nome = "William Lima"
    }

    object objetoDois{
        val valor = 887
        var nome = "Gabriel Solano"
    }
}

//Observe que podemos ter diversos objects declarados dentro de uma mesma classe, e que cada um deles também pode possuir os mesmos nomes de atributos/métodos. Isso é permitido, uma vez que eles se encontram em escopos diferentes.
//Note que diferente do companion object, esses objects precisam ser nomeados, e seu acesso é bem parecido quando temos um companion object nomeado:

//println(ClasseEstatica.objetoUm.valor)
//println(ClasseEstatica.objetoUm.nome)
//println(ClasseEstatica.objetoDois.valor)
//println(ClasseEstatica.objetoDois.nome)

//Veja abaixo uma classe de exemplo que reune tudo o que nós aprendemos nesse conteúdo:

class ClasseEstatica{

    val sobrenome = "Roll"

    fun mostraMensagem(){
        println("Minha Mensagem")
        println(this.sobrenome)
        //this.testeDois()//Métodos não estáticos só consegue chamar outros métodos/atributos não estáticos
        //println(this.nome)//Métodos não estáticos só consegue chamar outros métodos/atributos não estáticos
    }

    companion object ESTATICOS{//Podemos nomear ou não, ('ESTATICOS') é opcional.
    //Diferente de outras linguagens de programação, que usamos 'static' para fazer uma referência a atributos e método estáticos
    val valor = 456
        var nome = "Micilini Roll"

        fun teste(){
            println("Realizando Teste")
            println(this.valor)
            println(this.nome)
            //println(this.sobrenome)//Métodos estáticos só consegue chamar outros métodos e atributos estáticos
            this.testeDois()//Métodos estáticos só conseguem chamar outros métodos estáticos
        }

        fun testeDois(){
            println("Teste dois...")
        }
    }

    //Lembre-se que só pode existir um único companion object dentro da classe.

    //Temos também o object sozinho, onde este precisa ter nomes únicos

    object objetoUm{
        val valor = 999
        var nome = "William Lima"
    }

    object objetoDois{
        val valor = 887
        var nome = "Gabriel Solano"
    }

}

fun main() {
    //Classes que possuem atributos/métodos estáticos ('companion object') podem ser chamamos sem a necessidade de instanciar a classe
    val valor = ClasseEstatica.valor
    val nome = ClasseEstatica.nome
    ClasseEstatica.teste()
    ClasseEstatica.testeDois()

    //Como o 'companion object' é nomeado, podemos chamá-lo dessa forma:
    val valorDois = ClasseEstatica.ESTATICOS.valor
    val nomeDois = ClasseEstatica.ESTATICOS.nome
    ClasseEstatica.ESTATICOS.teste()
    ClasseEstatica.ESTATICOS.testeDois()

    //Exemplo de uso dos object:
    println(ClasseEstatica.objetoUm.valor)
    println(ClasseEstatica.objetoUm.nome)
    println(ClasseEstatica.objetoDois.valor)
    println(ClasseEstatica.objetoDois.nome)

    //Caso queiramos chamar os métodos/atributos não estáticos, precisamos sim INSTANCIAR A CLASSE (essa é a única maneira)

    val classe: ClasseEstatica = ClasseEstatica()
    println(classe.sobrenome)
    classe.mostraMensagem()

}