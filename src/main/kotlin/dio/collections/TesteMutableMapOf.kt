package dio.collections

fun main() {
    val marcelo = Funcionario("Marcelo", 2000.0, "PJ")
    val nelson = Funcionario("Nelson", 1500.0, "CLT")
    val alex = Funcionario("Alex", 4000.0, "CLT")

    //Instanciando o repositório.
    val repositorio = Repositorio<Funcionario>()

    repositorio.create(marcelo.nome, marcelo)
    repositorio.create(nelson.nome, nelson)
    repositorio.create(alex.nome, alex)

    println(repositorio.findById(marcelo.nome))
}