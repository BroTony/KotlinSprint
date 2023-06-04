fun main(){

    val goodDay = Weathter3(30, 20, false)
    val badDay = Weathter3(10, 0)

}

class Weathter3(val tempDay: Int, val tempNight: Int, var isRain: Boolean = true) {

    init{

        println("температура днём $tempDay")
        println("температура ночью $tempNight")
        println("наличие дождя $isRain")

    }

}