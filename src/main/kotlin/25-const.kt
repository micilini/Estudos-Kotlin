//Variáveis do tipo CONST, diferente de outras linguagens, que significa constante, aqui elas são consideradas TOP LEVEL DECLARATION.
//Podendo ser declaradas fora de qualquer escopo, como estamos vendo abaixo:

const val a = 10//O const precisa sempre ser inicializado! Não é possível atrelar funções ou classes para dentro do const

//Além disso const não pode ser usado dentro de funções, nem dentro de classes, e nem dentro de variáveis. Pois ele precisa ficar em um escopo maior.

//Para um const ser aceito dentro de uma classe, o mesmo precisa ser declarado dentro de um 'compenium object' ou um object, pois esses dois são escopos da classe, e não escopos de uma instância da classe.
//Resumindo: const nunca será escopo de uma instância!
//const pode ser de qualquer tipo de dado (Int, Float, Double, String e afina)

fun main() {
    println("Valor da Constante [a]: ${a}")
}