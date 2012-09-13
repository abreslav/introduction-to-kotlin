package _03_swing.html

import javax.swing.JFrame
import javax.swing.JScrollPane
import javax.swing.JLabel

fun render() : String {
    return html {

        table {
            tr {
                td { bold("Title") }
                td {
                    text("Life in HTML")
                }
            }
            tr {
                td { bold("Author") }
                td {
                    text("Andrey")
                }
            }
            tr {
                td { bold("Description") }
                td {
                    text("Display steps of Life evolution in HTML")
                }
            }
        }


    }.toString()
}

fun main(args : Array<String>) {
    val frame = JFrame("HTML")
    frame.setSize(800, 600)
    val scrollPane = JScrollPane(JLabel(
            render()
    ))
    frame.add(scrollPane)
    frame.show()
}
