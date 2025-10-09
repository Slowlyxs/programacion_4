package com.example.basics

fun main() {
    println("VARIABLES")

    val Citas_medicas = "Club de leones el Inca"
    var Club_de_leones = "El Inca"

    println("Tipo de variables")
    println("Tipo Numéricos")

    println("Tipo entero")
    val edad: Int = 25
    println(edad)

    println("Tipo Double")
    var altura: Double = 1.75
    println(altura)

    println("Tipo Float")
    val peso: Float = 64.6f
    println(peso)

    println("Tipo Long")
    val poblacion: Long = 2_000_000_000L
    println(poblacion)

    println("Tipo de texto")
    val nombre: String = "Alejandro"
    println(nombre)

    println("Tipo de texto")
    val especialidad: String = "Cardiologia"
    println(especialidad)

    println("Tipo Char")
    val inicial: Char = 'O'
    println(inicial)

    println("Tipo Lógico")
    val Mayor_de_edad: Boolean = true
    println(Mayor_de_edad)

    println("Nulidad")
    val apellido: String? = "Alarcon"
    println(apellido)

    println("Nulidad")
    val ciudad: String? = ""
    println(ciudad?.length)

    println("Operacion de aserción no null")
    val longitudSegura = apellido!!.length
    println(longitudSegura)

    println("Interpretacion de Strings")
    val nombre_paciente: String = "Alejandro"
    val edad_paciente: Int = 21
    val Tipode_sangre: String = "O+"

    // CORREGIDO: faltaban comillas y concatenación para imprimir correctamente
    println("${nombre_paciente.uppercase()} tiene la edad de ${edad_paciente} con tipo de sangre ${Tipode_sangre}")
    println("En 2 años tendrá: ${edad_paciente + 2} años")  // Corregí el cálculo a +2 y 'años' bien escrito

    println("String Multilinea")
    val mensaje_confirmacion = """
        Querido $nombre_paciente
        Te esperamos en la cita
        de la especialidad médica de 
        $especialidad, llega con anticipación
    """.trimIndent()
    println(mensaje_confirmacion)

    println("Conversiones")
    val textoEdad: String = "21"
    val edadConvertida: Int = textoEdad.toInt()
    println(edadConvertida)

    val numero: Double = 50.8
    val numeroConvertido: String = numero.toString()
    println(numeroConvertido)
}
