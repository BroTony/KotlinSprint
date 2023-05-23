package lesson11

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