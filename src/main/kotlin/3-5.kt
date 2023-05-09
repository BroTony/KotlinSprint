fun main(){

    val stroca = "D2-D4:0"
    val from = stroca.substringBefore('-')
    val to = stroca.substringAfter('-').substringBefore(':')
    val num = stroca.substringAfter(':')
    println("$from  $to  $num")

}