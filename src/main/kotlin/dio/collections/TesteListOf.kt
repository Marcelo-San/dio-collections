package dio.collections

fun main() {
    //Criando os objetos.
    val marcelo = Funcionario("Marcelo", 2000.0, "PJ")
    val nelson = Funcionario("Nelson", 1500.0, "CLT")
    val alex = Funcionario("Alex", 4000.0, "CLT")

    val funcionarios = listOf(marcelo, nelson, alex)

    funcionarios.forEach { println(it) } //Para imprimir cada objeto (it).

    //Buscando os dados de um determinado funcionário.
    println("----------------------")
    val procurarFuncionario = "Alex"
    println(funcionarios.find { it.nome == procurarFuncionario })

    //Ordenando a lista de funcionários através do salário.
    println("----------------------")
    funcionarios.sortedBy { it.salario }.forEach { println(it) }//Aqui, estamos passando como queremos ordenar.

    //Agrupando a lista de funcionários por categoria CLT.
    println("----------------------")
    funcionarios
        //Aqui, estamos passando como queremos agrupar (tipoContratacao). A nossa categoria vai virar uma "chave".
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }
}

//Criando uma classe de dados para os objetos.
data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
) {
    override fun toString(): String =
        """
            Nome:    $nome
            Salário: R$ $salario
        """.trimIndent()
}