package _03_swing.html

/**
 * @author abreslav 
 */

import java.io.File
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.JScrollPane
import java.util.ArrayList

class Attribute(val name : String, val value : String) {
    override fun toString() = """$name="$value" """
}

abstract class Tag(val name : String) {
    val children : MutableList<Tag> = ArrayList()
    val attributes : MutableList<Attribute> = ArrayList()
    override fun toString() = "<$name${attributes.join(prep = " ")}>${children.join()}</$name>"
}

class HTML : Tag("html")
class Table : Tag("table")
class TR : Tag("tr")
class TD : Tag("td")
class B : Tag("b")
class Text(val text : String) : Tag("b") {
    override fun toString() = text
}

fun <T : Tag> Tag.doInit(t : T, f : T.() -> Unit) : T{
    t.f()
    children.add(t)
    return t
}

fun <T : Tag> T.set(name : String, value : String) : T {
    attributes.add(Attribute(name, value))
    return this
}

fun html(init : HTML.() -> Unit) : HTML {
    val r = HTML()
    r.init()
    return r
}

fun HTML.table(border : Int = 1, init : Table.() -> Unit) = doInit(Table(), init).set("border", border.toString())
fun Table.tr(init : TR.() -> Unit) = doInit(TR(), init)
fun TR.td(align : String = "left", bgcolor: String = "white", init : TD.() -> Unit) = doInit(TD(), init).set("align", align).set("bgcolor", bgcolor)
fun Tag.text(s : Any?) = doInit(Text(s.toString()), {})
fun Tag.bold(s : Any?) = doInit(B(), {text(s)})
















//////////////

fun <T> Collection<T>.join(sep : String = "", prep : String = "") : String {
    val sb = StringBuilder()
    var it = iterator()
    if (it.hasNext()) {
        sb.append(prep)
    }
    while (it.hasNext()) {
        sb.append(it.next())
        if (it.hasNext()) {
            sb.append(sep)
        }
    }
    return sb.toString()
}

