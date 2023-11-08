package com.example.aprendendokotlin



fun retornaNomeUsuario(nomeB: String){
    val nome = nomeB
}
    // variaveis globais
    var teste = 55
    val numero = 20
    const val constGlobal = "Gideone" // tempo de compilação fica antes do função principal
fun main() {
    // var => variavel mútavel, posso mudar o valor
    // val => variavel imútavel, não pode mudar o valor (constante)
    val nome = retornaNomeUsuario("berg") // constante tempo de execução
    println(nome)

    println(constGlobal) // constante gloval



    var nome2 = "thamiris"
    nome2 = "albuquerque"
    println(nome2)

    // posso definir o tipo de dado da variavel
    var text: String = "texto"
    println(text)
    val number: Int = 45
    println(number)
    var boolean: Boolean = true
    println(boolean)
    val char: Char = '3'
    println(char)




}

