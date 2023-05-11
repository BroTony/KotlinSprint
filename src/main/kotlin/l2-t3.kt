fun main(){

    val hourStart = 9
    val minuteStart = 39
    val time = 457
    val hourEnd = hourStart + (minuteStart + time) / 60
    val minuteEnd = (minuteStart + time) % 60

    if (minuteEnd < 10)
        print("$hourEnd:0$minuteEnd")
    else
        print("$hourEnd:$minuteEnd")

}