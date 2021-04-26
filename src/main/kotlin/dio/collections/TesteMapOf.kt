package dio.collections

fun main() {
    val pair: Pair<String, Double> = Pair("João", 1000.0)
    val map1 = mapOf(pair) //O "pair" se torna aqui um elemento de mapa.

    //Nós temos uma função lambda: "(k, v)".
    //k = key. v = valor.
    map1.forEach { (k, v) -> println("Chave: $k - Valor: $v") }

    //Abaixo, é um tipo de sintaxe, fácil de compreender e fazer.
    val map2 = mapOf(
        "Pedro" to 2500.0,
        "Maria" to 3000.0
    )

    map2.forEach { (k, v) -> println("Chave: $k - Valor: $v") }
}