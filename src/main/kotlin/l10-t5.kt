fun main(){

    val loginTrue = creatLog()
    val passwordTrue = createPassword()

    var test: Boolean

    do {
        test = logPassInitialization(loginTrue, passwordTrue)
    }
    while (test == false)

    do {
        test = finalCheck()
    }
    while (test == false)

    println("авторизация прошла успешно")

}

fun creatLog(): String {
    println("Придумайте логин")
    var log = readln()

    while (log.length < 4) {
        println("Придумайте более длинный логин")
        log = readln()
    }
    return log

}

fun createPassword(): String {

    var password = ""
    var charSet = ('a'..'z') + ('A'..'Z')

    for (i in 0..4)
        password = password.plus(charSet.random())
    println("Ваш пароль $password")
    return password

}

fun logPassInitialization(logTrue: String, passTrue: String): Boolean {

    println("Введите логин")
    var login = readln()
    println("Введите пароль")
    var password = readln()
    return login == logTrue && password == passTrue

}

fun finalCheck(): Boolean {

    var charSet = ('0'..'9')
    var password = ""

    for (i in 0..3)
        password = password.plus(charSet.random())

    println("Введите код $password")
    var inputPassword = readln()
    return inputPassword == password

}