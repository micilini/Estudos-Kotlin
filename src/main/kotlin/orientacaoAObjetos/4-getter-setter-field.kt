class PessoaUm{

    var idade: Int = 44

    var saldo: Int = 258
        get(){//OBS: Este atributo é referente ao 'saldo'
            println("Acessando o Saldo")
            return field//Field referência o atributo e retorna (se digitar return saldo, fica um loop infinito com o println acima)
        }
        set(value) {//OBS: Este atributo é referente ao 'saldo'
            println("Atribuindo ao Saldo")
            field = value//usamos o field de novo com a variável value
        }
}

fun main() {
    //Funções do tipo Gettter, Setter, Field:

    //Getter: Função padrão da classe que é capaz de retornar um determinado atributo
    var pessoaSaldo: Int = PessoaUm().saldo//Quando acessamos o "saldo", ele possui um get personalizado, logo o retorno é feito por ele, não só retornando o saldo como também mostrando uma mensagem personalizada
    println(pessoaSaldo)//Retorna: 258 e ainda mostra a mensagem no console: "Acessando o Saldo"

    //Setter: Função padrão da classe que é capaz de setar um determinado valor a um atributo
    var pessoaMicilini = PessoaUm()
    pessoaMicilini.saldo = 18522//Esta forma, obrigatoriamente será processada pela função set, que não só irá setar como retornar a seguinte mensagem no console: "Atribuindo valor"
    println(pessoaMicilini.saldo)//Retorna 18522 e ainda mostra a mensagem no console: "Acessando valor"

    /*
    Informações Importantes: Abaixo do atributo saldo na classe PessoaUm, você viu que declaramos duas funções, uma chamada get e outra chamado set.
    Quando fazemos isso, o Kotlin já entende que esse get e esse set se referem ao atributo saldo!
    Diferente de quando tentamos modificar e acessar o atributo idade, que não possuem um get/set atrelado a eles.
    O ponto bom é que por meio das funções set e get, podemos fazer operações a mais quando selecionamos ou atribuímos valores aos nossos atributos.
     */


}