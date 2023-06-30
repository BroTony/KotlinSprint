fun main(){

    val passwordLenght = readln().toInt()

    for (i in 1..passwordLenght){
        var randomForSymbol = (0..1).random()
        if (randomForSymbol == 1)
            print("${(0..9).random()}")
        else
            print("${('a'..'z').random()}")
    }

}