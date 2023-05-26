fun main(){

    var human1 = Human("Ivan", "nise picture", "разговаривает")
    var human2 = Human("Anton", "good picture", "микрофон выключен")
    var human3 = Human("Sweta", "best picture", "пользователь заглушен")

    var room1 = Room("avatar1","boys room", listOf(human1, human2) )
    var room2 = Room("avatar2","women room", listOf(human3) )

}

class Human(
    val name: String,
    var avatar: String,
    var status: String,
){

}

class Room(
    var avatar: String,
    var name: String,
    var humans: List<Human>,
){

}
