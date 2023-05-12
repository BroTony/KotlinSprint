fun main(){

    println("Введите год рождения")
    val yearNow = 2023
    val yearBorn = readln().toInt()
    if ((yearNow - yearBorn) < AGE_OF_MAGORITY)
       println("Доступ закрыт")
    else
        println("Показать экран со скрытым контентом")

}
const val AGE_OF_MAGORITY = 18