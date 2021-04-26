package dio.collections

fun main() {
    //Array de nomes.
    //val nomes = Array<String>(3) {""} <- Declarando explicitamente.
    val nomes = Array(3) {""} //Classe Array. Como inicializa uma String, ele já sabe que os dados são do tipo String.
    nomes[0] = "Marcelo"
    nomes[1] = "Alex"
    nomes[2] = "Nelson"

    for(nome in nomes){
        println(nome)
    }

    //Ordenando.
    println("----------------------")
    nomes.sort()
    nomes.forEach { println(it) }

    //Usando o "arrayOf()".
    println("----------------------")
    val funcionario = arrayOf("Marcelo", "Alex", "Nelson")
    funcionario.sort()
    funcionario.forEach { println(it) }
}