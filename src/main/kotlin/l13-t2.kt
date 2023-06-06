fun main(){

    val contact = TelBook("Anton", 89670604004)

    contact.print()

}

class TelBook(val name: String, val number: Long, val company: String? = null){
    val companyToPrint: String = company ?: "не указано"
    fun print(){
        println("Имя:$name")
        println("Номер:$number")
        println("Компания:$companyToPrint")
    }

}