package com.example.aprendendokotlin

fun main() {
    // criando array em Kotlin
    /*    val nomes = arrayOf( // constante
        "Gideone",
        "Thamiris"
    )
    // utilizei val ao criar o array mesmo assim consegui mudar o valor
    // do índice 0, Eu não posso pegar o array e tentar sobrescrever-lo

    nomes[0] = "Mudou"

    println(nomes[0])
    println(nomes[1])*/

    // Loops

    // while
    /*var numero = 1
    while (numero <= 5){ // ou (numero in 1..5)
        println("executou: $numero") // forma de concatenar com o $
        numero++
    }*/

    //  for
    // não precisa declarar a variável dentro do for
    // é utilizado o in

    /*for( numero in 3..10 ){
        println("Executou: $numero")
    }*/

    // while com array
    /*

        val postagens = arrayOf(
            "Viagem para praia",
            "Levei o cachorro pra praça",
            "Trilha com os amigos"
        )
        var numero = 0
        while (numero < postagens.size){
            println(postagens[numero])
            numero++
        }
    */

    // for com array
    val postagens = arrayOf(
        "Viagem para praia",//0
        "Levei o cachorro pra praça",//1
        "Trilha com os amigos"
    )
    for (postagens in postagens){
        // para cada postagens dentro de postagens ele vai percorrer e imprimir
        println("titulo: $postagens")
    }
    // imprimindo array com índice
    for ((indice,postagens) in postagens.withIndex()){ //sintaxe
        println("$indice: $postagens")
    }
}