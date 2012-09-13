package _02_extensions

import beans.User
import java.util.Arrays
import java.util.ArrayList
import java.util.Collections

fun main(args : Array<String>) {
    val users = list(
            User("John", "Doe", 31),
            User("Jane", "Doe", 29)
    )




    val over30 = users.filter({ u -> u.age > 30 })






//    val over30 = users.filter{ u -> u.age > 30 }
//    val over30 = users.filter<User>({ (u : User) : Boolean -> u.age > 30 })









    println("${over30.size()} user(s) over 30 years old")








    val youngestOver20 = users filter {u -> u.age > 20 } min {a, b -> a.age - b.age}
    println("Youngest over 20: $youngestOver20")
}

fun <T> list(vararg items : T) : List<T> {
    val r = ArrayList<T>()
    for (i in items) {
        r.add(i)
    }
    return r
}

fun <T> Collection<T>.filter(predicate : (T) -> Boolean) : List<T> {
    val r = ArrayList<T>()
    for (item in this) {
        if (predicate(item)) {
            r.add(item)
        }
    }
    return r
}

//fun <T> Collection<T>.filter(predicate : T.() -> Boolean) : List<T> {
//    return filter {x -> x.predicate()}
//}

fun <T> Collection<T>.min(compare : (T, T) -> Int) : T? {
    if (isEmpty()) return null
    val i = iterator()
    var min = i.next()
    while (i.hasNext()) {
        val next = i.next()
        if (compare(min, next) > 0) {
            min = next
        }
    }
    return min
}