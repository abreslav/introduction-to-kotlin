package numbers

import java.math.BigDecimal
import java.util.ArrayList

fun main(args : Array<String>) {
    val a = BigDecimal("2.0")
    val b = BigDecimal("1.1")

    println(a - b)
}















val String.bd : BigDecimal
  get() = BigDecimal(this)









fun BigDecimal.minus(other : BigDecimal) = this.subtract(other)