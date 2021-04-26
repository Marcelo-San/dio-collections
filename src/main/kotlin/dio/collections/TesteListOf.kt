package dio.collections

fun main() {
    //Criando os objetos.
    val marcelo = Funcionario("Marcelo", 2000.0)
    val nelson = Funcionario("Nelson", 1500.0)
    val alex = Funcionario("Alex", 4000.0)

    val funcionarios = listOf(marcelo, nelson, alex)

    funcionarios.forEach { println(it) } //Para imprimir cada objeto (it).

    //Buscando os dados de um determinado funcionário.
    println("----------------------")
    val procurarFuncionario = "Alex"
    println(funcionarios.find { it.nome == procurarFuncionario })

    //Ordenando a lista de funcionários através do salário.
    println("----------------------")
    funcionarios.sortedBy { it.salario }.forEach { println(it) }//Aqui, estamos passando como queremos ordenar.
}

//Criando uma classe de dados para os objetos.
data class Funcionario(
    val nome: String,
    val salario: Double
) {
    override fun toString(): String =
        """
            Nome:    $nome
            Salário: R$ $salario
        """.trimIndent()
}