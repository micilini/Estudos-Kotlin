fun main() {
    //Controle de Fluxo (If, Else):
    val verdadeiro = true

    if(verdadeiro){
        println("Verdadeiro")
    }else{
        println("Falso")
    }

    println("Saí do IF/ELSE...")

    println("Maior de Idade? ${maiorDeIdade(15)}")

    //If/Else podem estar aninhados dentro de outros

    if(10 < 5){
        if(true){

        }
    }else if(5 == 10){

    }else{

    }

    //Podemos ter um retorno direto
    //As chaves não são obrigatorias quando temos um único retorno

    if(true)
        println("uno")
    else
        println("dois")

}