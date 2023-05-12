fun main(){

    val arrayOfViews = arrayOf(8, 11, 8, 58, 89, 0, 10)
    var countViews = 0

    for (i in arrayOfViews)
        countViews = countViews + i
    println("количество просмотров за неделю равно $countViews")


}