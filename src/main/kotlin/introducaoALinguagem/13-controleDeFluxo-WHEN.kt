package introducaoALinguagem

fun main() {
    //Control de Fluxo (When): QUE SIGNIFICA "QUANDO"

    val numero = 1

    when(numero){
        1 -> {//Usamos chaves quando podemos ter mais de uma única instrução
            println("Um")
        }
        2 -> {
            println("Dois")
        }
        3 -> println("Três")//Quando temos uma única instrução, não precisamos das chaves
        else -> {
            println("Não achou")//O else só é executado quando nenhuma das opções foi encontrada
        }
    }

    //No caso do comando "when" acima, ele executará a mensagem "Um"

    //Outro exemplo do uso do When

    val texto = "um"

    when(texto){
        "um" -> {
            println("1")
        }
        "dois" -> println("2")
        else -> println("Não achou")
    }

    //When pode ser usado dentro de variáveis

}