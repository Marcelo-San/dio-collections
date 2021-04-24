package dio.collections

fun main() {
    val values = intArrayOf(2, 3, 4, 1, 10, 7)

    values.forEach {
        println(it) //O “it” faz a representação da variável “values”.
    }

    //Ordenando a impressão.
    println("----------------------------")
    values.sort()
    values.forEach {
        println(it)
    }

}