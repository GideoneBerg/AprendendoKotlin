package com.example.aprendendokotlin

fun main() {
    val n1 = 10
    val n2 = 20

    val resultado = (n1 + n2) * 2
    println(resultado)

    val maior = 5 > 5
    println(maior)
    val igual = 5 == 6
    println(igual)
    val diferente = 5 != 6
    println(diferente)

    // Operadores lógicos

    /*  var test = true && true // true
    var test2 = true && false // false
    var test3 = true || true // true
    var test4 = true || false // true
    var test5 = false || true // true
    var test6 = false || false // false
    var test7 = !true // false
    var test8 = !false // true
    */

    val idadePessoa = 31
    val comprasPessoa = 500

    val ganhaCupom = idadePessoa >= 50 || comprasPessoa >= 600
    println("Sim/Não:" + !ganhaCupom) // negação



}