enum class Prioridade{//Classe do tipo enumerador
Baixa, Media, Alta
}//Os valores não precisam de uma definição

enum class AnimalEnum{
    Cachorro, Gato, Cavalo, Vaca, Morcego
}//Os valores não precisam de uma definição

//O numerador é diferente da classe pois limite seus valores internos

fun minhasPrioridades(p: Prioridade){//Essa função só aceita 3 tipos de prioriedades
    //O ganho da classe ENUM é que ela limita a quantidade de valores
    println(p.toString())
}

enum class Tipos(val valor: Int){//Exemplo de enumerados que estão atrelados com valores
Bom(60), Ruim(44), Excelente(100)
}

enum class TiposDois(val id: Int){
    Uno(12){
        override fun toString(): String {//Aqui estamos usando a função override para sobescrevendo a função toString que existia
            return "Uno"//Retorno diferenciado
        }
    },
    Tup(23)
}

fun main() {
    //Classes do tipo Enum (Que significa Enumerador)

    minhasPrioridades(Prioridade.Baixa)//Passando uma prioriedade para a função

    for (p in Prioridade.values()){//Com o values pegamos as prioridades uma por uma
        if(p == Prioridade.Alta){//Modo de fazer verificações em prioridades
            println("Prioridade bastante alta, cuidado...")
        }
        println(p)
    }

    for (p in Tipos.values()){
        println("Tipo: ${p}, Vale: ${p.valor}")//Aqui estamos acessando cada valor atrelado ao tipo de enum
    }

    println(Tipos.Excelente.valor)//Pegamos um valor de um tipo específico

    println(Prioridade.Baixa.toString())


}