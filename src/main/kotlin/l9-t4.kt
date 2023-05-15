fun main(){

    var listIngredients: MutableList<String>  = mutableListOf()
    println("Введите список ингридиентов")
    var string = readln()

    listIngredients.add(0, string.substringBefore(','))
    listIngredients.add(1, string.substringAfter(' ').substringBefore(','))
    listIngredients.add(2, string.substringAfter(' ').substringAfter(' ').substringBefore(','))
    listIngredients.add(3, string.substringAfter(' ').substringAfter(' ').substringAfter(' ').substringBefore(','))
    listIngredients.add(0, string.substringAfter(' ').substringAfter(' ').substringAfter(' ').substringAfter(' '))
    listIngredients.sort()
    println(listIngredients)

}