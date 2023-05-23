package lesson11

fun main() {

    val user1 = User(
        id = 0,
        log = "BroAnton",
        password = "12345",
        email = "anton@mail.com",
    )
    val user2 = User(
        id = 1,
        log = "BroIvan",
        password = "123456",
        email = "Ivan@mail.com",
    )

    user1.printAllDates()
    user2.printAllDates()

}

class User (
    val id: Int,
    val log: String,
    val password: String,
    val email: String,
){

    fun printAllDates() {
        println(id)
        println(log)
        println(password)
        println(email)
    }

}