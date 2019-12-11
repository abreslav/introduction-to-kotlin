package swing.demo

import kool.swing.*
import javax.swing.*

val greeting = "Hello,\n\nEnter some text here!"

fun main(args : Array<String>) {
    JFrame("Demo") {
        heightInt = 400
        widthInt = 400

        val text = JTextArea(greeting)
        center = text

        south = JPanel {
            west = JButton("Clear") {
                text.setText("")
            }

            east = JButton("Restore") {
                text.setText(greeting)
            }
        }
    }.show()
}