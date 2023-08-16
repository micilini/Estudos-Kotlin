//Sobrescrita e Sobrecarga

/*
O que é Sobrescrita?

Como o próprio nome já nos diz, é o ato de sobrescrever algo, passar a limpo, escrever por cima, substituir algo que já foi escrito.

Com isso já podemos ter uma ideia, de que talvez o Kotlin seja capaz de modificar um método herdado da classe PAI, correto?

Na mosca!

Observe abaixo uma classe PAI chamada MinhaClasseDois, que possui um método do tipo 'open', que significa que ele poderá ser sobrescrito quando herdado por uma classe FILHO:
*/

open class MinhaClasseDois(){
    open fun mostrarMensagem(){//Como iremos modificar essa função na classe FILHO, ela precisa ser do tipo open, para que possamos fazer o override.
        println("Está é a minha classe [MinhaClasseDois]")
    }
}

//Já na classe FILHO, nós podemos fazer duas coisas:

//Ou podemos herdar normalmente e usar o método 'mostraMensagem', que no caso mostraria a mensagem "Está é a minha classe número 2"
class MinhaClasseFilhoUm(): MinhaClasseDois(){

}

//Ou podemos sobrescrever esse método (pois ele nos permite), de modo a alterar a mensagem, vejamos:
class MinhaClasseFilhoDois(): MinhaClasseDois(){

    override fun mostrarMensagem(){//Aqui nós estamos modificando a função herdada pelo pai, usando o override
        println("Está é a minha classe [MinhaClasseFilhoDois]")//Quando a intancia da classe filho chamar 'mostraMensagem' ele vai mostrar essa mensagem em vez da antiga herdada pela classe PAI.

        super.mostrarMensagem()//Este comando é opcinal, e é usado caso queiramos chamar o método da classe pai, e para fazer isso é só utilizar o super.
        //No caso do comando 'super.mostrarMensagem' declarado acima, ele vai chamar o método herdado da classe pai de modo a mostrar a mensagem: "Está é a minha classe [MinhaClasseDois]"
    }

}

/*
O que é Sobrecarga?

Como o próprio nome já nós diz, é quando excedemos a carga normal, quando sobrecarregamos alguém a ponto de atribuir muitas tarefas a ele.

Esse conceito já foi visto em conteúdos anteriores, e é quando temos diversos métodos com o mesmo nome, mas que recebem parâmetros diferentes, exemplo:
 */

class MinhaClasseOverload(){
    fun salvar(){}
    fun salvar(a: Int){}
    fun salvar(a: Int, b: Int){}
    fun salvar(a: Float){}
    fun salvar(a: Double){}
}

//No caso da classe acima, nós podemos chamar o método salvar de diversas formas diferentes.

fun main() {
    //Sobrescrita & Sobrecarga
    println("Analise o código para entender o conteúdo...")
}