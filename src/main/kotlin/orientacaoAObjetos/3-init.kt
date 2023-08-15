class Animal(var especie: String){
    init {
        //O bloco Init significa inicialização, é executado sempre quando a classe for criada
        println("Init 1: Classe Animal Criada")
    }
    init {
        //Podemos ter varios blocos de init, ele executa todos e na sequencia
        println("Init 2")
    }
}

fun main() {
    //Comando init
    val animal = Animal("Cachorro")//Receberemos um println (pois init foi chamado)

    //A ideia principal do bloco init é fazer verificações dos valores atribuidos.

    /*
    var fala: String = ""
    init{
      if(especie == "cachorro"){
         fala = "Au Au!"
      }else if(especie == "Gato"){
         fala = "Miau Miau!"
      }
    }
     */
}