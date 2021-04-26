package dio.collections

fun main() {
    //Criando os objetos.
    val marcelo = Funcionario("Marcelo", 2000.0, "PJ")
    val nelson = Funcionario("Nelson", 1500.0, "CLT")
    val alex = Funcionario("Alex", 4000.0, "CLT")

    //Abaixo, são conjuntos e não listas.
    val funcionarios1 = setOf(marcelo, nelson)
    val funcionarios2 = setOf(alex)

    //Queremos que o relatório seja gerado com todos os funcionários. Então, unimos os conjuntos.
    println("UNIÃO")
    println("---")
    val relatorioUnion = funcionarios1.union(funcionarios2)
    relatorioUnion.forEach { println(it) }

    //Criando um terceiro conjunto.
    println("------------------------")
    println("SUBTRAÇÃO")
    println("---")
    val funcionarios3 = setOf(marcelo, nelson, alex)
    val relatorioSubtract = funcionarios3.subtract(funcionarios2)//Subtrai do conjunto 3 o que há de comum entre ele e o conjunto 2.
    relatorioSubtract.forEach { println(it) }

    //Fazendo uma interseção de elementos entre os conjuntos.
    println("------------------------")
    println("INTERSEÇÃO")
    println("---")
    val relatorioIntersect = funcionarios3.intersect(funcionarios2)//Mostra o que há de comum entre esses dois conjuntos.
    relatorioIntersect.forEach { println(it) }
}