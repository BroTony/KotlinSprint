fun main(){

    val sun = true
    val tentOpen = true
    val humidity = 20
    val winter = true
    println("Благоприятные ли условия сейчас для роста бобовых? ${sun && tentOpen && humidity <= 20 && !winter}")

}