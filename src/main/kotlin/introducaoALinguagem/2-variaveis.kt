package introducaoALinguagem

fun main() {
    //No Kotlin existem dois tipos de variáveis, aquelas que aceitam ter seus valores alterados, e aquelas que não aceitam.

    //Falando sobre as variáveis do tipo var, são aquelas que aceitam ter seus valores alterados posteriormente:

    var nome = "Micilini"//Criamos uma variável do tipo STRING.

    var sobrenome: String = "Roll"//Criamos uma variável do tipo STRING de forma explícita.

    nome = "Luttas"

    sobrenome = "nuggtr"

    //Observação: variáveis não podem ter o nome de palavras reservadas.

    print(nome)//Mostrando o conteúdo da variável

    //Falando sobre variáveis do tipo val, são variáveis que não podem ter seus tipos alterados

    val telefone = "123456789"

    //telefone = "99999999"//Isso aqui não funciona, pois não podemos altera-las.

    println(telefone)

}