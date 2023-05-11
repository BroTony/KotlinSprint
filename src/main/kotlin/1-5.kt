fun main(){

    val seconds = 6480
    var minute = seconds / 60
    var ostatokSeconds = seconds % 60

    print(minute)
    print(":")
    if (ostatokSeconds < 10) {
        print("0")
        print(ostatokSeconds)
    }
    else
        println(ostatokSeconds)

}