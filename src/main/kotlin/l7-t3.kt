fun main(){

    println("Введите число, до которого вывести все чётные числа")
    val numberFinal = readln().toInt()

    for (i in 2..numberFinal step 2)
            println("$i")

}