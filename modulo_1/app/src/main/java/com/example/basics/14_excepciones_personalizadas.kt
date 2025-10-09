package com.example.basics

class FuerzaInsuficienteException(message: String) : Exception(message)

class MisionPeligrosaException(val nivelPeligro: Int, message: String) : Exception(message)

fun realizarMision(nivelFuerza: Int, peligroMision: Int): String {
    return try {
        when {
            nivelFuerza < 30 -> throw FuerzaInsuficienteException("Nivel de fuerza muy bajo")
            peligroMision > 80 -> throw MisionPeligrosaException(peligroMision, "Misión extremadamente peligrosa")
            else -> "Misión realizada con éxito"
        }
    } catch (e: FuerzaInsuficienteException) {
        "Error: ${e.message}. Se requiere entrenamiento adicional"
    } catch (e: MisionPeligrosaException) {
        "Error: ${e.message}. Nivel de peligro: ${e.nivelPeligro}"
    } catch (e: Exception) {
        "Error inesperado: ${e.message}"
    } finally {
        println("Reporte enviado") // Aquí puedes hacer logging o enviar reportes
    }
}
fun main(){
    println()
}
