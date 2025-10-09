package com.example.kotlin

fun main() {
    println("Listas")

    val inmutable: List<Int> = listOf(1, 2, 3)
    println("Lista inmutable: $inmutable")

    val listaMutable: MutableList<Int> = mutableListOf(4, 5, 6)
    println("Lista mutable inicial: $listaMutable")

    listaMutable.add(7)
    println("Después de agregar 7: $listaMutable")

    listaMutable.removeAt(index = 0)
    println("Después de eliminar índice 0: $listaMutable")

    println("Elementos de la lista mutable:")
    for (mutable in listaMutable) {
        println(mutable)
    }

    println("\nOperaciones con MutableList:")
    val colores = mutableListOf("rojo", "verde")
    colores.add("azul")
    colores += "amarillo"
    colores.add(1, "blanco")
    colores.remove("verde")
    colores.removeAt(0)
    colores[0] = "negro"
    println("Colores actuales: $colores")

    colores.clear()
    println("¿Lista vacía? ${colores.isEmpty()}")

    println("\nBúsqueda con MutableList:")
    val nombres = mutableListOf("juan", "luis", "pedro")
    println("Primero que empieza con 'l': ${nombres.find { it.startsWith(prefix = "l") }}")
    println("Primero con más de 4 letras: ${nombres.firstOrNull { it.length > 4 }}")
    println("¿Alguno contiene 'j'? ${nombres.any { it.contains('j') }}")
    println("¿Ninguno es 'x'? ${nombres.none { it == "x" }}")

    println("\nDeclaración y operaciones con lista mutable:")
    val numerosDesordenados = mutableListOf(0, 3, 4, 6, 2, 1, 6)
    println("Orden ascendente: ${numerosDesordenados.sorted()}")
    println("Orden descendente: ${numerosDesordenados.sortedDescending()}")
    println("Sin duplicados: ${numerosDesordenados.distinct()}")
}
