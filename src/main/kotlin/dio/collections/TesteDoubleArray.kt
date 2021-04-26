package dio.collections

fun main() {
    val salarios = DoubleArray(3) //Atribuindo para cada posição um valor.
    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 500.0

    //Usando uma expressão lambda para o FOR. Uma função de função.
    salarios.forEach { println("R$ " + it) } //Concatenando.

    println("----------------------------")
    //Cria-se um objeto chamado "aumentoSalario".
    salarios.forEachIndexed { index, aumentoSalario ->
        salarios[index] = aumentoSalario * 1.1
    }

    salarios.forEach { println("R$ $it") } //Outro tipo de concatenação.

    println("----------------------------")
    val salario2 = doubleArrayOf(1500.0, 1250.0, 5000.0)
    salario2.sort()
    salario2.forEach { println("R$ $it") }
}