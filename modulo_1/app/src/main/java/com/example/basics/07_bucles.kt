package com.example.kotlin

fun main() {
    println("Bucles")

    val jedis = listOf("Luke", "Leia", "Obi-Wan", "Yoda", "Ahsoka")

    // Recorriendo con índice
    for ((index, jedi) in jedis.withIndex()) {
        println("${index + 1}. $jedi")
    }

    // Rango ascendente
    for (i in 0..20 step 2) {
        println("Energía: $i%")
    }

    // Rango descendente
    for (countdown in 10 downTo 1) {
        println("Despegue en: $countdown")
    }

    // Control de flujo dentro del bucle
    for (jedi in jedis) {
        if (jedi == "Obi-Wan") continue
        if (jedi == "Yoda") break
        println("Entrenando a $jedi")
    }
}
