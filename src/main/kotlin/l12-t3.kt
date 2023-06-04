fun main(){

    val goodDay = Weathter3(30, 20, false)
    goodDay.print()
    val badDay = Weathter3(10, 0)
    badDay.print()

}

class Weathter3(val tempDay: Int, val tempNight: Int, var isRain: Boolean = true) {

    fun print(){

        println("температура днём $tempDay")
        println("температура ночью $tempNight")
        println("наличие дождя $isRain")

    }

}