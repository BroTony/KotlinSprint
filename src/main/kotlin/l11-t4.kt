fun main(){

    var wifeAndTwoGirlfriends = telephoneBook("","First Name","Second Name","89999994242",
        "89998884242","mail@email.ru","userName","userName","userName")

}

class telephoneBook(
    var avatar: String,
    var firstName: String,
    var secondName: String,
    var mobileNumber: String,
    var nomeNumber: String,
    var icloud: String,
    var wife: String,
    var girlfriend1: String,
    var girlfriend2: String,
){

    fun sendMessege(){
        println("сообщение написано")
    }

    fun call(){
        println("идёт вызов")
    }

    fun videoCall(){
        println("идёт видеовызов")
    }

    fun sendEmail(){
        println("отправить сообщение")
    }

    fun faceTimeCall(){
        println("звонок по фейстайму")
    }

    fun faceTimeVideo(){
        println("видеозвонок по фейстайму")
    }

}