package introducaoALinguagem

fun main() {
    //Tipo Genérico
    //É possível criar uma função que possa receber qualquer tipo de valor?
    //Sim, isso é possível por meio dos tipos generics
    minhaFuncao(12, true)
    minhaFuncao(12, "Micilini")
    minhaFuncao(12, 33)
}

fun <T> minhaFuncao(idade: Int, outro: T){//Para dizer que a variável 'outro' pode receber valores de qualquer tipo
    //Usamos ela logo após o 'fun' especificando a letra T (mas poderia ser qualquer outra letra), e usar o T como tipo após o 'outro:'

    if(outro is String){//Verifica se o tipo genérico é do tipo String
        println("A variável Outro é do tipo String")
    }

    if(outro is Int){
        println("A variável Outro é do tipo Int")
    }

    if(outro is Boolean){
        println("A variável Outro é do tipo Boolean")
    }
}

fun <T, J> minhaFuncaoDois(idade: T, outro: J){
//Exemplo de função genérica com dois tipos
}