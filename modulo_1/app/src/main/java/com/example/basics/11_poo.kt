package com.example.basics

data class Jedi(
    val nombre: String,
    val edad: Int,
    val nivelFuerza: Int,
    val maestro: String? = null
) {
    val rango: String
        get() = when {
            nivelFuerza >= 90 -> "Maestro"
            nivelFuerza >= 80 -> "Caballero"
            nivelFuerza >= 50 -> "Padawan"
            else -> "Iniciado"
        }

    fun puedeEnsenar(): Boolean = nivelFuerza >= 70

    fun entrenar(): Boolean = edad <= 5
}

fun main() {
    val Luke = Jedi(
        nombre = "Anakin Skywalker",
        edad = 25,
        nivelFuerza = 75,
        maestro = "Obiwan Kenobi"
    )
    println(Luke)
    //Mostrar variables fde un objeto
    val(nombre, edad, nivelFuerza) = Luke
    println("Nombre del Jedi ${nombre}, edad ${edad}, nivel de la fuerza: ${nivelFuerza}")

    // Copiar objetos
    val ashoka = Luke.copy(nombre = "Ahsoka", nivelFuerza = 80)
    println(ashoka)
    //propiedades
}
