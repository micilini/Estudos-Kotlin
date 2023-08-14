package introducaoALinguagem

fun main() {
    //Null Safety:

    //var s: String = null//Não conseguimos atribuir nulo a variáveis não nulas

    var s: String? = null//Com o ponto de interrogação, podemos atribuir nulo a variável (seja ela de qualquer tipo)

    println(s?.length)//Quando usamos o ponto de interrogação, o compilador não gera uma exceção. Isso é o Kotlin fazendo o tratamento do nulo para nós
    println(s!!.length)//"Não trate, eu tenho certeza que a variável não é nula, e caso for, eu assumo o problema"
    println(s.length)//Se colocar de forma solta, o compilador não roda o projeto

    //Quando usamos o ? depois da varíavel, dizemos ao Kotlin para tratar o Null caso aja algum problema
    //Quando usamos o !! depois da variável, diz ao Kotlin que nós iremos assumir o erro

    var texto = readlnOrNull()//Aqui estamos tratando caso venha nulo

    if(texto == null || texto == ""){//Estamos verificando se o valor veio nullo
        println("Voce não digitou nada no console")
    }

    //Variável Let

    //Observe a seguinte estrutura abaixo que usamos para
    //verificar se a string é nula, e caso não for, executa o bloco do if

    val textor: String? = null

    if(textor != null){
        println(textor.lowercase())
        println(textor.length)
    }

    //Observe como let funciona

    textor?.let{
        //O corpo do let so é executado caso o textor for diferente de nulo
        //Aqui dentro é uma espécie de escopo de função
        //nesse caso a variável passa a se chamar de it
        println(it.lowercase())
        println(it.length)
    }//Podemos dizer que é basicamente um if/else disfarçado

}