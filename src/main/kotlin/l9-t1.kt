fun main(){

    val listProducts: List<String> = listOf("лаваш", "овощи", "мясщ")
    println("В рецепте есть следующие ингридиенты:")
    println("$listProducts")

    for (i in listProducts)
        println("$i")

}