package introducaoALinguagem

fun main() {
    //Leitura de Dados:
    println("Digite seu Nome:")
    var nome = readLine()//Espera o usuário digitar no console e salva na variável
    println("Olá $nome")

    //O console nos recomenda usar o comando abaixo pois o usuário pode pressionar [ENTER] sem informar nada
    var sobrenome = readlnOrNull()
    println("Olá $nome $sobrenome")

    //Convertendo os tipos de dados:

    nome = "Micilini"

    //(Os códigos abaixo podem gerar um erro...)

    val um = nome.toInt()//Converte para inteiro
    val dois = nome.toFloat()//Converte para Float
    val tres = nome.toBoolean()//Converte para booleano
    val quatro = nome.toString()//Converte para o tipo string
}