fun main(){

    println("Придумайте логин")
    val log = readln()
    println("придумайте пароль")
    val password = readln()
    do {
        println("Enter password")
        var psw = readln()
        if (psw == password)
            println("Welcome")
    } while (psw != password)

}