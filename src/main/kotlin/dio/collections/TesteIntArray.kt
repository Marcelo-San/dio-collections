package dio.collections

fun main() {
    // Instanciando um objeto (“IntArray()”) dentro de “values”, para termos uma referência para o Array.
    val values = IntArray(5)
    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    for (valor in values) {
        println(valor) //Aqui, é explícito o uso da variável.
    }

    println("----------------------")
    values.forEach {
        println(it) //Já aqui, o “it” faz a representação da variável “valor”.
    }

    println("----------------------")
    //Podemos fazer também dessa forma abaixo, só que perderemos a referência para o “it”.
    values.forEach{ valor ->
        println(valor)
    }

    println("----------------------")
    for(index in values.indices) {
        println(values[index])
    }

    println("----------------------")
    values.sort()
    for(valor in values) {
        println(valor)
    }
}