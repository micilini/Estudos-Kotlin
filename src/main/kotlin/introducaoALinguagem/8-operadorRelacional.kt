package introducaoALinguagem

fun main() {
    //Operadores Relacionais:

    val um = 5 > 10//Maior que
    val dois = 10 < 98//Menor que
    val tres = 50 >= 30//Maior ou igual a
    val quatro = 44 <= 10//Menor ou igual a
    val cinco = 44 === 44//Totalmente igual a (igual e do mesmo tipo)
    val seis = 44 != 6//Diferente de
    val sete = 1 == 1//Igual a
    val oito = 1 !== 5//Não Igual e não do mesmo valor

    //Cada um dos operadores retornam TRUE ou FALSE.

    //Existem outras formas de se escrever esses operadores:
    val a = 10
    val b = 20
    println("c > d = " + (a.compareTo(b) > 0))
    println("c < d = " + (a.compareTo(b) < 0))
    println("c >= d = " + (a.compareTo(b) >= 0))
    println("c <= d = " + (a.compareTo(b) <= 0))
    println("c == d = " + (a?.equals(b) ?: (b === null)))

    //Invertendo a condição
    println(!true)//Retorna False
    println(!false)//Retorna True
    println(!(1 < 5))//1 é menor que 5 e retorna true, mas a negação torna true para false

}