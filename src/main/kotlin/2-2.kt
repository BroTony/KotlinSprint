fun main(){

    val sotrCount = 50
    val stagCount = 30
    val sotrZP = 30000
    val stagZP = 20000

    val rashodNaSotr = sotrCount * sotrZP
    val obshieZatrati = rashodNaSotr + (stagZP * stagCount)
    val sredneeZP = obshieZatrati / (sotrCount + stagCount)

    println(rashodNaSotr)
    println(obshieZatrati)
    println(sredneeZP)

}