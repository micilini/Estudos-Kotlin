fun main() {
    //Polimorfismo
    /*
    O Polimorfismo é um mecanismo por meio do qual selecionamos as funcionalidades utilizadas de forma dinâmica por um programa no decorrer de sua execução.
    Com o Polimorfismo, os mesmos atributos e objetos podem ser utilizados em objetos distintos, porém, com implementações lógicas diferentes.
     */

    //Ou seja, Polimorfismo é quando temos uma classe de Molde (Interface Funcionario), que pode estar representando o pai de algumas outras classes (class Gerente, class Analista).

    //Ao mesmo tempo que temos uma função que pode receber uma dessas duas classes filho (class Gerente, class Analista) como parâmetro de forma dinâmica.

    //Vejamos alguns exemplos abaixo para que possamos entender.

    mostraBonus(Gerente(5000f))
    mostraBonus(Analista(4000f))
}

//Declaramos uma Interface chamado 'Funcionario', que obriga a implementação de 1 atributo e 1 método
interface Funcionario{
    var salario: Float
    fun bonus(): Float
}

//Aqui temos uma classe chamada Gerente, que implementa no parâmetro o atributo obrigatório, e dentro do bloco o método obrigatório. Lembrando que o atributo poderia ser implementado dentro do bloco em vez do construtor.
//Tenha em mente que a classe Gerente implementa a INTERFACE 'Funcionario'
class Gerente(override var salario: Float): Funcionario{
    override fun bonus(): Float {
        return salario * 0.5f
    }
}

//Aqui temos uma classe chamada Analista, que implementa no parâmetro o atributo obrigatório, e dentro do bloco o método obrigatório. Lembrando que o atributo poderia ser implementado dentro do bloco em vez do construtor.
//Tenha em mente que a classe Analista implementa a INTERFACE 'Funcionario'
class Analista(override var salario: Float): Funcionario{
    override fun bonus(): Float {
        return salario * 0.3f
    }
}

//Até aqui tudo bem, agora vamos ver na prática onde se encontra o conceito do POLIMORFISMO:

//Criamos uma função que recebe uma instância de Funcionario que no caso é uma INTERFACE, nesse caso ele pode receber tanto Gerente quanto Analista, pois ambos são, e fazem parte da Interface funcionario
//De modo que no código poderíamos passar uma instância de gerente ou de analista para a mesma função, que o Kotlin aceitaria normalmente e ainda calcularia o bonus.
fun mostraBonus(func: Funcionario){
    println(func.bonus())
}

//Isso é polimorfismo, uma função capaz de receber diversos tipos de classes, desde que estas classes herdem de um mesmo PAI em comum.
