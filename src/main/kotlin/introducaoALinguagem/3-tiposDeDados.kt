package introducaoALinguagem/*
    Type    Bit
    Double  64
    Float   32
    Long    64
    Int     32
    Short   16
    Byte     8
    Boolean  ?
    String   ?
    Char     ?
*/

fun main() {
    var charVariavel: Char = 'a'//Char é aspas simples e deve armazenar um único caracter
    var stringVariavel: String = "uashdiuash aiushdiuahsd iuahsdiuhasd"//O tamanho é alocado diretamente pelo compilador JVM
    var booleanVariavel: Boolean = true//Só aceita dois valores, true ou false

    var doubleVariavel: Double = 10.0//Não podemos passar valores inteiros, somente números quebrados
    var floarVariavel: Float = 10.0f//Precisamos colocar o f para dizer que é float
    var longVariavel: Long = 10L//Precisamos informar o L, e aqui é inteiro
    var intVariavel: Int = 10//Tipo inteiro
    var shortVariavel: Short = 10//Tipo Short
    var byteVariavel: Byte = 10//Tipo Byte

    //Exemplos de variáveis

    var idade = 29//Quando não colocamos um tipo específico, o kotlin faz esse trabalho por de baixo dos panos

    //Podemos declarar variáveis não instanciadas
    var nome: String//Mas só conseguimos fazer isso especificando um tipo. (Ou você define um tipo ou atribui um valor a ela)

    //Exemplos de como imprimir variáveis com o console

    var meuNome = "Micilini Roll"

    println("Olá, meu nome é: " + meuNome)//Por meio da concatenação

    println("Olá, meu nome é: $meuNome")//Por meio do sifrão

    println("Olá, meu nome é: ${meuNome}")//Por meio do sifrão com chaves (usado geralmente quando temos mais de uma intenção)

    //Abaixo temos algumas funções do tipos de dados que mostram seus valores máximos e mínimos

    println("Double Max ${Double.MAX_VALUE} - MIN ${Double.MIN_VALUE}")
    println("Float Max ${Float.MAX_VALUE} - MIN ${Float.MIN_VALUE}")
    println("Long Max ${Long.MAX_VALUE} - MIN ${Long.MIN_VALUE}")
    println("Int Max ${Int.MAX_VALUE} - MIN ${Int.MIN_VALUE}")
    println("Short Max ${Short.MAX_VALUE} - MIN ${Short.MIN_VALUE}")
    println("Byte Max ${Byte.MAX_VALUE} - MIN ${Byte.MIN_VALUE}")

}