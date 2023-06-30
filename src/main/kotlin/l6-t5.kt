fun main(){

    println("Придумайте логин")
    val log = readln()
    println("придумайте пароль")
    val password = readln()
    var count = 0
    var numberCapcha1:Int
    var numberCapcha2:Int
    var numberTest:Int

    do {
        println("Enter password")
        var passwordRepeat = readln()
        if (passwordRepeat == password) {
            do {
                numberCapcha1 = (1..9).random()
                numberCapcha2 = (1..9).random()
                println("Решите уравнение $numberCapcha1 + $numberCapcha2")
                numberTest = readln().toInt()
                if (numberTest == numberCapcha1 + numberCapcha2)
                    println("Welcome")
                count++
            } while (count <3 && numberTest != numberCapcha1 + numberCapcha2)
            if (numberTest != numberCapcha1 + numberCapcha2)
                println("Доступ запрещён")
        }
    } while (passwordRepeat != password)

}