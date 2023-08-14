package introducaoALinguagem

fun main() {
    //Excesões (Try Catch)

    //Exemplo de código que vai dar erro ao ser executado
    val s: String? = null
    println(s!!.length)

    //Forma de usar o Try Catch

    try{//Tenta executar o comando sem erros, se der erros o catch é executado
        println(s!!.length)//Isso vai dar erro e vai executar o bloco do catch
    }catch (e: NullPointerException){//Variável temporaria que captura exceções do tipo NullPointer
        println("Variável Nula")
    }

    println("Fim.")//O compilador ainda executará esta linha, isso é uma prova que mesmo após o erro, o sistema continua funcionando

    //Podemos ter mais um tipo de catch declarado no Try, mas somente um único try
    //Podemos ter varios tipos de exceções: https://kotlinlang.org/docs/exceptions.html

    try{
        val a = 10/0
    }catch(e: NullPointerException){
        println("Variável Nula")
    }catch(e: ArithmeticException){
        println("Impossível dividir por zero...")
    }

    //Existe uma palavra chamada 'Finally' que pode ser usado com try catch, ele é executado sempre (independente se der erro ou não)

    try{
        val a = 10/0
    }catch(e: Exception){
        println("Exceção Genérica que contém todos os tipos")
    }catch(e: NullPointerException){
        println("Variável Nula")
    }catch(e: ArithmeticException){
        println("Impossível dividir por zero...")
    }finally {
        println("Final dos blocos Try...Catch")
    }

    //Tenha em mente que na expressão acima, os erros de 'NullPointerException' e 'ArithmeticException' nunca irão ser executados, mesmo que o tipo de exceção seja esta.
    //Isso acontece, pois temos acima desses dois, o erro de 'Exception' que é a forma mais generica, e assim, o Kotlin executa ele, ignorando os demais.
    //O que poderíamos fazer é trocar a ordem:

    try{
        val a = 10/0
    }catch(e: NullPointerException){
        println("Variável Nula")
    }catch(e: ArithmeticException) {
        println("Impossível dividir por zero...")
    }catch(e: Exception){
        println("Exceção Genérica que contém todos os tipos")
    }finally {
        println("Final dos blocos Try...Catch")
    }


}