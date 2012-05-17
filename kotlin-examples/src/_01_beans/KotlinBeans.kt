package beans

class User(
        val firstName: String,
        val lastName: String,
        val age: Int = 18) {

    public fun toString(): String {
        return "$firstName $lastName, age $age"
    }
}

fun main(args: Array<String>) {
    println(User("John", "Doe", 18))
    println(User("John", "Doe"))
}

