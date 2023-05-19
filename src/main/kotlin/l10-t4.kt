fun main(){

    var humanWinsCount = 0
    var answer: String

    do {

        humanWinsCount = humanWinsCount + round()
        println("Хотите бросить кости ещё раз? Введите да или нет")
        answer = readln()

    } while (answer == "да")

    println("Человечище выиграло $humanWinsCount партий")

}

fun throwCube(): Int = (1..6).random() + (1..6).random()

fun round (): Int {

    val humanThrow = throwCube()
    println("человечище выбросило $humanThrow")
    val robotThrow = throwCube()
    println("робот выбросил $robotThrow")

    if (humanThrow > robotThrow) {
        println("Победило человечество")
        return 1
    }
    else if (humanThrow < robotThrow) {
        println("Победили роботы")
        return 0
    }
    else {
        println("Ничья")
        return 0
    }

}