fun main() {
    //Antes de entendermos o conceito de DataClass, de uma olhada no seguinte exemplo abaixo:

    //Criamos duas variáveis que instanciam a classe Forma com os mesmos valores em seus atributos
    var f1: Forma = Forma(10,8)
    var f2: Forma = Forma(10, 8)

    //No Kotlin, toda classe conta com 3 métodos que são inseridos de forma automática pela linguagem, que nos ajudam a trabalhar melhor com elas.

    /*
    Esses 3 métodos são:

    1) Equals: Método usado para compararmos endereços de memória, ou seja, se uma classe é realmente igual a outra
    2) toString: Método usado para visualizar o que tem dentro da classe em formato de texto
    3) hashCode: Método usado para visualizar o hash de uma determinada classe
     */

    //Vamos começar pelo Equals, que retorna um valor booleano:

    println(f1.equals(f2))//Aqui é confirmado que a instância da classe armazenada na variável F1 é diferente daquela que está armazenada em F2.

    //Apesar de ser duas variáveis que armazenam a mesma instância da classe, por de baixo dos panos, elas apontam para endereços de memória diferentes.
    //E como vimos anteriormente o Equals compara endereços de memória.

    //Se quisermos que o Equals compare os valores que foram passados para dentro da classe, precisamos sobrescrevê-lo usando o override.

    //Agora vamos comparar os valores retornados pelos métodos toString e hashCode:

    println(f1.toString())//Visualizar o que tem dentro da classe em formato de texto
    println(f1.hashCode())//Visualiza o codigo de hash da classe

    println("------------------------")

    println(f2.toString())//Visualizar o que tem dentro da classe em formato de texto
    println(f2.hashCode())//Visualiza o codigo de hash da classe

    //Veja que esses métodos também retornam valores diferentes um do outro, isso porque estão em endereços de memória diferentes.


    //Agora vamos tentar resolver os problemas vistos acima por meio do DataClass:

    //O DataClass é um tipo de classe do Kotlin que é usada para transitarmos valores de uma classe a outra (ou quem sabe até para funções).
    //Durante a sua jornada de desenvolvedor Android, comumente você irá se deparar com códigos que fazem uso do DataClass

    //Aqui estamos instanciando duas classes do tipo DataClass passando o mesmo valor para cada uma delas
    var f3:FormaData = FormaData(10, 8)
    var f4:FormaData = FormaData(10, 8)

    //Vejamos agora como é o comportamento dos seus 3 métodos:

    println(f3.equals(f4))//Já retorna true e nem precisamos fazer o override

    println(f3.toString())//Visualizar o que tem dentro da classe em formato de texto
    println(f3.hashCode())//Visualiza o codigo de hash da classe

    println("------------------------")

    println(f4.toString())//Visualizar o que tem dentro da classe em formato de texto
    println(f4.hashCode())//Visualiza o codigo de hash da classe

    //Veja que no caso do DataClass os 3 métodos padrão retornam valores iguais quando usamos o equals, toString ou hashCode

    //Agora vejamos um exemplo real do uso de uma DataClass

    val endereco:EnderecoData = EnderecoData("Rua dos Anjos", "852369852", "Linus", "449")//Estamos instanciando uma classe do tipo Data de forma a atribuir alguns valores a ela.

    enderecoUsuario(endereco)//Por fim nós estamos passando o nosso DataClass para a função enderecoUsuario, que de lá ele já consegue exportar os valores que foram salvos no atributo da classe.
    //Observação: Novamente é importante ressaltar que você verá muitos códigos que usam DataClass.

    //Realizando Copias: No Kotlin quando temos uma classe do tipo DataClass, podemos usar o método copy() para copiar a instância da classe para uma outra variável

    f3 = f4.copy()//Isso é exclusivo das classes do tipo Data

    f1 = f2//Sem DataClass precisariamos fazer dessa forma


}

class Forma(val a: Int, val b: Int){
    override fun equals(other: Any?): Boolean {//Com o override ele retorna true, sem ele retorna false
        if (other is Forma) {
            if (other.a == this.a && other.b == this.b) {
                return true
            } else {
                return false
            }
        }
        return false
    }
}

data class FormaData(var a: Int, val b: Int){//Classes do tipo data precisam de declaração de var/val nos atributos dentro dos parêntesis
    //Classes do tipo data usam 'data' antes do 'class'.
    //Sabe o override equals que fizemos na classe acima? Então... o dataClass ele já faz aquilo automaticamente! Nesse caso o equals daqui retorna true caso os atributos fossem todos iguais nas duas instancias
}

//IMPORTANTE: Classes do tipo data, costumam ser usados para transitarmos valores de uma classe a outra (ou quem sabe até para funções), como por exemplo:

data class EnderecoData(val rua: String, val cep: String, val cidade: String, val complemento: String)

fun enderecoUsuario(e: EnderecoData) {//Veja que a função endereço recebe a classe que já pode ter seus atributos instanciados com seus respectivos valores:
    println("Endereço Completo: ${e.rua}, ${e.cep}, ${e.cidade}, ${e.complemento}")
}

