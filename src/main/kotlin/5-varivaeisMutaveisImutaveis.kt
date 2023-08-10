fun main() {
    //Variáveis Mutáveis:
    var nome = "Micilini"//variaveis do tipo var são mutáveis
    nome = "Roll"//Ou seja, elas podem ser modificadas

    //var nome = "Lucas"//Esse código dá problema, pois não podemos reatribuir usando o var novamente...

    //nome = 2050 como a variável foi declarada como tipo STRING, não podemos alterar seu tipo

    //Variáveis Imutáveis:
    val idade = 25//Funciona como constantes, ou seja, variáveis que não mudam
    //idade = 99//Não podemos alterar a variável do tipo val

    //Val é uma boa prática, e a própria linguagem recomenda a sua utilização, principalmente quando ela nunca é modificada
}