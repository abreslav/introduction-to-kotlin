package _05_nulls

import java.io.File

fun main(args : Array<String>) {
    val files = File("test").listFiles()

    // println(files.size)

    // if (files == null) return
    // if (files == null) fail()














    if (files != null) {
        println(files.size)
    }













//    if (files == null) return
//    println(files.size)











    println(files?.size)















    println(files?.size ?: "no files")
}

fun fail() = throw IllegalArgumentException()