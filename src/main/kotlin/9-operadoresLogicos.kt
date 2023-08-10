fun main() {
    //Operador Lógico &&

    val a= true && true //True, pois verdadeiro com verdadeiro é verdadeiro

    val b= true && false //False, pois verdadeiro com falso é igual a falso

    val c = false && true //False, não importa a ordem, eles ainda serão falsos

    val d = false && false //False, pois o retorno final é falso

    //Operador Lógico ||

    val e = true || true //True, pois uma delas precisa ser verdadeiro para retornar verdadeiro

    val f = true || false //True, pois uma delas precisa ser verdadeiro para retornar verdadeiro

    val g = false || true //True, pois uma delas precisa ser verdadeiro para retornar verdadeiro

    val h = false || false //False, pois nenhuma delas é verdadeiro


    //Operador de Negação !

    val i = !true//Passa a ser false

    val j = !false//Passa a ser true

    //Existe uma ordem de prioridade:

    /*
    1- O compilador resolve os parêntesis
    2- Ele resolve a negação
    3- Ele resolve o && (conjunção)
    4- Ele resolve o || (disjunção)
     */

    //O Kotlin possuí um operador capaz de calcular o intervalo de valores (range):

    var n = 33

    val resultado = (n >= 1 && n <= 50)
    println(resultado)

    val alternativa = (n in 1..50)
    println(alternativa)


}