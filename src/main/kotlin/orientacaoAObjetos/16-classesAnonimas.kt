//Classes Anônimas

//No Kotlin conseguimos criar e utilizar classes anônimas, que nada mais são do que classes definidas dentro de um escopo.
//Podendo ser este escopo uma variável, onde o nome da variável assume o nome da classe.
//Ou quem sabe fazer isso diretamente dentro de um parâmetro de uma função, ou método.

//Para iniciar nossos exemplos, vamos considerar esta pequena Interface e uma classe que possui um método que recebe uma classe herdada daquela interface:

interface Evento{
    fun emSucesso()
}

class Programa{
    fun salvar(e: Evento){
        println("Abrindo Conversa.")
        println("Salvando Valores.")
        e.emSucesso()
    }
}

fun main() {
    //Aqui nós estamos instanciando a classe Programa normalmente:
    val p = Programa()

    //O conceito de classes anônimas, acontece justamente aqui, quando utilizamos o object herdado da Interface 'Evento', onde declaramos alguns métodos daquela classe
    p.salvar(object : Evento{//O pulo do gato da classe anonima está nessa lógica.
    override fun emSucesso(){
        println("Tudo certoooo!")
    }
    })

    //De modo que dentro do método 'Salvar' existente na classe 'Programa', ele consiga recuperar essa classe anônima de modo a chamar o método 'emSucesso'.

    //veja o conceito principal de uma classe anônima sendo definida dentro de uma variável:
    val classeAnonima = object{
        val nome = "Micilini Roll"
        val seguro = true
        fun falar(){
            println("Olá mundo, sou o " + this.nome)
        }
    }

    println(classeAnonima.nome)
    classeAnonima.falar()

}

