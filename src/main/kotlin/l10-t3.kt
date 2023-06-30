import java.lang.StrictMath.random
fun main(){

    val lenght = readln().toInt()
    println(generationPassword(lenght))

}

fun generationPassword(lenght: Int): String? {

    var charSet = ('0'..'9') + ",./'\"?!@#$%&*() "
    var password = ""

    for (i in 1..lenght)
        password = password.plus(charSet.random())
    return password

}