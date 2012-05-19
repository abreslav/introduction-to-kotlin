package beans

class User(
        firstName: String,
        lastName: String,
        age: Int) {

    val firstName: String = firstName
    val lastName: String = lastName
    val age: Int = age

    public fun toString(): String {
        return "$firstName $lastName, age $age"
    }
}

fun main(args: Array<String>) {
    println(User("John", "Doe", 18))
}