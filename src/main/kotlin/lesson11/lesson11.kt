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