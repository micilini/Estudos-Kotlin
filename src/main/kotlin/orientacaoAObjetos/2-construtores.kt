class Condominio{//Classe não tem construtor atrelado

    //podemos existir diversos construtores na classe

    var apartamento: Int? = null//Podemos assumir um valor padrão ou deixar como nulo

    constructor(apartamento: Int){//Realizando o construtor normalmente
        this.apartamento = apartamento
    }

}

class CondominioDois(var apartamento: Int, var numeroQuartos: Int){

    //constructor(apartamento: Int, numeroQuartos: Int) : this(apartamento, numeroQuartos)//Esse construtor inicialmente vai dar erro, pois estamos definindo
    //um construtor secundário que atribui as mesmas variáveis que o anterior (feito nos parâmetros dessa classe), e isso gera um erro chamado de overload

    constructor(apartamento: Int, numeroQuartos: Int, documento: String) : this(apartamento, numeroQuartos)//Para seguir essa estrategia precisamos declarar
    //uma nova variável, como é o caso da variável chamada 'documento'

    /*

    Isso também é totalmente possível!

    var doc: String? = null

    constructor(apartamento: Int, numeroQuartos: Int, documento: String) : this(apartamento, numeroQuartos){
        this.doc = documento
    }

    */

}

class Log {//Exemplo de uma classe que possui 2 construtores

    constructor(data: String) {
        // algum código...
    }

    constructor(data: String, numberOfData: Int) {
        // algum código...
    }

}

class naoInstanciada private constructor()//Exemplo de classe que não pode ser instanciada: Ex: Erro ao fazer nao Instanciada()

class OutroExemplo private constructor(){
    //Este é um exemplo de classe que não queremos que o desenvolvedor instancie... no caso você só consegue ter acesso a ela por meio dos métodos/atributos ESTÁTICOS (Consulte: 12-static.kt)
}

class TesteConstrutores(var nome: String, val idade: Int){

    var nomeDaPessoa: String? = null

    constructor(nome: String, idade: Int, outroValor: String): this(nome, idade){
        this.nomeDaPessoa = nome
    }
}

class TesteConstrutoresDois{

    var nomeDaPessoa: String? = null

    constructor(nome: String){
        this.nomeDaPessoa = nome
        inicio()
    }

    fun inicio(){
        println("Fui instanciada, chegou a hora de realizar algumas operações iniciais...")
    }

}

fun main() {
    //Construtores
    var condominioMeu: Condominio = Condominio(11)
    println("Apt: ${condominioMeu.apartamento}")

    var condominioDois: CondominioDois = CondominioDois(11, 2, "1243fef")

    var testeUm: TesteConstrutores = TesteConstrutores("Micilini", 12)
    var testeDois: TesteConstrutores = TesteConstrutores("Micilini", 12, "OOP")

    var testeTres: TesteConstrutoresDois = TesteConstrutoresDois("Micilini Roll")
}