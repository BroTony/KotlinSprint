fun main(){

    val listIngredientsNames: MutableList<String> = mutableListOf("яйца", "молоко", "сливочное масло")
    var listIngredientsVolume: MutableList<Int> = mutableListOf(2, 50, 15)

    println("Введите количество порций")
    val porcions = readln().toInt()
    println("На $porcions порций Вам понадобится")
    for (i in 0..2)
        println("${listIngredientsNames.elementAt(i)} - ${listIngredientsVolume.elementAt(i) * porcions}")

}