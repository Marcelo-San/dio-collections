package dio.collections

fun main() {
    //Criando os objetos.
    val marcelo = Funcionario("Marcelo", 1000.0)
    val nelson = Funcionario("Nelson", 2000.0)
    val alex = Funcionario("Alex", 4000.0)

    val funcionarios = listOf(marcelo, nelson, alex)

    funcionarios.forEach { println(it) } //Para imprimir cada objeto (it).

    //Buscando os dados de um determinado funcionário.
    val procurarFuncionario = "Marcelo"
    funcionarios.find { it.nome == procurarFuncionario }
}

//Criando uma classe de dados para os objetos.
data class Funcionario(
    val nome: String,
    val salario: Double
) {
    override fun toString(): String =
        """
            ____________________
            Nome:    $nome
            Salário: R$ $salario
        """.trimIndent()
}