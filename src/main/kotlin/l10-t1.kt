import java.lang.StrictMath.random

fun main(){

    val humanThrow = throwCube()
    println("человечище выбросило $humanThrow")
    val robotThrow = throwCube()
    println("робот выбросил $robotThrow")

    if (humanThrow > robotThrow)
        println("Победило человечество")
    else if (humanThrow < robotThrow)
        println("Победили роботы")
    else // (humanThrow == robotThrow)
        println("Ничья")

}

fun throwCube(): Int = (1..6).random() + (1..6).random()