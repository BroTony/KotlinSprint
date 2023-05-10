fun main(){

    println("Придумайте логин")
    val log = readln()
    println("придумайте пароль")
    val password = readln()

    do {
        println("Enter password")
        var passwordRepeat = readln()
        if (passwordRepeat == password)
            println("Welcome")
    } while (passwordRepeat != password)

}
