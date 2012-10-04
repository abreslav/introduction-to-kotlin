package _02_extensions.guava

import com.google.common.collect.Collections2.*
import com.google.common.base.Function
import com.google.common.base.Predicate

fun main(args: Array<String>) {
    val list = arrayList("a", "bb", "acc")



    val gl = transform(
        filter(
               list,
               p { s -> s.startsWith("a")}
        ),
        gf { s -> s.length }
    )

    println(gl)











    val kl = list
                .filter { s -> s.startsWith("a") }
                .map { s -> s.length }

    println(kl)

}

fun p<T>(body: (T) -> Boolean): Predicate<T>
        = object : Predicate<T> {
            public override fun apply(p0: T): Boolean {
                return body(p0)
            }

            public override fun equals(p0: Any?): Boolean {
                throw UnsupportedOperationException()
            }
        }

fun gf<T>(body: (String) -> T): Function<String, T>
        = object : Function<String, T> {
            public override fun apply(p0: String): T {
                return body(p0)
            }
            public override fun equals(p0: Any?): Boolean {
                throw UnsupportedOperationException()
            }

        }


