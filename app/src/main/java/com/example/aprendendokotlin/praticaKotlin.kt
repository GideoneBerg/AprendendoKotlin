package com.example.aprendendokotlin

import java.util.Scanner
fun main() {
    // Kotlin
    val entrada = Scanner(System.`in`)
    val vetor = IntArray(5)

    var i = 0
    while (i < vetor.size) {
        print("Insira um número no vetor: ")
        val numero = entrada.nextInt()

        if (numero > 3) {
            println("Número $numero foi adicionado no vetor.")
            vetor[i] = numero
            i++
        } else {
            println(
                "Número inválido! add números > 3"
            )
        }
    }
    // impressão dos valores
    print("[")
    for (valor in vetor) {
        print(" $valor")
    }
    print("]")
    println("\nVetor preenchido")
}