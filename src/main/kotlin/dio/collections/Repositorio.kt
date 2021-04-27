package dio.collections

class Repositorio<T> {
    //Objeto "map" instanciado no "TesteMutableMapOf.kt" e esperando para ser utilizado.
    private val map = mutableMapOf<String, T>()

    fun create(id: String, value: T) {
        map[id] = value
    }

    //Recebe um ID e retorna o valor que está nessa chave.
    fun findById(id: String) = map[id]
}