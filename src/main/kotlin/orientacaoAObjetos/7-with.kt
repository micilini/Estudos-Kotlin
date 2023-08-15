class PessoaDois(val anoNascimento: Int, val nome: String){//Aqui temos uma classe normal, com dois atributos (anoNascimento, nome) e dois métodos (acordar e dormir)
    fun acordar(){
        println("Acordando...")
    }
    fun dormir(){
        println("Dormindo...")
    }
}

fun main() {
    //Comando With

    //Em estudos anteriores vimos que é possível instanciar nossas classes, de modo a chamar nossos métodos da seguinte forma:

    val pessoaCriadaParaExecucaoDeTestes = PessoaDois(1999, "Micilini Roll")
    pessoaCriadaParaExecucaoDeTestes.acordar()
    pessoaCriadaParaExecucaoDeTestes.dormir()

    //Nomes muito grandes não? Para isso podemos usar o With que significa com:

    with(pessoaCriadaParaExecucaoDeTestes){
        this.acordar()
        this.dormir()
        acordar()//Também podemos chamar sem o this
        dormir()
        println(anoNascimento)//Chamando atributos
    }

    //Com o With conseguimos chamar os métodos da classe dentro de um bloco, de modo a referenciar nossa variável por meio do this.
    //Isso ajuda a leitura e organização de código quando temos nomes muito grandes.
    //A funcionalidade é a mesma, o que muda é a leitura mesmo!
}