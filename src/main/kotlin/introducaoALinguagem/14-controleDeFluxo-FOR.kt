package introducaoALinguagem

fun main() {
    //Control de Fluxo (For)
    for(i in 1..10){
        println("$i")//Imprime uma linha de 1 a 10
    }

    val str = "Micilini Roll"
    for(char in str){
        println(char)//Para cada caracter na string nós mostramos separadamente
    }

    for(i in 1..10 step 2){//Percorre a lista a passo de 2 em 2
        println("$i")//Imprime uma linha de 1, 3...
    }

    for(i in 20 downTo 0){//Vai do 20 até o 0
        println("$i")//Imprime uma linha de 1 a 10
    }

    for(i in 20 downTo 0 step 3){//Vai do 20 até o 0, pulando de 3 em 3
        println("$i")//Imprime uma linha de 1 a 10
    }

    //IMPORTANTE: Diferente de outras linguagens, o kotlin não tem suporte
    //ao FOR padrão com, os 3 statements como existe em outras linguagens

    /*for (int i = 0; i < 5; i++) {
        System.out.println(i);
    }*/
}