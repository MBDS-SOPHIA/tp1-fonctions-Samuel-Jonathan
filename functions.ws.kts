fun afficherNombresPairsOuImpairs(x: Int, pair: Boolean = true) {
    var compteur = 0
    var nombre = if (pair) 0 else 1
    while (compteur < x) {
        println(nombre)
        nombre += 2
        compteur++
    }
}

println("Nombres pairs :")
afficherNombresPairsOuImpairs(5, pair = true)

fun afficherFibonacci(x: Int) {
    var a = 0
    var b = 1
    for (i in 1..x) {
        println(a)
        val suivant = a + b
        a = b
        b = suivant
    }
}
println("\nSuite de Fibonacci :")
afficherFibonacci(7)

fun factoriel(x: Int = 10): Long {
    return if (x == 0) 1 else x * factoriel(x - 1)
}

println("\nFactoriel de 5 :")
println(factoriel(5))

fun afficherNombresPremiers(x: Int) {
    var nombre = 2
    var compteur = 0
    while (compteur < x) {
        if (estPremier(nombre)) {
            println(nombre)
            compteur++
        }
        nombre++
    }
}

fun estPremier(nombre: Int): Boolean {
    if (nombre < 2) return false
    for (i in 2..Math.sqrt(nombre.toDouble()).toInt()) {
        if (nombre % i == 0) return false
    }
    return true
}
println("\nNombres premiers :")
afficherNombresPremiers(5)

