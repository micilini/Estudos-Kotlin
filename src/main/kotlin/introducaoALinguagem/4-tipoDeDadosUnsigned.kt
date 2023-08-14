package introducaoALinguagem

fun main() {
    //Existem alguns tipos de dados classificados como 'unsigned', que são do tipo sem sinal
    println("ULong Max - ${ULong.MAX_VALUE} - ${ULong.MIN_VALUE}")
    println("UInt Max - ${UInt.MAX_VALUE} - ${UInt.MIN_VALUE}")
    println("UShort Max - ${UShort.MAX_VALUE} - ${UShort.MIN_VALUE}")
    println("UByte Max - ${UByte.MAX_VALUE} - ${UByte.MIN_VALUE}")

    //Um número unsigned perde a parte negativa, pois em alguns casos não queremos trabalhar com números negativos

    //val abc: UInt = -1u//Aqui ele dá erro de compilação pois não existe
    val abcd: UShort = 10u//Precisamos declarar o u no final
    val abcde: UByte = 10u//Mesma lógica anterior...
    val abcdef: ULong = 100u//Mesma logica anterior...

    //Não existe 'unsigned' voltados para double e float, sendo reservados para números inteiros.
}