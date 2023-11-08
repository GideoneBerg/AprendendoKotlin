package com.example.aprendendokotlin

fun main() {

    // if/else
    // composta
    /*  val notaAluno = 7
    val condicao = notaAluno >= 7

    if(condicao){
        println("Aluno aprovado")
    } else {
        println("Aluno reprovado")
    }*/
    // aninhada
    /*    val opcao = 1

    if(opcao == 1){
        println("Cartão de crédito")
    } else if (opcao == 2){
        println("Cartão de débito")
    } else{
        println("nenhuma condição selecionada")
    }*/

    // Recurso ( in )
    /*
    val opcao = 5
    if(opcao in 1..3){ // se opcão estiver entre 1 e 3
        println("Opções selecionadas: 1,  2 3")
    } else if(opcao in 4..8){
        println("Opções selecionadas: 4 até 8")
        }*/

    // when => (quando) > funciona como o switch case
    val opcao = 4

    when(opcao){
        1 -> println("Cartão de crédito")
        2 -> println("Cartão de débito")
        in 3..5 -> println("Saldo") // posso usar o in entre 3 e 5
        else -> println("nenhuma opcão selecionada")
    }


}
