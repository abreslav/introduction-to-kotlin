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
    val john = User("John", "Doe", 31)
    val jane = User("Jane", "Doe", 29)
    val poss = User("Possibly", "Maybe", 12)


















    val users = arrayList(john, jane, poss)

    for (user in users) {
        println(user)
    }














    val byNickName = hashMap(
            "Johny" to john,
            "Jan" to jane,
            "Boo" to poss
    )

    println(
        byNickName["Jan"]
    )

    byNickName["Foo"] = poss





    for ((name, user) in byNickName) {
        println("$name -> $user")
    }
}