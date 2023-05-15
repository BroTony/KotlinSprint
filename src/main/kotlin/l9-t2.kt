fun main(){

    var listProducts: MutableList<String> = mutableListOf("лаваш", "овощи", "мясо")
    println("В рецепте есть следующие ингридиенты: $listProducts")
    println("Желаете добавить ещё?")
    val add = readln()
    if (add == "нет")
        return
    else if (add == "да"){
        println("Какой ингридиент Вы хотите добавить?")
        listProducts.add(readln())
        println("Теперь в рецепте есть следующие элементы: $listProducts")
    }

}