fun main(){

    val timer = readln().toInt()

    for (i in timer downTo 1){
        println("$i")
        Thread.sleep(1000)
    }
    println("Время вышло")

}