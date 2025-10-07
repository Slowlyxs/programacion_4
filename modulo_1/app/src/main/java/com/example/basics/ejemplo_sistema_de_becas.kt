package com.example.basics

fun main() {
    println("Condicional ejercicio en clase")
    print("Ingresa tu promedio: ")
    val promedio: Int = readLine()?.toIntOrNull() ?: 0
    print("Trabajas? (Si - No): ")
    val trabaja: String = readLine() ?: if (promedio >= 90 && trabaja == "No") {
        println("Beca completa")
    } else if (promedio >= 90 && trabaja == "Si") {
        println("Beca parcial")
    } else if (promedio < 90) {
        println("Sin beca")
    }
        print("Ingrese el horario: ")
        val hora: Int = readLine()?.toIntOrNull() ?: 0
        if (hora in 7..13) {
            println("Clase en la mañana")
        } else if (hora in 14..19) {
            println("Clase de la tarde")
        } else {
            println("Horario no lectivo")
        }
    }
