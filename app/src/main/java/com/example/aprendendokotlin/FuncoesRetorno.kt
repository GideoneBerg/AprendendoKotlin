package com.example.aprendendokotlin


// Retorno no Kotlin
// Inserir depois do somar() : tipo de retorno ( : String {})
fun somar(): Int {
    return 5 + 5
}
fun main() {
    val soma = somar()
    println(soma * 2)
}