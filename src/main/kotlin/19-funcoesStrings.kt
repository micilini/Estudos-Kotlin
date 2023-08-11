fun main(){
    //Exemplo de uso de funções que formatam STRINGS:

    val meuTexto = "Programação Kotlin"

    println("Tamanho da String: ${meuTexto.length}")//Retorna o tamanho da string

    println("Posição 0 da string: ${meuTexto[0]}")//Retorna o elemento da posição 0 da string

    println("Começa com Pro?  ${meuTexto.startsWith("Pro", false)}")//Verifica se a string começa com algum texto. IgnoreCase ignora caso sensitivo (maiusculo minusculo)

    println("Termina com abc? ${meuTexto.endsWith("abc")}")//Mesma lógica de cima, só que invertido (termina com)

    println(meuTexto.substring(2))//Pula duas posições e começa a partir daí

    println(meuTexto.substring(2, 4))//Retorna da posição 3 até 4

    println(meuTexto.replace("Kotlin", "Android"))//Troca as string, de 'kotlin' para 'Android'

    println(meuTexto.lowercase())//Converte tudo para minúsculo

    println(meuTexto.uppercase())//Converte para maiúsculo

    println(meuTexto.trim())//Elimina espaços em branco no início e no final da string
}