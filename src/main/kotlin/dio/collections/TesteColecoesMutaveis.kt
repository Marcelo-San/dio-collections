package dio.collections

fun main() {
    val nelson = Funcionario("Nelson", 2000.0, "CLT")
    val marcelo = Funcionario("Marcelo", 1500.0, "PJ")
    val luciani = Funcionario("Luciani", 4000.0, "CLT")

    println("----- LIST -----")
    //Essa é uma lista mutável, na qual podemos fazer alterações nela, mesmo após inicializá-la.
    val funcionarios = mutableListOf(nelson, luciani)
    funcionarios.forEach { println(it) }

    println("----------------")
    funcionarios.add(marcelo)
    funcionarios.forEach { println(it) }

    println("----------------")
    funcionarios.remove(nelson)
    funcionarios.forEach { println(it) }

    println("----- SET -----")
    //Um dos requisitos do SET é não repetir elementos na saída.
    val funcionarioSet = mutableSetOf(nelson)
    funcionarioSet.forEach { println(it) }

    println("---------------")
    funcionarioSet.add(marcelo)
    funcionarioSet.add(luciani)
    funcionarioSet.forEach { println(it) }

    println("---------------")
    funcionarioSet.remove(luciani)
    funcionarioSet.forEach { println(it) }
}