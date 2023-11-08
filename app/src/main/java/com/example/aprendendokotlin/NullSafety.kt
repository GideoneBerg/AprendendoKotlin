package com.example.aprendendokotlin
// Null Safety
// Null Safety(segurança de nulo) garante que um
// objeto nunca seja nulo, ou se for nulo exige
// que seja feito alguma verificação

// Por padrão no kotlin as variáveis não recebem o valor nulo
// Ex: var nome: String = "Gideone"

// Para que a variável receba o valor
// null precisamos usar uma (?) depois do tipo
// Ex: var nome: String? = "Gideone" ou null

// NullPointerException => Esse erro ocorre quando temos uma classe
// ou variável nula, erro ocorre em tempo de execução quando a aplicacão
// está andamento
class Carro {
    var cor = "vermelho"

    fun acelerar(){
        // ***
    }
}
fun main() {

    var carro: Carro? = null // Atribuindo que null
    //carro = Carro() // apliquei a instância de carro

    println(carro?.cor) // chamada segura, utilizando o ?

    // println(carro.cor)  // sem a ? da erro

    // Linha 34: Caso a variável for nula, foi definida uma cor padrão para a cor
    // utlizando o operador Elvis Operator ( ?: )
    val cor = carro?.cor ?: "cor padrão"
    println(cor)

    if( carro != null ){
        println(carro.cor) // veja que o código é igual da linha 31
                            // a diferença é que o kotlin entendi que foi
                            // feito um if verificando de a condição era nula
    }

}