fun main(){

    val arrayOfProducts: Array<String> = arrayOf("соль", "перец", "говядина", "масло")
    println("какой элемент хотите найти?")
    val searchProduct = readln()

    for (i in arrayOfProducts){
        if (i == searchProduct){
            println("Ингредиент $searchProduct в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")

}