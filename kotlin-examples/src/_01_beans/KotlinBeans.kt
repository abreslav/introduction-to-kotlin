package beans

class User(
        firstName: String,
        lastName: String,
        age: Int) {

    val firstName: String = firstName
    val lastName: String = lastName
    val age: Int = age
}

fun main(args: Array<String>) {
    println(User("John", "Doe", 18))
}