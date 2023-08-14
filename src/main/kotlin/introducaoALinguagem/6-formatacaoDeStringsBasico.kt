package introducaoALinguagem

fun main() {
    //Formatação de Strings (Básico)

    //Vamos começar declarando algumas variáveis e atribuindo valores do tipo String para cada uma delas:
    val nome = "Micilini"
    val sobrenome = "Roll"

    //Vejamos abaixo algumas formas de se usar o println(), de modo a mostrar os valores que existem dentro das variáveis:

    println(nome + sobrenome)//Concatena strings

    println("Nome: " + nome + ", Sobrenome: " + sobrenome)//Concatena junto a strings

    println("Nome:  $nome $sobrenome")//Podemos utilizar o $ em conjunto com os nomes das variáveis dentro as aspas duplas

    println("Nome: ${nome}")//Podemos usar dessa forma

    //Usar variáveis dentro de string se chama interpolação, como acontece nos dois exemplos acima

    val tamanho = nome.length//Acessamos o tamanho dessa string

    println("A string possui o tamanho de: $tamanho")

    val texto = "uhasiuhiuahsd" +
            "ahdiuashd" +
            "ashdausdhiaushd"//Podemos quebrar a string dessa forma

}