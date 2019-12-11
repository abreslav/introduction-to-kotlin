package _08_collections

import java.util.ArrayList

fun print(list: List<Any>) {
    for (x in list) {
        println(x)
    }
}

fun main(args: Array<String>) {
    val l: ArrayList<Int> = arrayListOf(1, 2, 3)

    print(l)
}
