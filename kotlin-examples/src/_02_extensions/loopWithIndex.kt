package _02_extensions.loopWithIndex

fun main(args: Array<String>) {
    val list = arrayList("a", "b", "c")
    list.loopWithIndex({i, v -> println("list[$i] = $v")})
}

fun <T> Iterable<T>.loopWithIndex(body: (index: Int, value: T) -> Unit) {
    var i = 0
    for (v in this) {
        body(i, v)
        i++
    }
}