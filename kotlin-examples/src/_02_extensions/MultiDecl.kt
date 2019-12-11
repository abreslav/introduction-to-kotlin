package extensions.muli

import java.awt.Point
import java.util.regex.Pattern
import java.util.ArrayList

fun main(args : Array<String>) {

    val (x, y) = Point(1, 2)
    println("($x, $y)")

//    testMultiReturn()
//    testIndexedIteration()
}

operator fun Point.component1() = x
operator fun Point.component2() = y
















fun testMultiReturn() {
    val (file, line) = parseFileNameAndLine("Foo12.java:12")

    println("Line $line in $file")
}




data class Location(val fileName: String, val line: Int)

fun parseFileNameAndLine(str: String): Location {
    val m = str.toGroupsByRegex("([\\w\\.]+):(\\d+)")
    if (m == null) {
        throw IllegalArgumentException("String format is wrong: '$str', must be <file-name>:<line>")
    }
    return Location(m[1], m[2].toInt())
}















fun testIndexedIteration() {
    for ((i, c) in "abcd".indexed) {
        println("s[$i] = $c")
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
















fun String.toGroupsByRegex(regex: String): List<String>? {
    val m = Pattern.compile(regex).matcher(this)
    if (!m.matches()) return null
    val result = ArrayList<String>()
    for (g in 0..m.groupCount()) {
        result.add(m.group(g)!!)
    }
    return result
}
