fun main(){

    val goodDay = Weathter()
        goodDay.tempDay = 30
        goodDay.tempNight = 20
        goodDay.isRain = false
    val badDay = Weathter()
        badDay.tempDay = 10
        badDay.tempNight = 0
        badDay.isRain = true

}

class Weathter {
    var tempDay = 20
    var tempNight = 10
    var isRain = false

    init {
        println("температура днём $tempDay")
        println("температура ночью $tempNight")
        println("наличие дождя $isRain")
    }
}
