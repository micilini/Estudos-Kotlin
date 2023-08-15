class Receita{
    //Existirão momentos em que precisamos inicializar algum atributo de maneira tardia, ou seja, por meio de outros métodos existentes na própria classe.

    //A declaração abaixo, cria uma variável do tipo STRING, que possui uma inicialização tárdia (lateinit), de modo a dizer a classe que inicializaremos ela mais tarde.

    lateinit var instrucoes: String//É como se você falasse: "Olha Kotlin, essa variável será inicializada posteriormente...", e esse posteriormente depende exclusivamente do seu código!

    //lateinit precisa ser do tipo VAR, pois VAL não conseguimos atribuir um valor posterior, pois como vimos, ele não pode ter seu valor alterado.

    fun geraReceita(){//Dentro da função geraReceita, nós estamos inincializando a variável instrucoes com um texto do tipo STRING:
        this.instrucoes = "Pegue 2 ovos, coloque numa bandeja, adicione sal e tome puro!"
    }

    fun imprimeReceita(){
        //Segundo a lógica do nosso código, para imprimir uma receita, precisamos gerar primeiro, certo?
        //Sabendo disso, não conseguiremos acessar a variável instrucoes sem antes iniciar ela. Pois caso façamos isso, o compilador gerará um erro.

        //Sendo assim, será que existe como verificar se uma variável do tipo lateinit já foi inicializada?
        //Sim, vejamos:

        if(this::instrucoes.isInitialized){//Usamos o atributo chamado 'isInitialized' para verificar se a variável instrucoes já foi inicializada ou não. (Retorna Booleano)
            println(this.instrucoes)//Caso sim, ele imprime a receita
        }

        println("Você precisa gerar a receita primeiro")//Caso não, alegamos que é necessário chamar o método geraReceita
    }
}

fun main() {
    //LateInit (Inicialização Tárdia)

    var r: Receita = Receita()//Aqui estamos instanciando a classe Receita

    //println(r.instrucoes)//nesse momento teremos um problema, pois estamos tentando acessar de forma direta, um atributo que ainda não foi inicializado

    r.imprimeReceita()//mostra 'Você precisa gerar a receita primeiro'

    r.geraReceita()//Aqui estamos finalmente chamando o método que inicializa nosso atributo

    println(r.instrucoes)//Agora sim, conseguimos selecionar as intruções de forma direta, pois ela foi inicializada.

    r.imprimeReceita()//Por fim, conseguimos imprimir nossa receita: 'Pegue 2 ovos, coloque numa bandeja, adicione sal e tome puro!'

    //E qual é a diferença entre usar o lateinit em uma variável, do que instanciar o atributo já com um valor padrão, ou quem sabe nulo?

    /*
    Sendo assim, porque ao invés de usar isso:

    lateinit var instrucoes: String

    Não usamos isso:

    var instrucoes: String = ""

    Ou quem sabe isso:

    var instrucoes: String?= null

    E mais tarde, quando formos imprimir a receita, não fazermos pela lógica abaixo?

    if(this.intrucoes != null && this.instrucoes != ""){
          println(this.instrucoes)
    }

    println("Você precisa gerar a receita primeiro")

    Resposta: Quando existe uma variável do tipo lateinit, é exigido que ela seja do tipo VAR, ao mesmo tempo que o compilador não se preocupa em armazená-la na memória, pois ela ainda não existe (e será inicializada tardiamente)
    Se tratando da questão de performance das nossas aplicações, usar o late init nos tras uma certa vantagem do que declarar variáveis com valores pré-definidos.

     */

}