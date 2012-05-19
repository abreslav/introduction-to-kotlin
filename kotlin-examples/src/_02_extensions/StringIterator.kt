package extensions

fun main(args : Array<String>) {
    for (c in "abcd") {
        println(c)
    }
}

















fun String.iterator() = StringIterator(this)

class StringIterator(val str : String) {

    var i = 0

    fun next() : Char {
        return str[i++]
    }

    val hasNext : Boolean
      get() = i < str.length
}