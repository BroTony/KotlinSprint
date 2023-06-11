fun main(){

    val listOfContacts: MutableList<ContactTask3> = mutableListOf()

    listOfContacts.add(0,ContactTask3("Anton", 89670604004, null))
    listOfContacts.add(1, ContactTask3("Ivan", 89999999999, "Kotlin Sprint"))

    for (i in 0..listOfContacts.size)
        listOfContacts[i].print()

}

class ContactTask3(val name: String, val number: Long, val company: String? = null){
    val companyToPrint: String = company ?: "не указано"
    fun print(){
        println("Имя:$name")
        println("Номер:$number")
        println("Компания:$companyToPrint")
    }

}