package extensions

fun main(args : Array<String>) {
    for (c in "abcd") {
        println(c)
    }
}























operator fun String.iterator() = StringIterator(this)

class StringIterator(val str: String): Iterator<Char> {

    var i = 0

    override fun next(): Char {
        return str[i++]
    }

    override fun hasNext(): Boolean = i < str.length
}