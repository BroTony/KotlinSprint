fun main(){

    val numTrue1 = (1..100).random()
    val numTrue2 = (1..100).random()
    println("введите число 1")
    val num1 = readln()!!.toInt()
    println("введите число 2")
    val num2 = readln()!!.toInt()
    if (num1 != numTrue1 && num1 != numTrue2 && num2 != numTrue1 && num1 != numTrue2)
        println("Неудача! Крутите барабан, числа были $numTrue1 и $numTrue2")
    else if ((num1 == numTrue1 && num2 == numTrue2) || (num2 == numTrue1 && num1 == numTrue2))
        println("Поздравляем, числа были $numTrue1 и $numTrue2! Вы выиграли главный приз!")
    else
        println("Вы выиграли утешительный приз, числа были $numTrue1 и $numTrue2!")

}