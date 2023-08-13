fun main() {
    //Usos do Any, Unit, Nothing
    //O tipo de dado Any ele dá origem aos outros tipos, todos os tipos como Int, Boolean e afins, são descendentes de ANY

    //Exemplo de variáveis do tipo Any
    var minhaVariavel: Any = 12
    var minhaVariavelDois: Any = "Meu Texto"

    //Conseguimos alterar o valor da variável desde que ela seja do tipo Any e Var
    minhaVariavel = "Olá Mundo"

    //Exemplo de uso de função do tipo Any
    valores(12)
    valores("olá mundo")
    valores(true)

    //Existem outras diferenças entre ANY e Generecs, mas nesses exemplos aqui, eles não possuem diferença

    minhaFuncaoDois("Olá mundo...")//Executando uma função do tipo Nothing
}

fun valores(value: Any){//Aqui ele consegue receber qualquer tipo de dado
    print(value)
}

fun minhaFuncao(valor: Int): Unit{//Significa que a função não tem retorno

}

fun minhaFuncaoDois(valor: String): Nothing{
    //O nothing é meio dificil de explicar pois não tem nada que seja similar em outras linguagens.
    //Ele é um tipo de dado, mas não tem retorno.
    //Usamos o Nothing quando queremos retornar uma exceção da função.

    TODO("Não Implementado!")//Usamos o comando TODO que significa não implementado. Ele é usado para fazer o lançamento de exceções, de resto não é comum ver uma função com nothing, pois não conseguimos retornar nada que não seja uma exceção
    //return 23//Não podemos retornar nada com o Nothing
}

/*
Qual é uso real do Nothing?

Vamos imaginar que o desenvolvedor A, está fazendo o back-end do sistema, e o desenvolvedor B esta fazendo outra parte do back-end que está mais relacionada com o banco de dados.

Supondo que o desenvolvedor A terminou mais rápido que o desenvolvedor B, e que agora o desenvolvedor A precisa da função "de "SALVAR" no banco de dados.

Ele pede para que o desenvolvedor B desenvolva tal função.

Só que, o desenvolvedor B ainda não fez essa função... nesse caso o desenvolvedor A transforma cria somente a estrutura da função de salvar, e diz que seu retorno será NOTHING.

Onde dentro dessa função existirá um TODO, que irá lançar uma exceção alegando "Não implementado" ou "Não terminado" ou "Não tive tempo".

Com isso o desenvolvedor A consegue seguir com o desenvolvimento do sistema, pois ele já sabe dos métodos que precisam ser chamados.

 */