fun main() {

    val arrayOfProducts: Array<String> = arrayOf("соль", "перец", "говядина", "масло")
    println("какой элемент хотите найти?")
    val searchProduct = readln()
    var testIngredient = -1

    testIngredient = arrayOfProducts.indexOf(searchProduct)
    if (testIngredient >= 0)
    println("Ингредиент $searchProduct в рецепте есть")
    else
    println("Такого ингредиента в рецепте нет")

}