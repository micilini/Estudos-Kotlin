fun main() {
    //Controle de Fluxo (While)
    while(true){//Enquanto for true ele executa eternamente
        print("v")
    }//Este é um exemplo de loop infinito

    var numero = 0;
    while(numero < 5){
        print("$numero -")
        numero++;
    }//Ele sai do loop quando descobre que o numero ficou maior ou igual a 5

    println("Saí do Loop!")

    var i = 100
    while(i > 0){
        println(i)
        i--
    }//Exemplo de while que funciona de forma decrescente

    //Controle de Fluxo (Do..While):

    do{//Faça enquanto, extremamente similar, a diferença é que ele executa primeiro antes de validar no while
        print("Eterno!")
    }while(true)

    var t = 0
    do{
        print(t)
        t++
    }while(t == 1000)//Outro exemplo

    //Controle de Fluxo (Continue, Break)

    while(true){
        println("Vai sair por causa do 'break'")
        break//Quebra o laço do loop e sai do while.
    }

    while(true){
        while(true){
            break//Aqui ele sai do escopo desse segundo while, mas o primeiro continua rodando
        }
    }

    var loopy = 0
    while(loopy < 100000){
        if(loopy == 50){
            break//Aqui ele sai do While mesmo estando no IF
        }
        print(loopy)
        loopy++
    }

    while(true){
        continue//Ignora tudo o que vem abaixo e volta pro while
        println("Nunca vou ser chamado")
    }

}