package de_java_para_kotlin

fun main() {
    val cliente = Cliente("gabriel@top.com", "Gabriel maravilhoso!")
    println(cliente.email) // Correto: acessando a propriedade email diretamente
    println(cliente.nomeUsuario) // Correto: acessando a propriedade nomeUsuario diretamente
}