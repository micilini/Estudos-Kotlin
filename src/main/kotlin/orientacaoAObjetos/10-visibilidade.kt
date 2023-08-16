//Modificadores de Visibilidade

//No Kotlin, podemos alterar a visibilidade dos nossos atributos e métodos existentes em nossas classes.

/*
Assim como em outras linguagens de programação, existem 3 tipos de modificadores de visibilidade:

1) public: Que significa público, e são todos os atributos/métodos que podem ser acessados tanto de dentro quanto de fora da própria classe.
A declaração desses tipos de atributos/métodos, é feita quando usamos o comando public, ou quando não informamos nada, e declaramos nossos atributos/métodos normalmente.

*/

//Na classe abaixo estamos dizendo que o atributo 'meuAtributo' e o método 'meuMetodo' são do tipo público, e isso significa que eles podem ser acessados e alterados tanto de dentro como de fora da classe
class tudoPublico(){
    var meuAtributo: String = "Atributo 1"

    fun meuMetodo(){
        println("Método 1: " + this.meuAtributo)
    }
}

//Abaixo temos a segunda forma de definir um atributo/método público, que é informado o 'public' no começo dele. Apesar disso, o Kotlin não recomenda o uso do 'public', pois com ele ou sem ele, o atributo/método já é considerado do tipo público.
class tudoPublicoDois(){
    public var meuAtributo: String = "Atributo 1"

    public fun meuMetodo(){
        println("Método 1")
    }
}

/*
2) Private) Que significa privado, e são todos os atributos/métodos que só podem ser acessados de dentro da classe.
A declaração desses tipos de atributos/métodos, é feita quando usamos o comando private.
*/

class tudoPrivado(){
    private var meuAtributo: String = "Atributo 1"

    private fun meuMetodo(){
        println("Método 1: " + this.meuAtributo)
    }
}

/*
3) Protected) Que significa protegido, e são todos os atributos/métodos que só podem ser acessados de dentro da classe.
A declaração desses tipos de atributos/métodos, é feita quando usamos o comando protected.
*/

class tudoProtegido(){
    protected var meuAtributo: String = "Atributo 1"

    protected fun meuMetodo(){
        println("Método 1: " + this.meuAtributo)
    }
}

//Lembrando que podemos ter uma classe que usa os 3 tipos (public, private e protected) de atributos/métodos de forma simultânea, como iremos ver na classe paiUm() declarada logo abaixo.

/*
Qual a diferença dos comandos Private e Protected?
Inicialmente eles não possuem diferença nenhuma, pois cada um deles evita que nossos métodos e atributos sejam reconhecidos de fora da classe.

A diferença real acontece quando estamos trabalhando com o conceito de heranças.

Public) No caso quando uma classe FILHO herda os atributos/métodos do tipo 'public' da classe PAI, todos esses atributos/métodos poderão ser acessados de fora da classe FILHO.

Private) No caso quando uma classe FILHO herda os atributos/métodos do tipo 'private' da classe PAI, esses mesmos atributos não são herdados pela classe FILHO. Eles simplesmente não existem na classe FILHO.

Protected) No caso quando uma classe FILHO herda os atributos/métodos do tipo 'protected' da classe PAI, esses atributos são herdados pela classe filho, ao mesmo tempo que não podem ser acessados fora da classe FILHO.

 */

//Vejamos agora outros exemplos de heranças relacionadas com public, private e protected:

open class paiUm(){
    var corOlhos: String = "Azuis"
    var corPele: String = "Branca"

    fun sobrenomeDaFamilia(){
        println("...Van Der Line")
    }

    //Segundo a lógica do raciocínio, esses atributos/métodos abaixo, não fazem sentido
    //Serem herdados pelo filho!

    private var nomeEmpresa: String = "IBM"//Com o private, limita a classe somente

    private fun irTrabalhar(){//Mesma lógica do atributo acima
        println("Indo trabalhar na ${this.nomeEmpresa}")
    }

    protected fun consultarFortuna(){//Protected, é um pouco menos restritivo que o private
        //Ele dá acesso á classe e também as classes que herdam, ao mesmo tempo que não permite acesso direto (como o público)
        //OBS: protected também podem ser usados em atributos

        println("A fortuna é de mais de 10 milhões!")
    }
}

class FilholUm(): Pai(){//A classe FilholUm herda os atributos públicos e protegidos da classe paiUm
    var lancheiraCheia: Boolean = true

    fun irAEscola(){
        println("Indo a escola...")
    }
}

//Classes Privadas

//No Kotlin também temos o conceito das classes do tipo Privada, que fazem com que essas classes só sejam visiveis e acessadas pelas outras classes/funções/main que existem dentro desse arquivo (10-visibilidade.kt)

private class ClassePrivada(val nome: String){
    var cep: Int = 52658951

    fun mostrarMeuCep(){
        println("Meu CEP é: ${this.cep}")
    }

    public fun outroMetodo(){//Public é padrão, é redudante colocá-lo
        println("....")
    }
}

fun main() {
    //Modificadores de Visibilidade

    var filhote: Filho = Filho()

    //println(filhote.nomeEmpresa)//O filho não trabalha, portanto não tem nome da empresa
    //filhote.irTrabalhar()//O filho não consegue ir trabalhar, pois é privado da classe pai

    filhote.sobrenomeDaFamilia()//Método que pode ser acessado, pois é do tipo público

    println("Cor do Olhos: ${filhote.corOlhos}")//Atributo herdado público
    println("Cor da Pele: ${filhote.corPele}")//Atributo herdado público

    var classeP: ClassePrivada = ClassePrivada("Micilini Roll")
    println(classeP.cep)

    classeP.mostrarMeuCep()

    //Instanciar uma classe privada não seria possível em outros arquivos Kotlin.
    //Além disso, ela não consegue mais ser herdada, pois não existe um 'private open', e apesar de 'public open' funcionar, ainda assim continua redundante como usar o 'public'


}