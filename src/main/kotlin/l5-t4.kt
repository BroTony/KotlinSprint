fun main(){

    println("Введите логин")
    val login = readln()

    if (login == LOGIN_BATMAN){
        println("Введите пароль, Брюс Уэйн")
        val password = readln()
        if (password == PASSWORD_HERO)
            println("Это Вы, Брюс, система узнала Вас по криптостойкому паролю, никто бы его не угадал")
        else
            println("До Бэтмена не дотягиваешь, мышонок")

    }
    else
        println("Может зарегистрируйтесь, у нас тут есть Бэтмен с паролем, который не угадаете")

}
const val LOGIN_BATMAN = "Batman"
const val PASSWORD_HERO = "password"