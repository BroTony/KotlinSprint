fun main(){

    println("Введите логин")
    val log = readln()
    if (log == "Batman"){
        println("Введите пароль, Брюс Уэйн")
        val password = readln()
        if (password == "password")
            println("Это Вы, Брюс, система узнала Вас по криптостойкому паролю, никто бы его не угадал")
        else
            println("До Бэтмена не дотягиваешь, мышонок")

    }
    else
        println("Может зарегистрируйтесь, у нас тут есть Бэтмен с паролем, который не угадаете")

}