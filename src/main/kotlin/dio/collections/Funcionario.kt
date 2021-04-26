package dio.collections

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