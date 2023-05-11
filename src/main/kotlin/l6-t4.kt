fun main (){

    val numbWin = (1..9).random()
    var count = 0
    var numb:Int

    do {
        println("Введите число от 1 до 9")
        numb = readln()!!.toInt()
        if (numb == numbWin)
            println("Это была великолепная игра")
        count++
    } while (numb != numbWin && count < 5)
    if (numb != numbWin && count==5)
    println("Было загадано число $numbWin")

}