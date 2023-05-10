fun main(){

    println("Введите количество секунд для таймера")
    var time = readln()!!.toInt()
    var count = time
    while (count > 0) {
        Thread.sleep(1000)
        count--
    }
    println("прошло $time секунд")

}