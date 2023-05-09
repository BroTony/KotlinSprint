fun main(){

    var weather: Boolean
    var dammage: Boolean
    var matrosCount: Byte
    var boxCount: Byte

    println("Eсть ли повреждения корпуса?")
    dammage = readLine()!!.toBoolean()
    println("Текущая численность экипажа")
    matrosCount = readln().toByte()
    println("Текущее количество ящиков провизии")
    boxCount = readln().toByte()
    println("Благоприятны ли метеоусловия")
    weather = readln().toBoolean()
    println("Разрешение на выход: ${(matrosCount in 56 .. 69 && boxCount > 50 && !dammage) || 
            (dammage && matrosCount in 70..70 && weather && boxCount > 50)} ")

}