//Exemplos de Declaração de Classes

class Produtos//Classe vazia, o Kotlin não reclama

class Pessoa{//Classe em Kotlin
//Classes sem a presença dos parêntesis, não possuem construtores, e você precisa declará-los!
}

//Exemplos de Declaração de Classes com Parâmetros

class Carro(val modelo: String, val ano: Int = 2023){//Um Parâmetro Opcional
//Os atributos da classe podem ser declarados dentro dos parêntesis, como visto acima (model e ano)

    //Podemos também definir atributos como os abaixo:
    var marca: String = ""
    var opcionais: Boolean = true

    //Abaixo podemos declarar nossos métodos

    fun ligar(){//método da função
        println("Ligando o Carro")
    }

    fun desligar(){//Método da função
        println("Desligando o Carro")
    }

    fun removeOpcionais(){
        this.opcionais = false//Usamos o this para fazer referência aos atributos da classe
    }

    fun mostraInformacoes() {
        println(message = "Seu Carro é um ${this.modelo}, da marca ${this.marca} (ano: ${this.ano}). Possuí opcionais? ${this.opcionais}")
    }

    fun recebeParametro(a: Int){//Exemplo de método da classe que recebe atributo
        println("O atributo é $a")
    }

    fun retornarFrase(): String{//Método que tem um tipo de retorno
        return "Este é um carro muito bonito!"
    }

}

fun main() {
    //Orientação a Objetos (Classes)

    var produtos: Produtos = Produtos()//Instanciando uma classe dentro da variável produtos
    var pessoa: Pessoa = Pessoa()//Instanciando uma classe dentro da variável pessoa

    var produtoZero = Produtos()//Outra forma de instanciar a classe sem declarar o tipo

    var meuCarro: Carro = Carro("BMW X9")//

    println(meuCarro.modelo)//Maneiras de acessar os atributos da classe
    println(meuCarro.ano)//Maneiras de acessar os atributos da classe

    var modeloCarro: String = meuCarro.modelo//Maneiro de salvar um atributo numa variável
    var anoCarro: Int = meuCarro.ano//Maneiro de salvar um atributo numa variável

    println(meuCarro.marca)//Chamando atributos que foram declarados de outra forma
    println(meuCarro.opcionais)//Chamando atributos que foram declarados de outra forma

    meuCarro.ligar()//Chamando um método
    meuCarro.desligar()//Chamando um método

    meuCarro.marca = "Audi"//Alterando um atributo na classe
    println(meuCarro.marca)//Mostra 'Audi' em vez de ''

    meuCarro.removeOpcionais()
    println(meuCarro.opcionais)//Mostra 'false' em vez de 'true'

    meuCarro.mostraInformacoes()

    meuCarro.recebeParametro(12)//Exemplo de envio de um atributo para um método

    //É possível instanciar uma classe e já executar um de seus métodos
    var meuCarroDois = Carro("Fiat Uno 109").mostraInformacoes()


}