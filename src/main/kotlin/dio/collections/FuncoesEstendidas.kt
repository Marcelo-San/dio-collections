package dio.collections

import java.math.BigDecimal

//Estamos usando uma função estendida ("somatoria()") para um Array do tipo BigDecimal, que vai reduzir a somatória de tudo que estiver no valor.
fun Array<BigDecimal>.somatoria() = this.reduce {
        acc, valor -> acc + valor
}

//Outra função estendida ("media()").
fun Array<BigDecimal>.media() =
    if(this.isEmpty()) BigDecimal.ZERO
    else this.somatoria() / this.size.toBigDecimal()