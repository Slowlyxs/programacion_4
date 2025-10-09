package com.example.basics

fun saludar() {
    println("Hola")
}

fun sumar(a: Int, b: Int): Int {
    return a + b
}

fun cuadrado(num: Int) = num * num

fun returnMultiple(a: Int, b: Int): Pair<Int, Int> {
    val suma = a + b
    val resta = a - b
    return Pair(suma, resta)
}

fun resta(a: Int, b: Int): Int {
    return a - b
}

fun multiplicacion(a: Int, b: Int): Int {
    return a * b
}

fun division(a: Int, b: Int): Int {
    return a / b
}

fun main() {
    saludar()

    val resultadoSuma = sumar(5, 5)
    println("Suma: $resultadoSuma")

    val resultadoCuadrado = cuadrado(5)
    println("Cuadrado: $resultadoCuadrado")

    val (suma, resta) = returnMultiple(10, 3)
    println("Suma: $suma")
    println("Resta: $resta")

    println("Resta (función): ${resta(10, 4)}")
    println("Multiplicación: ${multiplicacion(6, 7)}")
    println("División: ${division(20, 4)}")
}
