class Calendar(var day: String, var month: String, var year: String) {

    fun selectCurrentDay() {
        day = "d123d"
        month = "m45m"
        year = "y6y"
    }
}
fun createCalendar() =
    Calendar("-", "-", "-")
fun main() { val calendar = createCalendar()
    calendar.selectCurrentDay()
    println("${calendar.day} ${calendar.month}\n  ${calendar.year}\n".repeat(5) + "jkbn")
    val a = readLine()?.toInt()
}