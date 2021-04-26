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
    println("SALÁRIOS MAIORES DO QUE R$ ${refSalario}:")
    filtrarSalario.forEach { println("R$ ${it}") }

    //Filtrando as saídas de salário para contar quantos estão entre R$ 2000,00 e R$ 5000,00.
    val salarioInicial = 2000.0
    val salarioFinal = 5000.0
    println("---------------")
    println("QUANTIDADE DE SALÁRIOS ENTRE R$ ${salarioInicial} e ${salarioFinal}:")
    println(salarios.count { it in salarioInicial..salarioFinal }) //Chamamos essa faixa de RANGE.

    //Filtrando as saídas de salário para buscar no array um valor referido.
    val procurarSalario = 2250.0
    println("---------------")
    println("Buscando salário igual a R$ ${procurarSalario}:")
    println("Resultado: R$ " + salarios.find { it == procurarSalario })

    //Filtrando as saídas de salário para buscar no array qualquer valor onde a expressão seja válida. Se for, "true", senão, "false".
    println("---------------")
    println(salarios.any { it == 1000.0 }) //Expressão verdadeira.
    println(salarios.any { it == 500.0 }) //Expressão falsa.
}