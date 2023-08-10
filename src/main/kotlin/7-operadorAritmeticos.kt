fun main() {
    //Operadores aritméticos: São aqueles que usamos para realizar operações matemáticas (adição, subtração, divisão, multiplicação, resto da divisão)

    var idade = 30//Considerando que temos uma variável que armazena a idade de uma pessoa

    //Exemplos de operadores aritméticos

    idade = idade + 1//Operação da Soma (+)

    idade = idade - 5;//Operação de Subtração (-)

    idade = idade * 3//Operação de Multiplicação (*)

    idade = idade / 2//Operação de Divisão (/)

    idade = idade % 2//Operação de Resto da Divisão (%)

    //Exemplos resumidos de se realizar operações Aritméticas:

    idade += 5//Soma resumida

    idade -= 2//Subtração Resumida

    idade *= 3//Multiplicacao Resumida

    idade /= 3//Divisão Resumida

    idade %= 2//Resto da Divisão Resumido

    //Exemplo de Incrementação e Decrementação:

    idade++//Incrementa + 1 a variável idade
    idade--//Decrementação - 1 a variável idade

    ++idade//O compilador primeiro incrementa o valor de idade e depois ele o usa
    --idade//O compilador primeiro incrementa o valor de idade e depois ele o usa

    //Exemplo das diferenças entre o operador vir na frente ou atrás

    var numero = 1
    println(numero++)//Primeiro ele mostra 1 e depois incrementa ficando com 2, mas só mostra 1 no console

    print(++numero)//Aqui ele já mostra o valor incrementado, pois o ++ veio primeiro

    //No Kotlin temos outras formas de se escrever estes operadores:

    var a = 20
    var b = 4
    println("a + b = " + (a.plus(b)))
    println("a - b = " + (a.minus(b)))
    println("a * b = " + (a.times(b)))
    println("a / b = " + (a.div(b)))
    println("a % b = " + (a.rem(b)))
}