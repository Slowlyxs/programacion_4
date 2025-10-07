package com.example.basics

fun main() {
    println("Operadores de IGUALDAD!")
    val nombre1: String = "Yoda"
    val nombre2: String = "Yoda"
    val nombre3: String = String("Yoda".toCharArray())

    println("Igualdad estructura1 (contenido)")
    println(nombre1==nombre2)
    println(nombre1==nombre3)
    println("Igualdad Referencial (misma instancia)")
    println(nombre1==nombre2)
    println(nombre1==nombre3)
}