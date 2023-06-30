fun main(){

    val tablesReserveToday = 13
    val tablesReserveTomorrow = TABLE_IN_REST - 4
    println("Доступность столиков на сегодня: ${(TABLE_IN_REST-tablesReserveToday) > 0}. Доступность столиков на завтра: ${(TABLE_IN_REST-tablesReserveTomorrow) > 0}")

}
const val TABLE_IN_REST = 13