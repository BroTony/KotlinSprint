fun main(){

    println("Введите количество ингридиентов")
    val volumeMassive = readln().toInt()
    val arrayOfIngredients = arrayOfNulls<String>(volumeMassive)

    println("Напишите ингридиенты")
    for (i in 1..volumeMassive)
        arrayOfIngredients[i-1] = readln()

}