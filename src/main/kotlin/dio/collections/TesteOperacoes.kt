package dio.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0, 4500.65)

    println("SALÁRIOS:")
    for (salario in salarios){
        println("R$ ${salario}")
    }

    println("---------------")
    println("Maior salário: R$ ${salarios.maxOrNull()}") //A função "max()" está depreciada nesta nova versão.
    println("Menor salário: R$ ${salarios.minOrNull()}") //A função "min()" também está depreciada nesta nova versão.
    println("Média salarial: R$ ${salarios.average()}")

    //Filtrando as saídas de salário para listar somente os maiores do que o referenciado.
    val refSalario = 2200.55
    val filtrarSalario = salarios.filter { it > refSalario }
    println("---------------")
    println("SALÁRIOS MAIORES DO QUE R$ ${refSalario}: ")
    filtrarSalario.forEach { println("R$ ${it}") }
}