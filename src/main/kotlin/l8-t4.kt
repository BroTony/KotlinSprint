fun main() {

    val arrayOfProducts: Array<String> = arrayOf("соль", "перец", "говядина", "масло")
    for (i in arrayOfProducts)
        println("$i")
    println("какой элемент хотите заменить?")
    val searchProduct = readln()
    var testIngredient = -1

    testIngredient = arrayOfProducts.indexOf(searchProduct)
    if (testIngredient == - 1)
        println("Такого ингредиента в рецепте нет")
    else {
        println("Какой ингридиент хотите добавить?")
        val newIngredient = readln()
        arrayOfProducts[testIngredient] = newIngredient
        println("Готово, Вы сохранили следующий список ингридиентов:")
        for (i in arrayOfProducts)
            println("$i")
    }

}