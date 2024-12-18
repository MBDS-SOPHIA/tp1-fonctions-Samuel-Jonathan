fun afficherNombresPairsOuImpairs(x: Int, pair: Boolean) {
    var count = 0
    var number = if (pair) 0 else 1
    while (count < x) {
        println(number)
        number += 2
        count++
    }
}

println("Les 5 premiers nombres pairs :")
afficherNombresPairsOuImpairs(5, true)

println("\nLes 5 premiers nombres impairs :")
afficherNombresPairsOuImpairs(5, false)

fun afficherFibonacci(x: Int) {
    var a = 0
    var b = 1
    for (i in 1..x) {
        println(a)
        val next = a + b
        a = b
        b = next
    }
}

println("\nLes 10 premiers nombres de la suite de Fibonacci :")
afficherFibonacci(10)

fun calculerFactoriel(x: Int = 10): Long {
    var factoriel: Long = 1
    for (i in 1..x) {
        factoriel *= i
    }
    return factoriel
}

println("\nLe factoriel de 5 :")
println(calculerFactoriel(5))

fun afficherNombresPremiers(x: Int) {
    var count = 0
    var number = 2
    while (count < x) {
        if (estPremier(number)) {
            println(number)
            count++
        }
        number++
    }
}

fun estPremier(n: Int): Boolean {
    if (n < 2) return false
    for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) return false
    }
    return true
}

println("\nLes 5 premiers nombres premiers :")
afficherNombresPremiers(5)

