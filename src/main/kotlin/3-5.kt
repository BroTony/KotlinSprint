fun main(){

    val inFile = "D2-D4:0"
    val from = inFile.substringBefore('-')
    val to = inFile.substringAfter('-').substringBefore(':')
    val num = inFile.substringAfter(':')
    println("$from  $to  $num")

}