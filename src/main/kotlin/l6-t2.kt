fun main(){

    println("Введите количество секунд для таймера")
    var time = readln()!!.toInt()
    while (time >= 0) {
        println("$time")
        Thread.sleep(1000)
        time--
    }

}