package com.example.kotlin

fun main(){
    println("Listas")
    val inmutable: List<Int> = listOf(1,2,3)
    println("Lista inmutable ${inmutable}")

    val listaMutable: MutableList<Int> = mutableListOf(4,5,6)
    println("Lista inmutable ${listaMutable}")
    listaMutable.add(7)
    println("lista mutable ${listaMutable}")
    listaMutable.removeAt(index = 0)
    println("lista mutable ${listaMutable}")

    for (mutable in listaMutable)
        println(mutable)

    println("Operaciones con Mutable List")
    val colores = mutableListOf("rojo","verde")
    colores.add("azul")
    colores+="amarillo"
    colores.add(1,"blanco")
    colores .remove("verde")
    colores.removeAt(0)
    colores[0]= "negro"
    println(colores)
    colores.clear()
    println(colores.isEmpty())

    println("Busqueda con mutables list")
    val nombres = mutableListOf("juan","luis","pedro")
    println(nombres.find{it.starsWith(prefix:"l")})
    println(nombres.firstOrNull {it.lenght>4})
    println(nombres.any{it.contains(char"j")})
    println(nombre.none  {it =="x"})

    println("Declaramiento de lista mutable")
    val numerosDesordenados = mutableListOf(0,3,4,6,2,1,6)
    println(numerosDesordenados.sorted())
    println(numerosDesordenados.sirtedDescendig())
    println(numerosDesordenados.distinct())

}