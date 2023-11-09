package com.example.aprendendokotlin


fun subtrair(){ // Função padrão em Kotlin
    println(10 - 8)
}
// função reduzida
fun multiplicar() = println(10 * 8) // Inline Fuction = função em linha

// função reduzida com retorno
fun dividir() : Double = 15.0 / 2
fun main() {
    subtrair()
    multiplicar()
    println(dividir())

}