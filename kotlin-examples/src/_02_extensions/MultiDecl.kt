package extensions.muli

fun main(args : Array<String>) {

    val map = hashMap(
            1 to "one",
            2 to "two",
            5 to "many"
    )

    for ((num, name) in map) {
        println("$num -> $name")
    }
}




































































val String.indexed: StringIteratorWithIndices
        get() = StringIteratorWithIndices(this)

class StringIteratorWithIndices(val str: String) : Iterator<Pair<Int, Char>> {
    var i = 0

    public override fun next(): Pair<Int, Char> {
        val result = Pair(i, str[i])
        i++
        return result
    }

    public override fun hasNext(): Boolean = i < str.length

}