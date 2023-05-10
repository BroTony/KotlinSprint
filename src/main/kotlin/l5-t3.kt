fun main(){

    val numTrue1 = 69
    val numTrue2 = 11
    println("введите число 1")
    val num1 = readln()!!.toInt()
    println("введите число 2")
    val num2 = readln()!!.toInt()
    if (num1 != numTrue1 && num1 != numTrue2 && num2 != numTrue1 && num1 != numTrue2)
        println("Неудача! Крутите барабан")
    else if ((num1 == numTrue1 && num2 == numTrue2) || (num2 == numTrue1 && num1 == numTrue2))
        println("Поздравляем! Вы выиграли главный приз!")
    else
        println("Вы выиграли утешительный приз!")

}