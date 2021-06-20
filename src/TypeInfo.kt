/**
 *
 */
class TypeInfo
/**
 *
 */
const val MAX_EXPERIENCE: Int = 5000

/**
 *
 */
fun main() {
    val playerName = "Estragon"
    var hasSteed = false
    val nameTavern = "Horn of Unicorn"
    var numberCoins = 50
    var menuAlco = mutableMapOf<String,Int>("Honey" to 5, "Wine" to 15, "Beer" to 10)
    var experiencePoint = 5
    experiencePoint += 15
    experiencePoint?.let { println("$playerName ${it + 5}") }
    println("${magicMirror(playerName)}")

}
fun magicMirror(str: String): String{
    return str.reversed()
}