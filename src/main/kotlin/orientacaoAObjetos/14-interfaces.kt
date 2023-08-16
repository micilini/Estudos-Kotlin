//Interfaces
//Podemos pensar em Interfaces, como uma espécie de contrato, onde aquele que o assina, precisa cumprir com as regras estabelecidas dentro dele.

//Transferindo essa ideia para o âmbito da programação, uma interface é como se fosse uma classe abstrata, que foi feita para ser herdada, ou seja, não podemos instanciar.

//Observe uma Interface chamada Selvagem que foi declara abaixo:

interface Selvagem{

    //Quando declaramos um método que possui um corpo (bloco de chaves), não precisamos implementar futuramente em outra classe que herda nossa Interface
    fun atacar(){
        println("Atacando!")
    }

    //val teste = ""//É importante ressaltar que inicializadores não são permitidos em interfaces

    var teste: String//Nesse caso, nossos atributos precisam declarados em uma inicialização

    fun dormir()//Já quando declaramos um método sem corpo (bloco de chaves), somos obrigados a implementar com override na classe que herda essa interface
}

//Observe abaixo uma classe chamada Gato que herda da Interface Selvagem

class Gato(): Selvagem{
    override var teste: String = "Wilson"//Como dito anteriormente, precisamos de um override neste atributo

    override fun dormir(){//Mesma lógica dita acima
        println("Preciso dormir...")
    }

    //O método abaixo é da propria classe Gato
    fun acordar(){
        println("Acordando...")
    }

}

//Note que em conteúdos anteriores, você viu que não é possível que uma classe FILHO herde de múltiplas classes PAI, você se lembra disso?

//Mas em compensação, o Kotlin permite que herdamos de múltiplas Interfaces, observe:

interface inter1
interface inter2

class multi: inter1, inter2//Exemplo de classe que herda de múltiplas interfaces

fun main() {
    println("Consulte o arquivo para entender...")
}


