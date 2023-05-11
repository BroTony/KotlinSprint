fun main(){

    var generatePassword:Int
    var testPassword:Int

    do {
        generatePassword = (1000..9999).random()
        println("Ваш код авторизации: $generatePassword")
        testPassword = readln().toInt()
        if (generatePassword == testPassword)
            println("Приветствую, человек")
    } while (generatePassword != testPassword)

}