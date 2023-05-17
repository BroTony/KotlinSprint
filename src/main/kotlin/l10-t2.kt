fun main(){

    println("Введите логин или пароль")
    val password = readln()

    if (сheck(password) == true)
        println("Здравствуйте")
    else if (сheck(password) == false)
        println("Логин или пароль недостаточно длинные")

}

fun сheck(password: String): Boolean = password.length >= 4