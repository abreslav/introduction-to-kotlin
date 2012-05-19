package _05_nulls

import java.io.File
import java.util.List

fun main(args : Array<String>) {
    val files = File("test").listFiles()









    if (files != null) {
        println(files.size)
    }













//    if (files == null) return
//    println(files.size)











    println(files?.size)















    println(files?.size ?: "no files")
}