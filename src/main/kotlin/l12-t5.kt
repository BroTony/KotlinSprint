import java.lang.StrictMath.random
import kotlin.random.Random

fun main(){

    val listOfDays: MutableList<Weathter> = mutableListOf()
    var mediumDayTemp = 0
    var mediumNightTemp = 0
    var mediumBar = 0
    var rainDayCount = 0

    for (i in 0..9)
        listOfDays.add(i, Weathter((10..30).random(), (-4..10).random(), (650..800).random(), Random.nextBoolean()))

    for (i in 0..9){

        mediumDayTemp = mediumDayTemp + listOfDays[i].dayTemp
        mediumNightTemp = mediumNightTemp + listOfDays[i].nightTemp
        mediumBar = mediumBar + listOfDays[i].bar
        if (listOfDays[i].isRain == true)
            rainDayCount++

    }
    mediumDayTemp = mediumDayTemp / 10
    mediumNightTemp = mediumNightTemp / 10
    mediumBar = mediumBar / 10

    println("среднее давление за 10 дней равно $mediumBar")
    println("средняя дневная температура за 10 дней равна $mediumDayTemp")
    println("средняя ночная температура за 10 дней равно $mediumNightTemp")
    println("количество дождливых дней за 10 дней составило $rainDayCount")

}

class Weathter(val dayTemp: Int, val nightTemp:Int, val bar: Int, val isRain: Boolean)