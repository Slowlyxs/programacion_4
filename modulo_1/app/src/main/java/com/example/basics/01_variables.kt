package com.example.basics

fun main() {
    println("VARIABLES")

    val planeta = "Tierra"
    var jedi = "Anakin"

    println("Tipo de variables")
    println("Tipo Numéricos")

    println("Tipo entero")
    val edad: Int = 25
    println(edad)

    println("Tipo Double")
    var altura: Double = 25.5
    println(altura)

    println("Tipo Float")
    val peso: Float = 25.5f
    println(peso)

    println("Tipo Long")
    val poblacion: Long = 2_000_000_00L
    println(poblacion)

    println("Tipo de texto")
    val nombre: String = "Obito"
    println(nombre)

    println("Tipo Char")
    val inicial: Char = 'O'
    println(inicial)

    println("Tipo Lógico")
    val asJedi: Boolean = true
    println(asJedi)

    println("Nulidad")
    val apellido: String? = "Alarcon"
    println(apellido)

    println("Nulidad")
    val ciudad: String? = ""
    println(ciudad?.length)

    println("Operacion de aserción no null")
    val longitudSegura = apellido!!.length

    println("Interpretacion de Strings")
    val nombreprincesa: String = "Leia"
    val edadprincesa: Int = 19
    val planetaprincesa: String = "Alderan"

    println("${nombreprincesa.uppercase()}nacio en ${planetaprincesa}")
    println("En 10 años tendra: ${edadprincesa+10} anios")

    println("String Multilinea")
    val mensaje = """
        Querido $nombre
        Tu mision en $planeta
        ha sido completada exitosamente
        Que la fuerza te acompañe
    """
    println(mensaje)

    println("Conversiones")
    val textoEdad: String = "25"
    val edadConverida: Int = textoEdad.toInt()
    println(edadConverida)

    val numero: Double = 50.8
    val numeroConvertido: String = numero.toString()
    println(numeroConvertido)

}
